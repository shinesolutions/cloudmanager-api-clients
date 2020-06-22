#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentList__embedded::EnvironmentList__embedded()
{
	//__init();
}

EnvironmentList__embedded::~EnvironmentList__embedded()
{
	//__cleanup();
}

void
EnvironmentList__embedded::__init()
{
	//new std::list()std::list> environments;
}

void
EnvironmentList__embedded::__cleanup()
{
	//if(environments != NULL) {
	//environments.RemoveAll(true);
	//delete environments;
	//environments = NULL;
	//}
	//
}

void
EnvironmentList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *environmentsKey = "environments";
	node = json_object_get_member(pJsonObject, environmentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Environment> new_list;
			Environment inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Environment")) {
					jsonToValue(&inst, temp_json, "Environment", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			environments = new_list;
		}
		
	}
}

EnvironmentList__embedded::EnvironmentList__embedded(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Environment")) {
		list<Environment> new_list = static_cast<list <Environment> > (getEnvironments());
		node = converttoJson(&new_list, "Environment", "array");
	} else {
		node = json_node_alloc();
		list<Environment> new_list = static_cast<list <Environment> > (getEnvironments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Environment>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Environment obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *environmentsKey = "environments";
	json_object_set_member(pJsonObject, environmentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Environment>
EnvironmentList__embedded::getEnvironments()
{
	return environments;
}

void
EnvironmentList__embedded::setEnvironments(std::list <Environment> environments)
{
	this->environments = environments;
}


