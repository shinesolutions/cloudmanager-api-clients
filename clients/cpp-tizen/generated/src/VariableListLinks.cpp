#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VariableList__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VariableList__links::VariableList__links()
{
	//__init();
}

VariableList__links::~VariableList__links()
{
	//__cleanup();
}

void
VariableList__links::__init()
{
	//httpnsadobecomadobecloudrelenvironment = new HalLink();
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//self = new HalLink();
}

void
VariableList__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelenvironment != NULL) {
	//
	//delete httpnsadobecomadobecloudrelenvironment;
	//httpnsadobecomadobecloudrelenvironment = NULL;
	//}
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
VariableList__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpnsadobecomadobecloudrelenvironmentKey = "http://ns.adobe.com/adobecloud/rel/environment";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelenvironmentKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelenvironment, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelenvironment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

VariableList__links::VariableList__links(char* json)
{
	this->fromJson(json);
}

char*
VariableList__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelenvironment();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelenvironment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelenvironmentKey = "http://ns.adobe.com/adobecloud/rel/environment";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelenvironmentKey, node);
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
VariableList__links::getHttpnsadobecomadobecloudrelenvironment()
{
	return httpnsadobecomadobecloudrelenvironment;
}

void
VariableList__links::setHttpnsadobecomadobecloudrelenvironment(HalLink  httpnsadobecomadobecloudrelenvironment)
{
	this->httpnsadobecomadobecloudrelenvironment = httpnsadobecomadobecloudrelenvironment;
}

HalLink
VariableList__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
VariableList__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
VariableList__links::getSelf()
{
	return self;
}

void
VariableList__links::setSelf(HalLink  self)
{
	this->self = self;
}


