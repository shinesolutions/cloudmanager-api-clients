#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VariableList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VariableList::VariableList()
{
	//__init();
}

VariableList::~VariableList()
{
	//__cleanup();
}

void
VariableList::__init()
{
	//_totalNumberOfItems = int(0);
	//_embedded = new VariableList__embedded();
	//_links = new VariableList__links();
}

void
VariableList::__cleanup()
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
VariableList::fromJson(char* jsonStr)
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
	

		if (isprimitive("VariableList__embedded")) {
			jsonToValue(&_embedded, node, "VariableList__embedded", "VariableList__embedded");
		} else {
			
			VariableList__embedded* obj = static_cast<VariableList__embedded*> (&_embedded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("VariableList__links")) {
			jsonToValue(&_links, node, "VariableList__links", "VariableList__links");
		} else {
			
			VariableList__links* obj = static_cast<VariableList__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VariableList::VariableList(char* json)
{
	this->fromJson(json);
}

char*
VariableList::toJson()
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
	if (isprimitive("VariableList__embedded")) {
		VariableList__embedded obj = getEmbedded();
		node = converttoJson(&obj, "VariableList__embedded", "");
	}
	else {
		
		VariableList__embedded obj = static_cast<VariableList__embedded> (getEmbedded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_embeddedKey = "_embedded";
	json_object_set_member(pJsonObject, _embeddedKey, node);
	if (isprimitive("VariableList__links")) {
		VariableList__links obj = getLinks();
		node = converttoJson(&obj, "VariableList__links", "");
	}
	else {
		
		VariableList__links obj = static_cast<VariableList__links> (getLinks());
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
VariableList::getTotalNumberOfItems()
{
	return _totalNumberOfItems;
}

void
VariableList::setTotalNumberOfItems(int  _totalNumberOfItems)
{
	this->_totalNumberOfItems = _totalNumberOfItems;
}

VariableList__embedded
VariableList::getEmbedded()
{
	return _embedded;
}

void
VariableList::setEmbedded(VariableList__embedded  _embedded)
{
	this->_embedded = _embedded;
}

VariableList__links
VariableList::getLinks()
{
	return _links;
}

void
VariableList::setLinks(VariableList__links  _links)
{
	this->_links = _links;
}


