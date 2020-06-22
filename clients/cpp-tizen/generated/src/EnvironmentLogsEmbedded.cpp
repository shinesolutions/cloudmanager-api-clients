#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentLogs__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentLogs__embedded::EnvironmentLogs__embedded()
{
	//__init();
}

EnvironmentLogs__embedded::~EnvironmentLogs__embedded()
{
	//__cleanup();
}

void
EnvironmentLogs__embedded::__init()
{
	//new std::list()std::list> downloads;
}

void
EnvironmentLogs__embedded::__cleanup()
{
	//if(downloads != NULL) {
	//downloads.RemoveAll(true);
	//delete downloads;
	//downloads = NULL;
	//}
	//
}

void
EnvironmentLogs__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *downloadsKey = "downloads";
	node = json_object_get_member(pJsonObject, downloadsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EnvironmentLog> new_list;
			EnvironmentLog inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EnvironmentLog")) {
					jsonToValue(&inst, temp_json, "EnvironmentLog", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			downloads = new_list;
		}
		
	}
}

EnvironmentLogs__embedded::EnvironmentLogs__embedded(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentLogs__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EnvironmentLog")) {
		list<EnvironmentLog> new_list = static_cast<list <EnvironmentLog> > (getDownloads());
		node = converttoJson(&new_list, "EnvironmentLog", "array");
	} else {
		node = json_node_alloc();
		list<EnvironmentLog> new_list = static_cast<list <EnvironmentLog> > (getDownloads());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EnvironmentLog>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EnvironmentLog obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *downloadsKey = "downloads";
	json_object_set_member(pJsonObject, downloadsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EnvironmentLog>
EnvironmentLogs__embedded::getDownloads()
{
	return downloads;
}

void
EnvironmentLogs__embedded::setDownloads(std::list <EnvironmentLog> downloads)
{
	this->downloads = downloads;
}


