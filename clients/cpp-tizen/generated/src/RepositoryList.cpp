#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RepositoryList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RepositoryList::RepositoryList()
{
	//__init();
}

RepositoryList::~RepositoryList()
{
	//__cleanup();
}

void
RepositoryList::__init()
{
	//_totalNumberOfItems = int(0);
	//_embedded = new RepositoryList__embedded();
	//_links = new ProgramList__links();
}

void
RepositoryList::__cleanup()
{
	//if(_totalNumberOfItems != NULL) {
	//
	//delete _totalNumberOfItems;
	//_totalNumberOfItems = NULL;
	//}
	//if(_embedded != NULL) {
	//
	//delete _embedded;
	//_embedded = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
RepositoryList::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *_totalNumberOfItemsKey = "_totalNumberOfItems";
	node = json_object_get_member(pJsonObject, _totalNumberOfItemsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&_totalNumberOfItems, node, "int", "");
		} else {
			
		}
	}
	const gchar *_embeddedKey = "_embedded";
	node = json_object_get_member(pJsonObject, _embeddedKey);
	if (node !=NULL) {
	

		if (isprimitive("RepositoryList__embedded")) {
			jsonToValue(&_embedded, node, "RepositoryList__embedded", "RepositoryList__embedded");
		} else {
			
			RepositoryList__embedded* obj = static_cast<RepositoryList__embedded*> (&_embedded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("ProgramList__links")) {
			jsonToValue(&_links, node, "ProgramList__links", "ProgramList__links");
		} else {
			
			ProgramList__links* obj = static_cast<ProgramList__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RepositoryList::RepositoryList(char* json)
{
	this->fromJson(json);
}

char*
RepositoryList::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTotalNumberOfItems();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *_totalNumberOfItemsKey = "_totalNumberOfItems";
	json_object_set_member(pJsonObject, _totalNumberOfItemsKey, node);
	if (isprimitive("RepositoryList__embedded")) {
		RepositoryList__embedded obj = getEmbedded();
		node = converttoJson(&obj, "RepositoryList__embedded", "");
	}
	else {
		
		RepositoryList__embedded obj = static_cast<RepositoryList__embedded> (getEmbedded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_embeddedKey = "_embedded";
	json_object_set_member(pJsonObject, _embeddedKey, node);
	if (isprimitive("ProgramList__links")) {
		ProgramList__links obj = getLinks();
		node = converttoJson(&obj, "ProgramList__links", "");
	}
	else {
		
		ProgramList__links obj = static_cast<ProgramList__links> (getLinks());
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

int
RepositoryList::getTotalNumberOfItems()
{
	return _totalNumberOfItems;
}

void
RepositoryList::setTotalNumberOfItems(int  _totalNumberOfItems)
{
	this->_totalNumberOfItems = _totalNumberOfItems;
}

RepositoryList__embedded
RepositoryList::getEmbedded()
{
	return _embedded;
}

void
RepositoryList::setEmbedded(RepositoryList__embedded  _embedded)
{
	this->_embedded = _embedded;
}

ProgramList__links
RepositoryList::getLinks()
{
	return _links;
}

void
RepositoryList::setLinks(ProgramList__links  _links)
{
	this->_links = _links;
}


