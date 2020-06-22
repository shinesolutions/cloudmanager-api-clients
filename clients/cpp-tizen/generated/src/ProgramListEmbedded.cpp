#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProgramList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProgramList__embedded::ProgramList__embedded()
{
	//__init();
}

ProgramList__embedded::~ProgramList__embedded()
{
	//__cleanup();
}

void
ProgramList__embedded::__init()
{
	//new std::list()std::list> programs;
}

void
ProgramList__embedded::__cleanup()
{
	//if(programs != NULL) {
	//programs.RemoveAll(true);
	//delete programs;
	//programs = NULL;
	//}
	//
}

void
ProgramList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *programsKey = "programs";
	node = json_object_get_member(pJsonObject, programsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EmbeddedProgram> new_list;
			EmbeddedProgram inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EmbeddedProgram")) {
					jsonToValue(&inst, temp_json, "EmbeddedProgram", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			programs = new_list;
		}
		
	}
}

ProgramList__embedded::ProgramList__embedded(char* json)
{
	this->fromJson(json);
}

char*
ProgramList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EmbeddedProgram")) {
		list<EmbeddedProgram> new_list = static_cast<list <EmbeddedProgram> > (getPrograms());
		node = converttoJson(&new_list, "EmbeddedProgram", "array");
	} else {
		node = json_node_alloc();
		list<EmbeddedProgram> new_list = static_cast<list <EmbeddedProgram> > (getPrograms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EmbeddedProgram>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EmbeddedProgram obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *programsKey = "programs";
	json_object_set_member(pJsonObject, programsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EmbeddedProgram>
ProgramList__embedded::getPrograms()
{
	return programs;
}

void
ProgramList__embedded::setPrograms(std::list <EmbeddedProgram> programs)
{
	this->programs = programs;
}


