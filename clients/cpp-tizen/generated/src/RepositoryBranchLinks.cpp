#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RepositoryBranch__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RepositoryBranch__links::RepositoryBranch__links()
{
	//__init();
}

RepositoryBranch__links::~RepositoryBranch__links()
{
	//__cleanup();
}

void
RepositoryBranch__links::__init()
{
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//httpnsadobecomadobecloudrelrepository = new HalLink();
}

void
RepositoryBranch__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelprogram != NULL) {
	//
	//delete httpnsadobecomadobecloudrelprogram;
	//httpnsadobecomadobecloudrelprogram = NULL;
	//}
	//if(httpnsadobecomadobecloudrelrepository != NULL) {
	//
	//delete httpnsadobecomadobecloudrelrepository;
	//httpnsadobecomadobecloudrelrepository = NULL;
	//}
	//
}

void
RepositoryBranch__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpnsadobecomadobecloudrelprogramKey = "http://ns.adobe.com/adobecloud/rel/program";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelprogramKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelprogram, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelprogram);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelrepositoryKey = "http://ns.adobe.com/adobecloud/rel/repository";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelrepositoryKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelrepository, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelrepository);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RepositoryBranch__links::RepositoryBranch__links(char* json)
{
	this->fromJson(json);
}

char*
RepositoryBranch__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelprogram();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelprogram());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelprogramKey = "http://ns.adobe.com/adobecloud/rel/program";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelprogramKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelrepository();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelrepository());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelrepositoryKey = "http://ns.adobe.com/adobecloud/rel/repository";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelrepositoryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

HalLink
RepositoryBranch__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
RepositoryBranch__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
RepositoryBranch__links::getHttpnsadobecomadobecloudrelrepository()
{
	return httpnsadobecomadobecloudrelrepository;
}

void
RepositoryBranch__links::setHttpnsadobecomadobecloudrelrepository(HalLink  httpnsadobecomadobecloudrelrepository)
{
	this->httpnsadobecomadobecloudrelrepository = httpnsadobecomadobecloudrelrepository;
}


