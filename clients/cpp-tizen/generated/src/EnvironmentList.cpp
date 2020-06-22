#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentList::EnvironmentList()
{
	//__init();
}

EnvironmentList::~EnvironmentList()
{
	//__cleanup();
}

void
EnvironmentList::__init()
{
	//_totalNumberOfItems = int(0);
	//_embedded = new EnvironmentList__embedded();
	//_links = new ProgramList__links();
}

void
EnvironmentList::__cleanup()
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
EnvironmentList::fromJson(char* jsonStr)
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
	

		if (isprimitive("EnvironmentList__embedded")) {
			jsonToValue(&_embedded, node, "EnvironmentList__embedded", "EnvironmentList__embedded");
		} else {
			
			EnvironmentList__embedded* obj = static_cast<EnvironmentList__embedded*> (&_embedded);
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

EnvironmentList::EnvironmentList(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentList::toJson()
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
	if (isprimitive("EnvironmentList__embedded")) {
		EnvironmentList__embedded obj = getEmbedded();
		node = converttoJson(&obj, "EnvironmentList__embedded", "");
	}
	else {
		
		EnvironmentList__embedded obj = static_cast<EnvironmentList__embedded> (getEmbedded());
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
EnvironmentList::getTotalNumberOfItems()
{
	return _totalNumberOfItems;
}

void
EnvironmentList::setTotalNumberOfItems(int  _totalNumberOfItems)
{
	this->_totalNumberOfItems = _totalNumberOfItems;
}

EnvironmentList__embedded
EnvironmentList::getEmbedded()
{
	return _embedded;
}

void
EnvironmentList::setEmbedded(EnvironmentList__embedded  _embedded)
{
	this->_embedded = _embedded;
}

ProgramList__links
EnvironmentList::getLinks()
{
	return _links;
}

void
EnvironmentList::setLinks(ProgramList__links  _links)
{
	this->_links = _links;
}


