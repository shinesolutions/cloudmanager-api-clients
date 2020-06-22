#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentLogs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentLogs::EnvironmentLogs()
{
	//__init();
}

EnvironmentLogs::~EnvironmentLogs()
{
	//__cleanup();
}

void
EnvironmentLogs::__init()
{
	//new std::list()std::list> service;
	//new std::list()std::list> name;
	//days = int(0);
	//_links = new EnvironmentLogs__links();
	//_embedded = new EnvironmentLogs__embedded();
}

void
EnvironmentLogs::__cleanup()
{
	//if(service != NULL) {
	//service.RemoveAll(true);
	//delete service;
	//service = NULL;
	//}
	//if(name != NULL) {
	//name.RemoveAll(true);
	//delete name;
	//name = NULL;
	//}
	//if(days != NULL) {
	//
	//delete days;
	//days = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//if(_embedded != NULL) {
	//
	//delete _embedded;
	//_embedded = NULL;
	//}
	//
}

void
EnvironmentLogs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *serviceKey = "service";
	node = json_object_get_member(pJsonObject, serviceKey);
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
			service = new_list;
		}
		
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
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
			name = new_list;
		}
		
	}
	const gchar *daysKey = "days";
	node = json_object_get_member(pJsonObject, daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&days, node, "int", "");
		} else {
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("EnvironmentLogs__links")) {
			jsonToValue(&_links, node, "EnvironmentLogs__links", "EnvironmentLogs__links");
		} else {
			
			EnvironmentLogs__links* obj = static_cast<EnvironmentLogs__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_embeddedKey = "_embedded";
	node = json_object_get_member(pJsonObject, _embeddedKey);
	if (node !=NULL) {
	

		if (isprimitive("EnvironmentLogs__embedded")) {
			jsonToValue(&_embedded, node, "EnvironmentLogs__embedded", "EnvironmentLogs__embedded");
		} else {
			
			EnvironmentLogs__embedded* obj = static_cast<EnvironmentLogs__embedded*> (&_embedded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EnvironmentLogs::EnvironmentLogs(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentLogs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getService());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getService());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *serviceKey = "service";
	json_object_set_member(pJsonObject, serviceKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getName());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getName());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *daysKey = "days";
	json_object_set_member(pJsonObject, daysKey, node);
	if (isprimitive("EnvironmentLogs__links")) {
		EnvironmentLogs__links obj = getLinks();
		node = converttoJson(&obj, "EnvironmentLogs__links", "");
	}
	else {
		
		EnvironmentLogs__links obj = static_cast<EnvironmentLogs__links> (getLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_linksKey = "_links";
	json_object_set_member(pJsonObject, _linksKey, node);
	if (isprimitive("EnvironmentLogs__embedded")) {
		EnvironmentLogs__embedded obj = getEmbedded();
		node = converttoJson(&obj, "EnvironmentLogs__embedded", "");
	}
	else {
		
		EnvironmentLogs__embedded obj = static_cast<EnvironmentLogs__embedded> (getEmbedded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_embeddedKey = "_embedded";
	json_object_set_member(pJsonObject, _embeddedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
EnvironmentLogs::getService()
{
	return service;
}

void
EnvironmentLogs::setService(std::list <std::string> service)
{
	this->service = service;
}

std::list<std::string>
EnvironmentLogs::getName()
{
	return name;
}

void
EnvironmentLogs::setName(std::list <std::string> name)
{
	this->name = name;
}

int
EnvironmentLogs::getDays()
{
	return days;
}

void
EnvironmentLogs::setDays(int  days)
{
	this->days = days;
}

EnvironmentLogs__links
EnvironmentLogs::getLinks()
{
	return _links;
}

void
EnvironmentLogs::setLinks(EnvironmentLogs__links  _links)
{
	this->_links = _links;
}

EnvironmentLogs__embedded
EnvironmentLogs::getEmbedded()
{
	return _embedded;
}

void
EnvironmentLogs::setEmbedded(EnvironmentLogs__embedded  _embedded)
{
	this->_embedded = _embedded;
}


