#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentLog__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentLog__links::EnvironmentLog__links()
{
	//__init();
}

EnvironmentLog__links::~EnvironmentLog__links()
{
	//__cleanup();
}

void
EnvironmentLog__links::__init()
{
	//httpnsadobecomadobecloudrellogsdownload = new HalLink();
	//httpnsadobecomadobecloudrellogstail = new HalLink();
}

void
EnvironmentLog__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrellogsdownload != NULL) {
	//
	//delete httpnsadobecomadobecloudrellogsdownload;
	//httpnsadobecomadobecloudrellogsdownload = NULL;
	//}
	//if(httpnsadobecomadobecloudrellogstail != NULL) {
	//
	//delete httpnsadobecomadobecloudrellogstail;
	//httpnsadobecomadobecloudrellogstail = NULL;
	//}
	//
}

void
EnvironmentLog__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpnsadobecomadobecloudrellogsdownloadKey = "http://ns.adobe.com/adobecloud/rel/logs/download";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrellogsdownloadKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrellogsdownload, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrellogsdownload);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrellogstailKey = "http://ns.adobe.com/adobecloud/rel/logs/tail";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrellogstailKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrellogstail, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrellogstail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EnvironmentLog__links::EnvironmentLog__links(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentLog__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrellogsdownload();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrellogsdownload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrellogsdownloadKey = "http://ns.adobe.com/adobecloud/rel/logs/download";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrellogsdownloadKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrellogstail();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrellogstail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrellogstailKey = "http://ns.adobe.com/adobecloud/rel/logs/tail";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrellogstailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

HalLink
EnvironmentLog__links::getHttpnsadobecomadobecloudrellogsdownload()
{
	return httpnsadobecomadobecloudrellogsdownload;
}

void
EnvironmentLog__links::setHttpnsadobecomadobecloudrellogsdownload(HalLink  httpnsadobecomadobecloudrellogsdownload)
{
	this->httpnsadobecomadobecloudrellogsdownload = httpnsadobecomadobecloudrellogsdownload;
}

HalLink
EnvironmentLog__links::getHttpnsadobecomadobecloudrellogstail()
{
	return httpnsadobecomadobecloudrellogstail;
}

void
EnvironmentLog__links::setHttpnsadobecomadobecloudrellogstail(HalLink  httpnsadobecomadobecloudrellogstail)
{
	this->httpnsadobecomadobecloudrellogstail = httpnsadobecomadobecloudrellogstail;
}


