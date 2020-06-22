#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "EnvironmentsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


EnvironmentsManager::EnvironmentsManager()
{

}

EnvironmentsManager::~EnvironmentsManager()
{

}

static gboolean __EnvironmentsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __EnvironmentsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__EnvironmentsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteEnvironmentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Environment, Error, void* )
	= reinterpret_cast<void(*)(Environment, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Environment out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Environment")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Environment", "Environment");
			json_node_free(pJson);

			if ("Environment" == "std::string") {
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

static bool deleteEnvironmentHelper(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
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

	string url("/api/program/{programId}/environment/{environmentId}");
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteEnvironmentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteEnvironmentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EnvironmentsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EnvironmentsManager::deleteEnvironmentAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData)
{
	return deleteEnvironmentHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool EnvironmentsManager::deleteEnvironmentSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData)
{
	return deleteEnvironmentHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool downloadLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool downloadLogsHelper(char * accessToken,
	std::string programId, std::string environmentId, std::string service, std::string name, std::string date, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string accept, 
	
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
		string headerString("Accept: ");
		headerString.append(stringify(&accept, "std::string"));
		headerList = curl_slist_append(headerList, headerString.c_str());
	}

	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&service, "std::string");
	queryParams.insert(pair<string, string>("service", itemAtq));


	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>("name", itemAtq));


	itemAtq = stringify(&date, "std::string");
	queryParams.insert(pair<string, string>("date", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/environment/{environmentId}/logs/download");
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
		NetClient::easycurl(EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = downloadLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), downloadLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EnvironmentsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EnvironmentsManager::downloadLogsAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string service, std::string name, std::string date, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return downloadLogsHelper(accessToken,
	programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept, 
	handler, userData, true);
}

bool EnvironmentsManager::downloadLogsSync(char * accessToken,
	std::string programId, std::string environmentId, std::string service, std::string name, std::string date, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return downloadLogsHelper(accessToken,
	programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept, 
	handler, userData, false);
}

static bool getEnvironmentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Environment, Error, void* )
	= reinterpret_cast<void(*)(Environment, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Environment out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Environment")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Environment", "Environment");
			json_node_free(pJson);

			if ("Environment" == "std::string") {
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

static bool getEnvironmentHelper(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
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

	string url("/api/program/{programId}/environment/{environmentId}");
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
		NetClient::easycurl(EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getEnvironmentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getEnvironmentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EnvironmentsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EnvironmentsManager::getEnvironmentAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData)
{
	return getEnvironmentHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool EnvironmentsManager::getEnvironmentSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData)
{
	return getEnvironmentHelper(accessToken,
	programId, environmentId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getEnvironmentLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EnvironmentLogs, Error, void* )
	= reinterpret_cast<void(*)(EnvironmentLogs, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EnvironmentLogs out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EnvironmentLogs")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EnvironmentLogs", "EnvironmentLogs");
			json_node_free(pJson);

			if ("EnvironmentLogs" == "std::string") {
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

static bool getEnvironmentLogsHelper(char * accessToken,
	std::string programId, std::string environmentId, int days, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::list<std::string> service, std::list<std::string> name, 
	void(* handler)(EnvironmentLogs, Error, void* )
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
	
	for (std::list
	<std::string>::iterator queryIter = service.begin(); queryIter != service.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("service", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = name.begin(); queryIter != name.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("name", itemAt));
	}
	

	itemAtq = stringify(&days, "int");
	queryParams.insert(pair<string, string>("days", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/environment/{environmentId}/logs");
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
		NetClient::easycurl(EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getEnvironmentLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getEnvironmentLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EnvironmentsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EnvironmentsManager::getEnvironmentLogsAsync(char * accessToken,
	std::string programId, std::string environmentId, int days, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::list<std::string> service, std::list<std::string> name, 
	void(* handler)(EnvironmentLogs, Error, void* )
	, void* userData)
{
	return getEnvironmentLogsHelper(accessToken,
	programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name, 
	handler, userData, true);
}

bool EnvironmentsManager::getEnvironmentLogsSync(char * accessToken,
	std::string programId, std::string environmentId, int days, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::list<std::string> service, std::list<std::string> name, 
	void(* handler)(EnvironmentLogs, Error, void* )
	, void* userData)
{
	return getEnvironmentLogsHelper(accessToken,
	programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name, 
	handler, userData, false);
}

static bool getEnvironmentsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EnvironmentList, Error, void* )
	= reinterpret_cast<void(*)(EnvironmentList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EnvironmentList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EnvironmentList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EnvironmentList", "EnvironmentList");
			json_node_free(pJson);

			if ("EnvironmentList" == "std::string") {
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

static bool getEnvironmentsHelper(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string type, 
	void(* handler)(EnvironmentList, Error, void* )
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
	

	itemAtq = stringify(&type, "std::string");
	queryParams.insert(pair<string, string>("type", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("type");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/program/{programId}/environments");
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
		NetClient::easycurl(EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getEnvironmentsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EnvironmentsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getEnvironmentsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EnvironmentsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EnvironmentsManager::getEnvironmentsAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string type, 
	void(* handler)(EnvironmentList, Error, void* )
	, void* userData)
{
	return getEnvironmentsHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, type, 
	handler, userData, true);
}

bool EnvironmentsManager::getEnvironmentsSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string type, 
	void(* handler)(EnvironmentList, Error, void* )
	, void* userData)
{
	return getEnvironmentsHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, type, 
	handler, userData, false);
}

