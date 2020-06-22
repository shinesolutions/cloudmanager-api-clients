#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ProgramsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ProgramsManager::ProgramsManager()
{

}

ProgramsManager::~ProgramsManager()
{

}

static gboolean __ProgramsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ProgramsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ProgramsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteProgramProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Program, Error, void* )
	= reinterpret_cast<void(*)(Program, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Program out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Program")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Program", "Program");
			json_node_free(pJson);

			if ("Program" == "std::string") {
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

static bool deleteProgramHelper(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
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

	string url("/api/program/{programId}");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteProgramProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteProgramProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProgramsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProgramsManager::deleteProgramAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData)
{
	return deleteProgramHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool ProgramsManager::deleteProgramSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData)
{
	return deleteProgramHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getProgramProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Program, Error, void* )
	= reinterpret_cast<void(*)(Program, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Program out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Program")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Program", "Program");
			json_node_free(pJson);

			if ("Program" == "std::string") {
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

static bool getProgramHelper(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
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

	string url("/api/program/{programId}");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));

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
		NetClient::easycurl(ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getProgramProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getProgramProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProgramsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProgramsManager::getProgramAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData)
{
	return getProgramHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool ProgramsManager::getProgramSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData)
{
	return getProgramHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getProgramsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProgramList, Error, void* )
	= reinterpret_cast<void(*)(ProgramList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProgramList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProgramList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProgramList", "ProgramList");
			json_node_free(pJson);

			if ("ProgramList" == "std::string") {
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

static bool getProgramsHelper(char * accessToken,
	std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(ProgramList, Error, void* )
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

	string url("/api/programs");
	int pos;


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
		NetClient::easycurl(ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getProgramsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProgramsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getProgramsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProgramsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProgramsManager::getProgramsAsync(char * accessToken,
	std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(ProgramList, Error, void* )
	, void* userData)
{
	return getProgramsHelper(accessToken,
	xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool ProgramsManager::getProgramsSync(char * accessToken,
	std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(ProgramList, Error, void* )
	, void* userData)
{
	return getProgramsHelper(accessToken,
	xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

