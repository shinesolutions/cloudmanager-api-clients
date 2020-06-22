#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HalLink.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HalLink::HalLink()
{
	//__init();
}

HalLink::~HalLink()
{
	//__cleanup();
}

void
HalLink::__init()
{
	//href = std::string();
	//templated = bool(false);
	//type = std::string();
	//deprecation = std::string();
	//profile = std::string();
	//title = std::string();
	//hreflang = std::string();
	//name = std::string();
}

void
HalLink::__cleanup()
{
	//if(href != NULL) {
	//
	//delete href;
	//href = NULL;
	//}
	//if(templated != NULL) {
	//
	//delete templated;
	//templated = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(deprecation != NULL) {
	//
	//delete deprecation;
	//deprecation = NULL;
	//}
	//if(profile != NULL) {
	//
	//delete profile;
	//profile = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(hreflang != NULL) {
	//
	//delete hreflang;
	//hreflang = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
HalLink::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hrefKey = "href";
	node = json_object_get_member(pJsonObject, hrefKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&href, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *templatedKey = "templated";
	node = json_object_get_member(pJsonObject, templatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&templated, node, "bool", "");
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
	const gchar *deprecationKey = "deprecation";
	node = json_object_get_member(pJsonObject, deprecationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&deprecation, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *profileKey = "profile";
	node = json_object_get_member(pJsonObject, profileKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&profile, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hreflangKey = "hreflang";
	node = json_object_get_member(pJsonObject, hreflangKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hreflang, node, "std::string", "");
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
}

HalLink::HalLink(char* json)
{
	this->fromJson(json);
}

char*
HalLink::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getHref();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hrefKey = "href";
	json_object_set_member(pJsonObject, hrefKey, node);
	if (isprimitive("bool")) {
		bool obj = getTemplated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *templatedKey = "templated";
	json_object_set_member(pJsonObject, templatedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeprecation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deprecationKey = "deprecation";
	json_object_set_member(pJsonObject, deprecationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProfile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *profileKey = "profile";
	json_object_set_member(pJsonObject, profileKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHreflang();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hreflangKey = "hreflang";
	json_object_set_member(pJsonObject, hreflangKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
HalLink::getHref()
{
	return href;
}

void
HalLink::setHref(std::string  href)
{
	this->href = href;
}

bool
HalLink::getTemplated()
{
	return templated;
}

void
HalLink::setTemplated(bool  templated)
{
	this->templated = templated;
}

std::string
HalLink::getType()
{
	return type;
}

void
HalLink::setType(std::string  type)
{
	this->type = type;
}

std::string
HalLink::getDeprecation()
{
	return deprecation;
}

void
HalLink::setDeprecation(std::string  deprecation)
{
	this->deprecation = deprecation;
}

std::string
HalLink::getProfile()
{
	return profile;
}

void
HalLink::setProfile(std::string  profile)
{
	this->profile = profile;
}

std::string
HalLink::getTitle()
{
	return title;
}

void
HalLink::setTitle(std::string  title)
{
	this->title = title;
}

std::string
HalLink::getHreflang()
{
	return hreflang;
}

void
HalLink::setHreflang(std::string  hreflang)
{
	this->hreflang = hreflang;
}

std::string
HalLink::getName()
{
	return name;
}

void
HalLink::setName(std::string  name)
{
	this->name = name;
}


