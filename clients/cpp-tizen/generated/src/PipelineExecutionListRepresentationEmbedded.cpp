#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecutionListRepresentation__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecutionListRepresentation__embedded::PipelineExecutionListRepresentation__embedded()
{
	//__init();
}

PipelineExecutionListRepresentation__embedded::~PipelineExecutionListRepresentation__embedded()
{
	//__cleanup();
}

void
PipelineExecutionListRepresentation__embedded::__init()
{
	//new std::list()std::list> executions;
}

void
PipelineExecutionListRepresentation__embedded::__cleanup()
{
	//if(executions != NULL) {
	//executions.RemoveAll(true);
	//delete executions;
	//executions = NULL;
	//}
	//
}

void
PipelineExecutionListRepresentation__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *executionsKey = "executions";
	node = json_object_get_member(pJsonObject, executionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PipelineExecution> new_list;
			PipelineExecution inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PipelineExecution")) {
					jsonToValue(&inst, temp_json, "PipelineExecution", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			executions = new_list;
		}
		
	}
}

PipelineExecutionListRepresentation__embedded::PipelineExecutionListRepresentation__embedded(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecutionListRepresentation__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PipelineExecution")) {
		list<PipelineExecution> new_list = static_cast<list <PipelineExecution> > (getExecutions());
		node = converttoJson(&new_list, "PipelineExecution", "array");
	} else {
		node = json_node_alloc();
		list<PipelineExecution> new_list = static_cast<list <PipelineExecution> > (getExecutions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PipelineExecution>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PipelineExecution obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *executionsKey = "executions";
	json_object_set_member(pJsonObject, executionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<PipelineExecution>
PipelineExecutionListRepresentation__embedded::getExecutions()
{
	return executions;
}

void
PipelineExecutionListRepresentation__embedded::setExecutions(std::list <PipelineExecution> executions)
{
	this->executions = executions;
}


