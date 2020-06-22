#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BranchesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BranchesManager::BranchesManager()
{

}

BranchesManager::~BranchesManager()
{

}

static gboolean __BranchesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BranchesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BranchesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getBranchesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BranchList, Error, void* )
	= reinterpret_cast<void(*)(BranchList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BranchList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BranchList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BranchList", "BranchList");
			json_node_free(pJson);

			if ("BranchList" == "std::string") {
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

static bool getBranchesHelper(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(BranchList, Error, void* )
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

	string url("/api/program/{programId}/repository/{repositoryId}/branches");
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
		NetClient::easycurl(BranchesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBranchesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BranchesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBranchesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BranchesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BranchesManager::getBranchesAsync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(BranchList, Error, void* )
	, void* userData)
{
	return getBranchesHelper(accessToken,
	programId, repositoryId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, true);
}

bool BranchesManager::getBranchesSync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(BranchList, Error, void* )
	, void* userData)
{
	return getBranchesHelper(accessToken,
	programId, repositoryId, xGwImsOrgId, authorization, xApiKey, 
	handler, userData, false);
}

