#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProgramList__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProgramList__links::ProgramList__links()
{
	//__init();
}

ProgramList__links::~ProgramList__links()
{
	//__cleanup();
}

void
ProgramList__links::__init()
{
	//next = new HalLink();
	//prev = new HalLink();
	//self = new HalLink();
}

void
ProgramList__links::__cleanup()
{
	//if(next != NULL) {
	//
	//delete next;
	//next = NULL;
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
ProgramList__links::fromJson(char* jsonStr)
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

ProgramList__links::ProgramList__links(char* json)
{
	this->fromJson(json);
}

char*
ProgramList__links::toJson()
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
ProgramList__links::getNext()
{
	return next;
}

void
ProgramList__links::setNext(HalLink  next)
{
	this->next = next;
}

HalLink
ProgramList__links::getPrev()
{
	return prev;
}

void
ProgramList__links::setPrev(HalLink  prev)
{
	this->prev = prev;
}

HalLink
ProgramList__links::getSelf()
{
	return self;
}

void
ProgramList__links::setSelf(HalLink  self)
{
	this->self = self;
}


