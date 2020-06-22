#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "PipelineExecutionManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


PipelineExecutionManager::PipelineExecutionManager()
{

}

PipelineExecutionManager::~PipelineExecutionManager()
{

}

static gboolean __PipelineExecutionManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __PipelineExecutionManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__PipelineExecutionManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool advancePipelineExecutionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool advancePipelineExecutionHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Content-Type: ");
		headerString.append(stringify(&contentType, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("std::string")) {
		node = converttoJson(&body, "std::string", "");
	}
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));
	string s_phaseId("{");
	s_phaseId.append("phaseId");
	s_phaseId.append("}");
	pos = url.find(s_phaseId);
	url.erase(pos, s_phaseId.length());
	url.insert(pos, stringify(&phaseId, "std::string"));
	string s_stepId("{");
	s_stepId.append("stepId");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = advancePipelineExecutionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), advancePipelineExecutionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::advancePipelineExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return advancePipelineExecutionHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, true);
}

bool PipelineExecutionManager::advancePipelineExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return advancePipelineExecutionHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, false);
}

static bool cancelPipelineExecutionStepProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool cancelPipelineExecutionStepHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Content-Type: ");
		headerString.append(stringify(&contentType, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("std::string")) {
		node = converttoJson(&body, "std::string", "");
	}
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));
	string s_phaseId("{");
	s_phaseId.append("phaseId");
	s_phaseId.append("}");
	pos = url.find(s_phaseId);
	url.erase(pos, s_phaseId.length());
	url.insert(pos, stringify(&phaseId, "std::string"));
	string s_stepId("{");
	s_stepId.append("stepId");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelPipelineExecutionStepProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelPipelineExecutionStepProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::cancelPipelineExecutionStepAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return cancelPipelineExecutionStepHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, true);
}

bool PipelineExecutionManager::cancelPipelineExecutionStepSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return cancelPipelineExecutionStepHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, false);
}

static bool getCurrentExecutionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PipelineExecution, Error, void* )
	= reinterpret_cast<void(*)(PipelineExecution, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PipelineExecution out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PipelineExecution")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PipelineExecution", "PipelineExecution");
			json_node_free(pJson);

			if ("PipelineExecution" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getCurrentExecutionHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCurrentExecutionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCurrentExecutionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::getCurrentExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData)
{
	return getCurrentExecutionHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool PipelineExecutionManager::getCurrentExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData)
{
	return getCurrentExecutionHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getExecutionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PipelineExecution, Error, void* )
	= reinterpret_cast<void(*)(PipelineExecution, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PipelineExecution out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PipelineExecution")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PipelineExecution", "PipelineExecution");
			json_node_free(pJson);

			if ("PipelineExecution" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getExecutionHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getExecutionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getExecutionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::getExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData)
{
	return getExecutionHelper(accessToken,
	programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool PipelineExecutionManager::getExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData)
{
	return getExecutionHelper(accessToken,
	programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getExecutionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	= reinterpret_cast<void(*)(PipelineExecutionListRepresentation, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PipelineExecutionListRepresentation out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PipelineExecutionListRepresentation")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PipelineExecutionListRepresentation", "PipelineExecutionListRepresentation");
			json_node_free(pJson);

			if ("PipelineExecutionListRepresentation" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getExecutionsHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string start, int limit, 
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&start, "std::string");
	queryParams.insert(pair<string, string>("start", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/executions");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getExecutionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getExecutionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::getExecutionsAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string start, int limit, 
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	, void* userData)
{
	return getExecutionsHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit, 
	handler, userData, true);
}

bool PipelineExecutionManager::getExecutionsSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string start, int limit, 
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	, void* userData)
{
	return getExecutionsHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit, 
	handler, userData, false);
}

static bool getStepLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool getStepLogsHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string file, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("Accept: ");
		headerString.append(stringify(&accept, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&file, "std::string");
	queryParams.insert(pair<string, string>("file", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("file");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));
	string s_phaseId("{");
	s_phaseId.append("phaseId");
	s_phaseId.append("}");
	pos = url.find(s_phaseId);
	url.erase(pos, s_phaseId.length());
	url.insert(pos, stringify(&phaseId, "std::string"));
	string s_stepId("{");
	s_stepId.append("stepId");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getStepLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getStepLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::getStepLogsAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string file, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getStepLogsHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept, 
	handler, userData, true);
}

bool PipelineExecutionManager::getStepLogsSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string file, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getStepLogsHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept, 
	handler, userData, false);
}

static bool startPipelineProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool startPipelineHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Content-Type: ");
		headerString.append(stringify(&contentType, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = startPipelineProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), startPipelineProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::startPipelineAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return startPipelineHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, 
	handler, userData, true);
}

bool PipelineExecutionManager::startPipelineSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return startPipelineHelper(accessToken,
	programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, 
	handler, userData, false);
}

static bool stepMetricProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PipelineStepMetrics, Error, void* )
	= reinterpret_cast<void(*)(PipelineStepMetrics, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PipelineStepMetrics out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PipelineStepMetrics")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PipelineStepMetrics", "PipelineStepMetrics");
			json_node_free(pJson);

			if ("PipelineStepMetrics" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool stepMetricHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineStepMetrics, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));
	string s_phaseId("{");
	s_phaseId.append("phaseId");
	s_phaseId.append("}");
	pos = url.find(s_phaseId);
	url.erase(pos, s_phaseId.length());
	url.insert(pos, stringify(&phaseId, "std::string"));
	string s_stepId("{");
	s_stepId.append("stepId");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = stepMetricProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), stepMetricProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::stepMetricAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineStepMetrics, Error, void* )
	, void* userData)
{
	return stepMetricHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool PipelineExecutionManager::stepMetricSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineStepMetrics, Error, void* )
	, void* userData)
{
	return stepMetricHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool stepStateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PipelineExecutionStepState, Error, void* )
	= reinterpret_cast<void(*)(PipelineExecutionStepState, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PipelineExecutionStepState out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PipelineExecutionStepState")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PipelineExecutionStepState", "PipelineExecutionStepState");
			json_node_free(pJson);

			if ("PipelineExecutionStepState" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool stepStateHelper(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecutionStepState, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	{
		string headerString("x-gw-ims-org-id: ");
		headerString.append(stringify(&xGwImsOrgId, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("Authorization: ");
		headerString.append(stringify(&authorization, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	{
		string headerString("x-api-key: ");
		headerString.append(stringify(&xApiKey, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_pipelineId("{");
	s_pipelineId.append("pipelineId");
	s_pipelineId.append("}");
	pos = url.find(s_pipelineId);
	url.erase(pos, s_pipelineId.length());
	url.insert(pos, stringify(&pipelineId, "std::string"));
	string s_executionId("{");
	s_executionId.append("executionId");
	s_executionId.append("}");
	pos = url.find(s_executionId);
	url.erase(pos, s_executionId.length());
	url.insert(pos, stringify(&executionId, "std::string"));
	string s_phaseId("{");
	s_phaseId.append("phaseId");
	s_phaseId.append("}");
	pos = url.find(s_phaseId);
	url.erase(pos, s_phaseId.length());
	url.insert(pos, stringify(&phaseId, "std::string"));
	string s_stepId("{");
	s_stepId.append("stepId");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = stepStateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (PipelineExecutionManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), stepStateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PipelineExecutionManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PipelineExecutionManager::stepStateAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecutionStepState, Error, void* )
	, void* userData)
{
	return stepStateHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool PipelineExecutionManager::stepStateSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecutionStepState, Error, void* )
	, void* userData)
{
	return stepStateHelper(accessToken,
	programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

