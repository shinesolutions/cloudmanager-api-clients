#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Repository.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Repository::Repository()
{
	//__init();
}

Repository::~Repository()
{
	//__cleanup();
}

void
Repository::__init()
{
	//repo = std::string();
	//description = std::string();
	//_links = new Repository__links();
}

void
Repository::__cleanup()
{
	//if(repo != NULL) {
	//
	//delete repo;
	//repo = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
Repository::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *repoKey = "repo";
	node = json_object_get_member(pJsonObject, repoKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&repo, node, "std::string", "");
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
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("Repository__links")) {
			jsonToValue(&_links, node, "Repository__links", "Repository__links");
		} else {
			
			Repository__links* obj = static_cast<Repository__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Repository::Repository(char* json)
{
	this->fromJson(json);
}

char*
Repository::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRepo();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *repoKey = "repo";
	json_object_set_member(pJsonObject, repoKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("Repository__links")) {
		Repository__links obj = getLinks();
		node = converttoJson(&obj, "Repository__links", "");
	}
	else {
		
		Repository__links obj = static_cast<Repository__links> (getLinks());
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
Repository::getRepo()
{
	return repo;
}

void
Repository::setRepo(std::string  repo)
{
	this->repo = repo;
}

std::string
Repository::getDescription()
{
	return description;
}

void
Repository::setDescription(std::string  description)
{
	this->description = description;
}

Repository__links
Repository::getLinks()
{
	return _links;
}

void
Repository::setLinks(Repository__links  _links)
{
	this->_links = _links;
}


