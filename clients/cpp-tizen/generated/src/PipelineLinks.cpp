#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pipeline__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pipeline__links::Pipeline__links()
{
	//__init();
}

Pipeline__links::~Pipeline__links()
{
	//__cleanup();
}

void
Pipeline__links::__init()
{
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//httpnsadobecomadobecloudrelexecution = new HalLink();
	//httpnsadobecomadobecloudrelexecutions = new HalLink();
	//httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution = new HalLink();
	//self = new HalLink();
}

void
Pipeline__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelprogram != NULL) {
	//
	//delete httpnsadobecomadobecloudrelprogram;
	//httpnsadobecomadobecloudrelprogram = NULL;
	//}
	//if(httpnsadobecomadobecloudrelexecution != NULL) {
	//
	//delete httpnsadobecomadobecloudrelexecution;
	//httpnsadobecomadobecloudrelexecution = NULL;
	//}
	//if(httpnsadobecomadobecloudrelexecutions != NULL) {
	//
	//delete httpnsadobecomadobecloudrelexecutions;
	//httpnsadobecomadobecloudrelexecutions = NULL;
	//}
	//if(httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution != NULL) {
	//
	//delete httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution;
	//httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
Pipeline__links::fromJson(char* jsonStr)
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
	const gchar *httpnsadobecomadobecloudrelexecutionKey = "http://ns.adobe.com/adobecloud/rel/execution";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelexecutionKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelexecution, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelexecution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelexecutionsKey = "http://ns.adobe.com/adobecloud/rel/executions";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelexecutionsKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelexecutions, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelexecutions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelrollbackLastSuccessfulExecutionKey = "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelrollbackLastSuccessfulExecutionKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution);
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

Pipeline__links::Pipeline__links(char* json)
{
	this->fromJson(json);
}

char*
Pipeline__links::toJson()
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
		HalLink obj = getHttpnsadobecomadobecloudrelexecution();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelexecution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelexecutionKey = "http://ns.adobe.com/adobecloud/rel/execution";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelexecutionKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelexecutions();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelexecutions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelexecutionsKey = "http://ns.adobe.com/adobecloud/rel/executions";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelexecutionsKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelrollbackLastSuccessfulExecutionKey = "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelrollbackLastSuccessfulExecutionKey, node);
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
Pipeline__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
Pipeline__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
Pipeline__links::getHttpnsadobecomadobecloudrelexecution()
{
	return httpnsadobecomadobecloudrelexecution;
}

void
Pipeline__links::setHttpnsadobecomadobecloudrelexecution(HalLink  httpnsadobecomadobecloudrelexecution)
{
	this->httpnsadobecomadobecloudrelexecution = httpnsadobecomadobecloudrelexecution;
}

HalLink
Pipeline__links::getHttpnsadobecomadobecloudrelexecutions()
{
	return httpnsadobecomadobecloudrelexecutions;
}

void
Pipeline__links::setHttpnsadobecomadobecloudrelexecutions(HalLink  httpnsadobecomadobecloudrelexecutions)
{
	this->httpnsadobecomadobecloudrelexecutions = httpnsadobecomadobecloudrelexecutions;
}

HalLink
Pipeline__links::getHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution()
{
	return httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution;
}

void
Pipeline__links::setHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution(HalLink  httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution)
{
	this->httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution = httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution;
}

HalLink
Pipeline__links::getSelf()
{
	return self;
}

void
Pipeline__links::setSelf(HalLink  self)
{
	this->self = self;
}


