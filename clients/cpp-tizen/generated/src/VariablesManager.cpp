#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "VariablesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


VariablesManager::VariablesManager()
{

}

VariablesManager::~VariablesManager()
{

}

static gboolean __VariablesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __VariablesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__VariablesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getEnvironmentVariablesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VariableList, Error, void* )
	= reinterpret_cast<void(*)(VariableList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VariableList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VariableList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VariableList", "VariableList");
			json_node_free(pJson);

			if ("VariableList" == "std::string") {
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

static bool getEnvironmentVariablesHelper(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(VariableList, Error, void* )
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

	string url("/api/program/{programId}/environment/{environmentId}/variables");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_environmentId("{");
	s_environmentId.append("environmentId");
	s_environmentId.append("}");
	pos = url.find(s_environmentId);
	url.erase(pos, s_environmentId.length());
	url.insert(pos, stringify(&environmentId, "std::string"));

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
		NetClient::easycurl(VariablesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getEnvironmentVariablesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VariablesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getEnvironmentVariablesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VariablesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VariablesManager::getEnvironmentVariablesAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(VariableList, Error, void* )
	, void* userData)
{
	return getEnvironmentVariablesHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool VariablesManager::getEnvironmentVariablesSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(VariableList, Error, void* )
	, void* userData)
{
	return getEnvironmentVariablesHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool patchEnvironmentVariablesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VariableList, Error, void* )
	= reinterpret_cast<void(*)(VariableList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VariableList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VariableList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VariableList", "VariableList");
			json_node_free(pJson);

			if ("VariableList" == "std::string") {
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

static bool patchEnvironmentVariablesHelper(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::list<Variable> body, 
	void(* handler)(VariableList, Error, void* )
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
	//TODO: Map Container
	if (isprimitive("Variable")) {
		node = converttoJson(&body, "Variable", "array");
	} else {
		node = json_node_alloc();
		json_array = json_array_new();
		for (std::list
			<Variable>::iterator bodyIter = body.begin(); bodyIter != body.end(); ++bodyIter) {
			Variable itemAt = (*bodyIter);
			char *jsonStr =  itemAt.toJson();
			JsonNode *node_temp = json_from_string(jsonStr, NULL);
			g_free(static_cast<gpointer>(jsonStr));
			json_array_add_element(json_array, node_temp);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
	}
	




	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/api/program/{programId}/environment/{environmentId}/variables");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_environmentId("{");
	s_environmentId.append("environmentId");
	s_environmentId.append("}");
	pos = url.find(s_environmentId);
	url.erase(pos, s_environmentId.length());
	url.insert(pos, stringify(&environmentId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(VariablesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = patchEnvironmentVariablesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VariablesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), patchEnvironmentVariablesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VariablesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VariablesManager::patchEnvironmentVariablesAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::list<Variable> body, 
	void(* handler)(VariableList, Error, void* )
	, void* userData)
{
	return patchEnvironmentVariablesHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, true);
}

bool VariablesManager::patchEnvironmentVariablesSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::list<Variable> body, 
	void(* handler)(VariableList, Error, void* )
	, void* userData)
{
	return patchEnvironmentVariablesHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, 
	handler, userData, false);
}

