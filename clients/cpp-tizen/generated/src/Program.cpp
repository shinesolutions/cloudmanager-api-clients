#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Program.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Program::Program()
{
	//__init();
}

Program::~Program()
{
	//__cleanup();
}

void
Program::__init()
{
	//id = std::string();
	//name = std::string();
	//enabled = bool(false);
	//tenantId = std::string();
	//imsOrgId = std::string();
	//_links = new Program__links();
}

void
Program::__cleanup()
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
	//if(imsOrgId != NULL) {
	//
	//delete imsOrgId;
	//imsOrgId = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
Program::fromJson(char* jsonStr)
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
	const gchar *imsOrgIdKey = "imsOrgId";
	node = json_object_get_member(pJsonObject, imsOrgIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&imsOrgId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("Program__links")) {
			jsonToValue(&_links, node, "Program__links", "Program__links");
		} else {
			
			Program__links* obj = static_cast<Program__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Program::Program(char* json)
{
	this->fromJson(json);
}

char*
Program::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getImsOrgId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *imsOrgIdKey = "imsOrgId";
	json_object_set_member(pJsonObject, imsOrgIdKey, node);
	if (isprimitive("Program__links")) {
		Program__links obj = getLinks();
		node = converttoJson(&obj, "Program__links", "");
	}
	else {
		
		Program__links obj = static_cast<Program__links> (getLinks());
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
Program::getId()
{
	return id;
}

void
Program::setId(std::string  id)
{
	this->id = id;
}

std::string
Program::getName()
{
	return name;
}

void
Program::setName(std::string  name)
{
	this->name = name;
}

bool
Program::getEnabled()
{
	return enabled;
}

void
Program::setEnabled(bool  enabled)
{
	this->enabled = enabled;
}

std::string
Program::getTenantId()
{
	return tenantId;
}

void
Program::setTenantId(std::string  tenantId)
{
	this->tenantId = tenantId;
}

std::string
Program::getImsOrgId()
{
	return imsOrgId;
}

void
Program::setImsOrgId(std::string  imsOrgId)
{
	this->imsOrgId = imsOrgId;
}

Program__links
Program::getLinks()
{
	return _links;
}

void
Program::setLinks(Program__links  _links)
{
	this->_links = _links;
}


