#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentLogs__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentLogs__links::EnvironmentLogs__links()
{
	//__init();
}

EnvironmentLogs__links::~EnvironmentLogs__links()
{
	//__cleanup();
}

void
EnvironmentLogs__links::__init()
{
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//self = new HalLink();
}

void
EnvironmentLogs__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelprogram != NULL) {
	//
	//delete httpnsadobecomadobecloudrelprogram;
	//httpnsadobecomadobecloudrelprogram = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
EnvironmentLogs__links::fromJson(char* jsonStr)
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
	const gchar *selfKey = "self";
	node = json_object_get_member(pJsonObject, selfKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&self, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&self);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EnvironmentLogs__links::EnvironmentLogs__links(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentLogs__links::toJson()
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
		HalLink obj = getSelf();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getSelf());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *selfKey = "self";
	json_object_set_member(pJsonObject, selfKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

HalLink
EnvironmentLogs__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
EnvironmentLogs__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
EnvironmentLogs__links::getSelf()
{
	return self;
}

void
EnvironmentLogs__links::setSelf(HalLink  self)
{
	this->self = self;
}


