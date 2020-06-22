#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BadRequestError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BadRequestError::BadRequestError()
{
	//__init();
}

BadRequestError::~BadRequestError()
{
	//__cleanup();
}

void
BadRequestError::__init()
{
	//status = int(0);
	//type = std::string();
	//title = std::string();
	//new std::list()std::list> missingParams;
	//new std::list()std::list> invalidParams;
}

void
BadRequestError::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(missingParams != NULL) {
	//missingParams.RemoveAll(true);
	//delete missingParams;
	//missingParams = NULL;
	//}
	//if(invalidParams != NULL) {
	//invalidParams.RemoveAll(true);
	//delete invalidParams;
	//invalidParams = NULL;
	//}
	//
}

void
BadRequestError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&status, node, "int", "");
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
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *missingParamsKey = "missingParams";
	node = json_object_get_member(pJsonObject, missingParamsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MissingParameter> new_list;
			MissingParameter inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MissingParameter")) {
					jsonToValue(&inst, temp_json, "MissingParameter", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			missingParams = new_list;
		}
		
	}
	const gchar *invalidParamsKey = "invalidParams";
	node = json_object_get_member(pJsonObject, invalidParamsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<InvalidParameter> new_list;
			InvalidParameter inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("InvalidParameter")) {
					jsonToValue(&inst, temp_json, "InvalidParameter", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			invalidParams = new_list;
		}
		
	}
}

BadRequestError::BadRequestError(char* json)
{
	this->fromJson(json);
}

char*
BadRequestError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getStatus();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("MissingParameter")) {
		list<MissingParameter> new_list = static_cast<list <MissingParameter> > (getMissingParams());
		node = converttoJson(&new_list, "MissingParameter", "array");
	} else {
		node = json_node_alloc();
		list<MissingParameter> new_list = static_cast<list <MissingParameter> > (getMissingParams());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MissingParameter>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MissingParameter obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *missingParamsKey = "missingParams";
	json_object_set_member(pJsonObject, missingParamsKey, node);
	if (isprimitive("InvalidParameter")) {
		list<InvalidParameter> new_list = static_cast<list <InvalidParameter> > (getInvalidParams());
		node = converttoJson(&new_list, "InvalidParameter", "array");
	} else {
		node = json_node_alloc();
		list<InvalidParameter> new_list = static_cast<list <InvalidParameter> > (getInvalidParams());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<InvalidParameter>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			InvalidParameter obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *invalidParamsKey = "invalidParams";
	json_object_set_member(pJsonObject, invalidParamsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BadRequestError::getStatus()
{
	return status;
}

void
BadRequestError::setStatus(int  status)
{
	this->status = status;
}

std::string
BadRequestError::getType()
{
	return type;
}

void
BadRequestError::setType(std::string  type)
{
	this->type = type;
}

std::string
BadRequestError::getTitle()
{
	return title;
}

void
BadRequestError::setTitle(std::string  title)
{
	this->title = title;
}

std::list<MissingParameter>
BadRequestError::getMissingParams()
{
	return missingParams;
}

void
BadRequestError::setMissingParams(std::list <MissingParameter> missingParams)
{
	this->missingParams = missingParams;
}

std::list<InvalidParameter>
BadRequestError::getInvalidParams()
{
	return invalidParams;
}

void
BadRequestError::setInvalidParams(std::list <InvalidParameter> invalidParams)
{
	this->invalidParams = invalidParams;
}


