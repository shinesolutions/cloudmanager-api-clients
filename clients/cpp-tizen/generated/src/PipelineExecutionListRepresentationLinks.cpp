#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecutionListRepresentation__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecutionListRepresentation__links::PipelineExecutionListRepresentation__links()
{
	//__init();
}

PipelineExecutionListRepresentation__links::~PipelineExecutionListRepresentation__links()
{
	//__cleanup();
}

void
PipelineExecutionListRepresentation__links::__init()
{
	//next = new HalLink();
	//page = new HalLink();
	//prev = new HalLink();
	//self = new HalLink();
}

void
PipelineExecutionListRepresentation__links::__cleanup()
{
	//if(next != NULL) {
	//
	//delete next;
	//next = NULL;
	//}
	//if(page != NULL) {
	//
	//delete page;
	//page = NULL;
	//}
	//if(prev != NULL) {
	//
	//delete prev;
	//prev = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
PipelineExecutionListRepresentation__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nextKey = "next";
	node = json_object_get_member(pJsonObject, nextKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&next, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&next);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pageKey = "page";
	node = json_object_get_member(pJsonObject, pageKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&page, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&page);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prevKey = "prev";
	node = json_object_get_member(pJsonObject, prevKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&prev, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&prev);
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

PipelineExecutionListRepresentation__links::PipelineExecutionListRepresentation__links(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecutionListRepresentation__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getNext();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getNext());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nextKey = "next";
	json_object_set_member(pJsonObject, nextKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getPage();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getPage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pageKey = "page";
	json_object_set_member(pJsonObject, pageKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getPrev();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getPrev());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prevKey = "prev";
	json_object_set_member(pJsonObject, prevKey, node);
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
PipelineExecutionListRepresentation__links::getNext()
{
	return next;
}

void
PipelineExecutionListRepresentation__links::setNext(HalLink  next)
{
	this->next = next;
}

HalLink
PipelineExecutionListRepresentation__links::getPage()
{
	return page;
}

void
PipelineExecutionListRepresentation__links::setPage(HalLink  page)
{
	this->page = page;
}

HalLink
PipelineExecutionListRepresentation__links::getPrev()
{
	return prev;
}

void
PipelineExecutionListRepresentation__links::setPrev(HalLink  prev)
{
	this->prev = prev;
}

HalLink
PipelineExecutionListRepresentation__links::getSelf()
{
	return self;
}

void
PipelineExecutionListRepresentation__links::setSelf(HalLink  self)
{
	this->self = self;
}


