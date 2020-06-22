#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Program__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Program__links::Program__links()
{
	//__init();
}

Program__links::~Program__links()
{
	//__cleanup();
}

void
Program__links::__init()
{
	//httpnsadobecomadobecloudrelpipelines = new HalLink();
	//httpnsadobecomadobecloudrelenvironments = new HalLink();
	//httpnsadobecomadobecloudrelrepositories = new HalLink();
	//self = new HalLink();
}

void
Program__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelpipelines != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipelines;
	//httpnsadobecomadobecloudrelpipelines = NULL;
	//}
	//if(httpnsadobecomadobecloudrelenvironments != NULL) {
	//
	//delete httpnsadobecomadobecloudrelenvironments;
	//httpnsadobecomadobecloudrelenvironments = NULL;
	//}
	//if(httpnsadobecomadobecloudrelrepositories != NULL) {
	//
	//delete httpnsadobecomadobecloudrelrepositories;
	//httpnsadobecomadobecloudrelrepositories = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
Program__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpnsadobecomadobecloudrelpipelinesKey = "http://ns.adobe.com/adobecloud/rel/pipelines";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelinesKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipelines, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipelines);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelenvironmentsKey = "http://ns.adobe.com/adobecloud/rel/environments";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelenvironmentsKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelenvironments, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelenvironments);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelrepositoriesKey = "http://ns.adobe.com/adobecloud/rel/repositories";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelrepositoriesKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelrepositories, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelrepositories);
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

Program__links::Program__links(char* json)
{
	this->fromJson(json);
}

char*
Program__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipelines();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipelines());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelinesKey = "http://ns.adobe.com/adobecloud/rel/pipelines";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelinesKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelenvironments();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelenvironments());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelenvironmentsKey = "http://ns.adobe.com/adobecloud/rel/environments";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelenvironmentsKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelrepositories();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelrepositories());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelrepositoriesKey = "http://ns.adobe.com/adobecloud/rel/repositories";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelrepositoriesKey, node);
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
Program__links::getHttpnsadobecomadobecloudrelpipelines()
{
	return httpnsadobecomadobecloudrelpipelines;
}

void
Program__links::setHttpnsadobecomadobecloudrelpipelines(HalLink  httpnsadobecomadobecloudrelpipelines)
{
	this->httpnsadobecomadobecloudrelpipelines = httpnsadobecomadobecloudrelpipelines;
}

HalLink
Program__links::getHttpnsadobecomadobecloudrelenvironments()
{
	return httpnsadobecomadobecloudrelenvironments;
}

void
Program__links::setHttpnsadobecomadobecloudrelenvironments(HalLink  httpnsadobecomadobecloudrelenvironments)
{
	this->httpnsadobecomadobecloudrelenvironments = httpnsadobecomadobecloudrelenvironments;
}

HalLink
Program__links::getHttpnsadobecomadobecloudrelrepositories()
{
	return httpnsadobecomadobecloudrelrepositories;
}

void
Program__links::setHttpnsadobecomadobecloudrelrepositories(HalLink  httpnsadobecomadobecloudrelrepositories)
{
	this->httpnsadobecomadobecloudrelrepositories = httpnsadobecomadobecloudrelrepositories;
}

HalLink
Program__links::getSelf()
{
	return self;
}

void
Program__links::setSelf(HalLink  self)
{
	this->self = self;
}


