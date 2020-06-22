#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineList__embedded::PipelineList__embedded()
{
	//__init();
}

PipelineList__embedded::~PipelineList__embedded()
{
	//__cleanup();
}

void
PipelineList__embedded::__init()
{
	//new std::list()std::list> pipelines;
}

void
PipelineList__embedded::__cleanup()
{
	//if(pipelines != NULL) {
	//pipelines.RemoveAll(true);
	//delete pipelines;
	//pipelines = NULL;
	//}
	//
}

void
PipelineList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pipelinesKey = "pipelines";
	node = json_object_get_member(pJsonObject, pipelinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Pipeline> new_list;
			Pipeline inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Pipeline")) {
					jsonToValue(&inst, temp_json, "Pipeline", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pipelines = new_list;
		}
		
	}
}

PipelineList__embedded::PipelineList__embedded(char* json)
{
	this->fromJson(json);
}

char*
PipelineList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Pipeline")) {
		list<Pipeline> new_list = static_cast<list <Pipeline> > (getPipelines());
		node = converttoJson(&new_list, "Pipeline", "array");
	} else {
		node = json_node_alloc();
		list<Pipeline> new_list = static_cast<list <Pipeline> > (getPipelines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Pipeline>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Pipeline obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pipelinesKey = "pipelines";
	json_object_set_member(pJsonObject, pipelinesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Pipeline>
PipelineList__embedded::getPipelines()
{
	return pipelines;
}

void
PipelineList__embedded::setPipelines(std::list <Pipeline> pipelines)
{
	this->pipelines = pipelines;
}


