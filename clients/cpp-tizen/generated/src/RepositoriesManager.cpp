#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "RepositoriesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


RepositoriesManager::RepositoriesManager()
{

}

RepositoriesManager::~RepositoriesManager()
{

}

static gboolean __RepositoriesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __RepositoriesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__RepositoriesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getRepositoriesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RepositoryList, Error, void* )
	= reinterpret_cast<void(*)(RepositoryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RepositoryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RepositoryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RepositoryList", "RepositoryList");
			json_node_free(pJson);

			if ("RepositoryList" == "std::string") {
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

static bool getRepositoriesHelper(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(RepositoryList, Error, void* )
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

	string url("/api/program/{programId}/repositories");
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
		NetClient::easycurl(RepositoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getRepositoriesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RepositoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getRepositoriesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RepositoriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RepositoriesManager::getRepositoriesAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(RepositoryList, Error, void* )
	, void* userData)
{
	return getRepositoriesHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool RepositoriesManager::getRepositoriesSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(RepositoryList, Error, void* )
	, void* userData)
{
	return getRepositoriesHelper(accessToken,
	programId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

static bool getRepositoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Repository, Error, void* )
	= reinterpret_cast<void(*)(Repository, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Repository out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Repository")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Repository", "Repository");
			json_node_free(pJson);

			if ("Repository" == "std::string") {
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

static bool getRepositoryHelper(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Repository, Error, void* )
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

	string url("/api/program/{programId}/repository/{repositoryId}");
	int pos;

	string s_programId("{");
	s_programId.append("programId");
	s_programId.append("}");
	pos = url.find(s_programId);
	url.erase(pos, s_programId.length());
	url.insert(pos, stringify(&programId, "std::string"));
	string s_repositoryId("{");
	s_repositoryId.append("repositoryId");
	s_repositoryId.append("}");
	pos = url.find(s_repositoryId);
	url.erase(pos, s_repositoryId.length());
	url.insert(pos, stringify(&repositoryId, "std::string"));

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
		NetClient::easycurl(RepositoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getRepositoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (RepositoriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getRepositoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RepositoriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RepositoriesManager::getRepositoryAsync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Repository, Error, void* )
	, void* userData)
{
	return getRepositoryHelper(accessToken,
	programId, repositoryId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool RepositoriesManager::getRepositorySync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Repository, Error, void* )
	, void* userData)
{
	return getRepositoryHelper(accessToken,
	programId, repositoryId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

