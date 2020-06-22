#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecution__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecution__embedded::PipelineExecution__embedded()
{
	//__init();
}

PipelineExecution__embedded::~PipelineExecution__embedded()
{
	//__cleanup();
}

void
PipelineExecution__embedded::__init()
{
	//new std::list()std::list> stepStates;
}

void
PipelineExecution__embedded::__cleanup()
{
	//if(stepStates != NULL) {
	//stepStates.RemoveAll(true);
	//delete stepStates;
	//stepStates = NULL;
	//}
	//
}

void
PipelineExecution__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *stepStatesKey = "stepStates";
	node = json_object_get_member(pJsonObject, stepStatesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PipelineExecutionStepState> new_list;
			PipelineExecutionStepState inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PipelineExecutionStepState")) {
					jsonToValue(&inst, temp_json, "PipelineExecutionStepState", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stepStates = new_list;
		}
		
	}
}

PipelineExecution__embedded::PipelineExecution__embedded(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecution__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PipelineExecutionStepState")) {
		list<PipelineExecutionStepState> new_list = static_cast<list <PipelineExecutionStepState> > (getStepStates());
		node = converttoJson(&new_list, "PipelineExecutionStepState", "array");
	} else {
		node = json_node_alloc();
		list<PipelineExecutionStepState> new_list = static_cast<list <PipelineExecutionStepState> > (getStepStates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PipelineExecutionStepState>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PipelineExecutionStepState obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *stepStatesKey = "stepStates";
	json_object_set_member(pJsonObject, stepStatesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<PipelineExecutionStepState>
PipelineExecution__embedded::getStepStates()
{
	return stepStates;
}

void
PipelineExecution__embedded::setStepStates(std::list <PipelineExecutionStepState> stepStates)
{
	this->stepStates = stepStates;
}


