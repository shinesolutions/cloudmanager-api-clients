#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Environment.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Environment::Environment()
{
	//__init();
}

Environment::~Environment()
{
	//__cleanup();
}

void
Environment::__init()
{
	//id = std::string();
	//programId = std::string();
	//name = std::string();
	//description = std::string();
	//type = std::string();
	//_links = new Environment__links();
}

void
Environment::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(programId != NULL) {
	//
	//delete programId;
	//programId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
Environment::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *programIdKey = "programId";
	node = json_object_get_member(pJsonObject, programIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&programId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
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
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("Environment__links")) {
			jsonToValue(&_links, node, "Environment__links", "Environment__links");
		} else {
			
			Environment__links* obj = static_cast<Environment__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Environment::Environment(char* json)
{
	this->fromJson(json);
}

char*
Environment::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProgramId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *programIdKey = "programId";
	json_object_set_member(pJsonObject, programIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("Environment__links")) {
		Environment__links obj = getLinks();
		node = converttoJson(&obj, "Environment__links", "");
	}
	else {
		
		Environment__links obj = static_cast<Environment__links> (getLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_linksKey = "_links";
	json_object_set_member(pJsonObject, _linksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Environment::getId()
{
	return id;
}

void
Environment::setId(std::string  id)
{
	this->id = id;
}

std::string
Environment::getProgramId()
{
	return programId;
}

void
Environment::setProgramId(std::string  programId)
{
	this->programId = programId;
}

std::string
Environment::getName()
{
	return name;
}

void
Environment::setName(std::string  name)
{
	this->name = name;
}

std::string
Environment::getDescription()
{
	return description;
}

void
Environment::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Environment::getType()
{
	return type;
}

void
Environment::setType(std::string  type)
{
	this->type = type;
}

Environment__links
Environment::getLinks()
{
	return _links;
}

void
Environment::setLinks(Environment__links  _links)
{
	this->_links = _links;
}


