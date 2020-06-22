#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RequestedPageDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RequestedPageDetails::RequestedPageDetails()
{
	//__init();
}

RequestedPageDetails::~RequestedPageDetails()
{
	//__cleanup();
}

void
RequestedPageDetails::__init()
{
	//start = int(0);
	//limit = int(0);
	//orderBy = std::string();
	//new std::list()std::list> property;
	//type = std::string();
	//next = int(0);
	//prev = int(0);
}

void
RequestedPageDetails::__cleanup()
{
	//if(start != NULL) {
	//
	//delete start;
	//start = NULL;
	//}
	//if(limit != NULL) {
	//
	//delete limit;
	//limit = NULL;
	//}
	//if(orderBy != NULL) {
	//
	//delete orderBy;
	//orderBy = NULL;
	//}
	//if(property != NULL) {
	//property.RemoveAll(true);
	//delete property;
	//property = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
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
	//
}

void
RequestedPageDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *startKey = "start";
	node = json_object_get_member(pJsonObject, startKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start, node, "int", "");
		} else {
			
		}
	}
	const gchar *limitKey = "limit";
	node = json_object_get_member(pJsonObject, limitKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&limit, node, "int", "");
		} else {
			
		}
	}
	const gchar *orderByKey = "orderBy";
	node = json_object_get_member(pJsonObject, orderByKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&orderBy, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propertyKey = "property";
	node = json_object_get_member(pJsonObject, propertyKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			property = new_list;
		}
		
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nextKey = "next";
	node = json_object_get_member(pJsonObject, nextKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&next, node, "int", "");
		} else {
			
		}
	}
	const gchar *prevKey = "prev";
	node = json_object_get_member(pJsonObject, prevKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&prev, node, "int", "");
		} else {
			
		}
	}
}

RequestedPageDetails::RequestedPageDetails(char* json)
{
	this->fromJson(json);
}

char*
RequestedPageDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getStart();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *startKey = "start";
	json_object_set_member(pJsonObject, startKey, node);
	if (isprimitive("int")) {
		int obj = getLimit();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *limitKey = "limit";
	json_object_set_member(pJsonObject, limitKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderBy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *orderByKey = "orderBy";
	json_object_set_member(pJsonObject, orderByKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProperty());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProperty());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *propertyKey = "property";
	json_object_set_member(pJsonObject, propertyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getNext();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nextKey = "next";
	json_object_set_member(pJsonObject, nextKey, node);
	if (isprimitive("int")) {
		int obj = getPrev();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *prevKey = "prev";
	json_object_set_member(pJsonObject, prevKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RequestedPageDetails::getStart()
{
	return start;
}

void
RequestedPageDetails::setStart(int  start)
{
	this->start = start;
}

int
RequestedPageDetails::getLimit()
{
	return limit;
}

void
RequestedPageDetails::setLimit(int  limit)
{
	this->limit = limit;
}

std::string
RequestedPageDetails::getOrderBy()
{
	return orderBy;
}

void
RequestedPageDetails::setOrderBy(std::string  orderBy)
{
	this->orderBy = orderBy;
}

std::list<std::string>
RequestedPageDetails::getProperty()
{
	return property;
}

void
RequestedPageDetails::setProperty(std::list <std::string> property)
{
	this->property = property;
}

std::string
RequestedPageDetails::getType()
{
	return type;
}

void
RequestedPageDetails::setType(std::string  type)
{
	this->type = type;
}

int
RequestedPageDetails::getNext()
{
	return next;
}

void
RequestedPageDetails::setNext(int  next)
{
	this->next = next;
}

int
RequestedPageDetails::getPrev()
{
	return prev;
}

void
RequestedPageDetails::setPrev(int  prev)
{
	this->prev = prev;
}


