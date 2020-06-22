#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Environment__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Environment__links::Environment__links()
{
	//__init();
}

Environment__links::~Environment__links()
{
	//__cleanup();
}

void
Environment__links::__init()
{
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//httpnsadobecomadobecloudrelpipeline = new HalLink();
	//httpnsadobecomadobecloudrelauthor = new HalLink();
	//httpnsadobecomadobecloudrelpublish = new HalLink();
	//httpnsadobecomadobecloudreldeveloperConsole = new HalLink();
	//httpnsadobecomadobecloudrellogs = new HalLink();
	//httpnsadobecomadobecloudrelvariables = new HalLink();
	//self = new HalLink();
}

void
Environment__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelprogram != NULL) {
	//
	//delete httpnsadobecomadobecloudrelprogram;
	//httpnsadobecomadobecloudrelprogram = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipeline != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipeline;
	//httpnsadobecomadobecloudrelpipeline = NULL;
	//}
	//if(httpnsadobecomadobecloudrelauthor != NULL) {
	//
	//delete httpnsadobecomadobecloudrelauthor;
	//httpnsadobecomadobecloudrelauthor = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpublish != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpublish;
	//httpnsadobecomadobecloudrelpublish = NULL;
	//}
	//if(httpnsadobecomadobecloudreldeveloperConsole != NULL) {
	//
	//delete httpnsadobecomadobecloudreldeveloperConsole;
	//httpnsadobecomadobecloudreldeveloperConsole = NULL;
	//}
	//if(httpnsadobecomadobecloudrellogs != NULL) {
	//
	//delete httpnsadobecomadobecloudrellogs;
	//httpnsadobecomadobecloudrellogs = NULL;
	//}
	//if(httpnsadobecomadobecloudrelvariables != NULL) {
	//
	//delete httpnsadobecomadobecloudrelvariables;
	//httpnsadobecomadobecloudrelvariables = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
Environment__links::fromJson(char* jsonStr)
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
	const gchar *httpnsadobecomadobecloudrelpipelineKey = "http://ns.adobe.com/adobecloud/rel/pipeline";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelineKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipeline, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipeline);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelauthorKey = "http://ns.adobe.com/adobecloud/rel/author";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelauthorKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelauthor, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelauthor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpublishKey = "http://ns.adobe.com/adobecloud/rel/publish";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpublishKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpublish, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpublish);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudreldeveloperConsoleKey = "http://ns.adobe.com/adobecloud/rel/developerConsole";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudreldeveloperConsoleKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudreldeveloperConsole, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudreldeveloperConsole);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrellogsKey = "http://ns.adobe.com/adobecloud/rel/logs";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrellogsKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrellogs, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrellogs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelvariablesKey = "http://ns.adobe.com/adobecloud/rel/variables";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelvariablesKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelvariables, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelvariables);
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

Environment__links::Environment__links(char* json)
{
	this->fromJson(json);
}

char*
Environment__links::toJson()
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
		HalLink obj = getHttpnsadobecomadobecloudrelpipeline();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipeline());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelineKey = "http://ns.adobe.com/adobecloud/rel/pipeline";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelineKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelauthor();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelauthor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelauthorKey = "http://ns.adobe.com/adobecloud/rel/author";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelauthorKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpublish();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpublish());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpublishKey = "http://ns.adobe.com/adobecloud/rel/publish";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpublishKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudreldeveloperConsole();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudreldeveloperConsole());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudreldeveloperConsoleKey = "http://ns.adobe.com/adobecloud/rel/developerConsole";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudreldeveloperConsoleKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrellogs();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrellogs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrellogsKey = "http://ns.adobe.com/adobecloud/rel/logs";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrellogsKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelvariables();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelvariables());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelvariablesKey = "http://ns.adobe.com/adobecloud/rel/variables";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelvariablesKey, node);
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
Environment__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
Environment__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudrelpipeline()
{
	return httpnsadobecomadobecloudrelpipeline;
}

void
Environment__links::setHttpnsadobecomadobecloudrelpipeline(HalLink  httpnsadobecomadobecloudrelpipeline)
{
	this->httpnsadobecomadobecloudrelpipeline = httpnsadobecomadobecloudrelpipeline;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudrelauthor()
{
	return httpnsadobecomadobecloudrelauthor;
}

void
Environment__links::setHttpnsadobecomadobecloudrelauthor(HalLink  httpnsadobecomadobecloudrelauthor)
{
	this->httpnsadobecomadobecloudrelauthor = httpnsadobecomadobecloudrelauthor;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudrelpublish()
{
	return httpnsadobecomadobecloudrelpublish;
}

void
Environment__links::setHttpnsadobecomadobecloudrelpublish(HalLink  httpnsadobecomadobecloudrelpublish)
{
	this->httpnsadobecomadobecloudrelpublish = httpnsadobecomadobecloudrelpublish;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudreldeveloperConsole()
{
	return httpnsadobecomadobecloudreldeveloperConsole;
}

void
Environment__links::setHttpnsadobecomadobecloudreldeveloperConsole(HalLink  httpnsadobecomadobecloudreldeveloperConsole)
{
	this->httpnsadobecomadobecloudreldeveloperConsole = httpnsadobecomadobecloudreldeveloperConsole;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudrellogs()
{
	return httpnsadobecomadobecloudrellogs;
}

void
Environment__links::setHttpnsadobecomadobecloudrellogs(HalLink  httpnsadobecomadobecloudrellogs)
{
	this->httpnsadobecomadobecloudrellogs = httpnsadobecomadobecloudrellogs;
}

HalLink
Environment__links::getHttpnsadobecomadobecloudrelvariables()
{
	return httpnsadobecomadobecloudrelvariables;
}

void
Environment__links::setHttpnsadobecomadobecloudrelvariables(HalLink  httpnsadobecomadobecloudrelvariables)
{
	this->httpnsadobecomadobecloudrelvariables = httpnsadobecomadobecloudrelvariables;
}

HalLink
Environment__links::getSelf()
{
	return self;
}

void
Environment__links::setSelf(HalLink  self)
{
	this->self = self;
}


