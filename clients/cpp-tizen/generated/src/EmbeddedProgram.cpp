#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EmbeddedProgram.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EmbeddedProgram::EmbeddedProgram()
{
	//__init();
}

EmbeddedProgram::~EmbeddedProgram()
{
	//__cleanup();
}

void
EmbeddedProgram::__init()
{
	//id = std::string();
	//name = std::string();
	//enabled = bool(false);
	//tenantId = std::string();
}

void
EmbeddedProgram::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(tenantId != NULL) {
	//
	//delete tenantId;
	//tenantId = NULL;
	//}
	//
}

void
EmbeddedProgram::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *tenantIdKey = "tenantId";
	node = json_object_get_member(pJsonObject, tenantIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tenantId, node, "std::string", "");
		} else {
			
		}
	}
}

EmbeddedProgram::EmbeddedProgram(char* json)
{
	this->fromJson(json);
}

char*
EmbeddedProgram::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTenantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tenantIdKey = "tenantId";
	json_object_set_member(pJsonObject, tenantIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
EmbeddedProgram::getId()
{
	return id;
}

void
EmbeddedProgram::setId(std::string  id)
{
	this->id = id;
}

std::string
EmbeddedProgram::getName()
{
	return name;
}

void
EmbeddedProgram::setName(std::string  name)
{
	this->name = name;
}

bool
EmbeddedProgram::getEnabled()
{
	return enabled;
}

void
EmbeddedProgram::setEnabled(bool  enabled)
{
	this->enabled = enabled;
}

std::string
EmbeddedProgram::getTenantId()
{
	return tenantId;
}

void
EmbeddedProgram::setTenantId(std::string  tenantId)
{
	this->tenantId = tenantId;
}


