#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecutionListRepresentation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecutionListRepresentation::PipelineExecutionListRepresentation()
{
	//__init();
}

PipelineExecutionListRepresentation::~PipelineExecutionListRepresentation()
{
	//__cleanup();
}

void
PipelineExecutionListRepresentation::__init()
{
	//_totalNumberOfItems = int(0);
	//_page = new RequestedPageDetails();
	//_embedded = new PipelineExecutionListRepresentation__embedded();
	//_links = new PipelineExecutionListRepresentation__links();
}

void
PipelineExecutionListRepresentation::__cleanup()
{
	//if(_totalNumberOfItems != NULL) {
	//
	//delete _totalNumberOfItems;
	//_totalNumberOfItems = NULL;
	//}
	//if(_page != NULL) {
	//
	//delete _page;
	//_page = NULL;
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
PipelineExecutionListRepresentation::fromJson(char* jsonStr)
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
	const gchar *_pageKey = "_page";
	node = json_object_get_member(pJsonObject, _pageKey);
	if (node !=NULL) {
	

		if (isprimitive("RequestedPageDetails")) {
			jsonToValue(&_page, node, "RequestedPageDetails", "RequestedPageDetails");
		} else {
			
			RequestedPageDetails* obj = static_cast<RequestedPageDetails*> (&_page);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_embeddedKey = "_embedded";
	node = json_object_get_member(pJsonObject, _embeddedKey);
	if (node !=NULL) {
	

		if (isprimitive("PipelineExecutionListRepresentation__embedded")) {
			jsonToValue(&_embedded, node, "PipelineExecutionListRepresentation__embedded", "PipelineExecutionListRepresentation__embedded");
		} else {
			
			PipelineExecutionListRepresentation__embedded* obj = static_cast<PipelineExecutionListRepresentation__embedded*> (&_embedded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("PipelineExecutionListRepresentation__links")) {
			jsonToValue(&_links, node, "PipelineExecutionListRepresentation__links", "PipelineExecutionListRepresentation__links");
		} else {
			
			PipelineExecutionListRepresentation__links* obj = static_cast<PipelineExecutionListRepresentation__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PipelineExecutionListRepresentation::PipelineExecutionListRepresentation(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecutionListRepresentation::toJson()
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
	if (isprimitive("RequestedPageDetails")) {
		RequestedPageDetails obj = getPage();
		node = converttoJson(&obj, "RequestedPageDetails", "");
	}
	else {
		
		RequestedPageDetails obj = static_cast<RequestedPageDetails> (getPage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_pageKey = "_page";
	json_object_set_member(pJsonObject, _pageKey, node);
	if (isprimitive("PipelineExecutionListRepresentation__embedded")) {
		PipelineExecutionListRepresentation__embedded obj = getEmbedded();
		node = converttoJson(&obj, "PipelineExecutionListRepresentation__embedded", "");
	}
	else {
		
		PipelineExecutionListRepresentation__embedded obj = static_cast<PipelineExecutionListRepresentation__embedded> (getEmbedded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_embeddedKey = "_embedded";
	json_object_set_member(pJsonObject, _embeddedKey, node);
	if (isprimitive("PipelineExecutionListRepresentation__links")) {
		PipelineExecutionListRepresentation__links obj = getLinks();
		node = converttoJson(&obj, "PipelineExecutionListRepresentation__links", "");
	}
	else {
		
		PipelineExecutionListRepresentation__links obj = static_cast<PipelineExecutionListRepresentation__links> (getLinks());
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
PipelineExecutionListRepresentation::getTotalNumberOfItems()
{
	return _totalNumberOfItems;
}

void
PipelineExecutionListRepresentation::setTotalNumberOfItems(int  _totalNumberOfItems)
{
	this->_totalNumberOfItems = _totalNumberOfItems;
}

RequestedPageDetails
PipelineExecutionListRepresentation::getPage()
{
	return _page;
}

void
PipelineExecutionListRepresentation::setPage(RequestedPageDetails  _page)
{
	this->_page = _page;
}

PipelineExecutionListRepresentation__embedded
PipelineExecutionListRepresentation::getEmbedded()
{
	return _embedded;
}

void
PipelineExecutionListRepresentation::setEmbedded(PipelineExecutionListRepresentation__embedded  _embedded)
{
	this->_embedded = _embedded;
}

PipelineExecutionListRepresentation__links
PipelineExecutionListRepresentation::getLinks()
{
	return _links;
}

void
PipelineExecutionListRepresentation::setLinks(PipelineExecutionListRepresentation__links  _links)
{
	this->_links = _links;
}


