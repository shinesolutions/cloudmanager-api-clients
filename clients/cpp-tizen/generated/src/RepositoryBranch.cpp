#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RepositoryBranch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RepositoryBranch::RepositoryBranch()
{
	//__init();
}

RepositoryBranch::~RepositoryBranch()
{
	//__cleanup();
}

void
RepositoryBranch::__init()
{
	//programId = std::string();
	//repositoryId = long(0);
	//name = std::string();
	//_links = new RepositoryBranch__links();
}

void
RepositoryBranch::__cleanup()
{
	//if(programId != NULL) {
	//
	//delete programId;
	//programId = NULL;
	//}
	//if(repositoryId != NULL) {
	//
	//delete repositoryId;
	//repositoryId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
RepositoryBranch::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *programIdKey = "programId";
	node = json_object_get_member(pJsonObject, programIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&programId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *repositoryIdKey = "repositoryId";
	node = json_object_get_member(pJsonObject, repositoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&repositoryId, node, "long long", "");
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
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("RepositoryBranch__links")) {
			jsonToValue(&_links, node, "RepositoryBranch__links", "RepositoryBranch__links");
		} else {
			
			RepositoryBranch__links* obj = static_cast<RepositoryBranch__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RepositoryBranch::RepositoryBranch(char* json)
{
	this->fromJson(json);
}

char*
RepositoryBranch::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getProgramId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *programIdKey = "programId";
	json_object_set_member(pJsonObject, programIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getRepositoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *repositoryIdKey = "repositoryId";
	json_object_set_member(pJsonObject, repositoryIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("RepositoryBranch__links")) {
		RepositoryBranch__links obj = getLinks();
		node = converttoJson(&obj, "RepositoryBranch__links", "");
	}
	else {
		
		RepositoryBranch__links obj = static_cast<RepositoryBranch__links> (getLinks());
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
RepositoryBranch::getProgramId()
{
	return programId;
}

void
RepositoryBranch::setProgramId(std::string  programId)
{
	this->programId = programId;
}

long long
RepositoryBranch::getRepositoryId()
{
	return repositoryId;
}

void
RepositoryBranch::setRepositoryId(long long  repositoryId)
{
	this->repositoryId = repositoryId;
}

std::string
RepositoryBranch::getName()
{
	return name;
}

void
RepositoryBranch::setName(std::string  name)
{
	this->name = name;
}

RepositoryBranch__links
RepositoryBranch::getLinks()
{
	return _links;
}

void
RepositoryBranch::setLinks(RepositoryBranch__links  _links)
{
	this->_links = _links;
}


