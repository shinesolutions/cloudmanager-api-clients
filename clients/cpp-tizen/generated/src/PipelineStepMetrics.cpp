#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineStepMetrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineStepMetrics::PipelineStepMetrics()
{
	//__init();
}

PipelineStepMetrics::~PipelineStepMetrics()
{
	//__cleanup();
}

void
PipelineStepMetrics::__init()
{
	//new std::list()std::list> metrics;
}

void
PipelineStepMetrics::__cleanup()
{
	//if(metrics != NULL) {
	//metrics.RemoveAll(true);
	//delete metrics;
	//metrics = NULL;
	//}
	//
}

void
PipelineStepMetrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Metric> new_list;
			Metric inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Metric")) {
					jsonToValue(&inst, temp_json, "Metric", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			metrics = new_list;
		}
		
	}
}

PipelineStepMetrics::PipelineStepMetrics(char* json)
{
	this->fromJson(json);
}

char*
PipelineStepMetrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Metric")) {
		list<Metric> new_list = static_cast<list <Metric> > (getMetrics());
		node = converttoJson(&new_list, "Metric", "array");
	} else {
		node = json_node_alloc();
		list<Metric> new_list = static_cast<list <Metric> > (getMetrics());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Metric>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Metric obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *metricsKey = "metrics";
	json_object_set_member(pJsonObject, metricsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Metric>
PipelineStepMetrics::getMetrics()
{
	return metrics;
}

void
PipelineStepMetrics::setMetrics(std::list <Metric> metrics)
{
	this->metrics = metrics;
}


