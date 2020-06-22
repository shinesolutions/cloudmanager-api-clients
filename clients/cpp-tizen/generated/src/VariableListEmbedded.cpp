#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VariableList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VariableList__embedded::VariableList__embedded()
{
	//__init();
}

VariableList__embedded::~VariableList__embedded()
{
	//__cleanup();
}

void
VariableList__embedded::__init()
{
	//new std::list()std::list> variables;
}

void
VariableList__embedded::__cleanup()
{
	//if(variables != NULL) {
	//variables.RemoveAll(true);
	//delete variables;
	//variables = NULL;
	//}
	//
}

void
VariableList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *variablesKey = "variables";
	node = json_object_get_member(pJsonObject, variablesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Variable> new_list;
			Variable inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Variable")) {
					jsonToValue(&inst, temp_json, "Variable", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			variables = new_list;
		}
		
	}
}

VariableList__embedded::VariableList__embedded(char* json)
{
	this->fromJson(json);
}

char*
VariableList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Variable")) {
		list<Variable> new_list = static_cast<list <Variable> > (getVariables());
		node = converttoJson(&new_list, "Variable", "array");
	} else {
		node = json_node_alloc();
		list<Variable> new_list = static_cast<list <Variable> > (getVariables());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Variable>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Variable obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *variablesKey = "variables";
	json_object_set_member(pJsonObject, variablesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Variable>
VariableList__embedded::getVariables()
{
	return variables;
}

void
VariableList__embedded::setVariables(std::list <Variable> variables)
{
	this->variables = variables;
}


