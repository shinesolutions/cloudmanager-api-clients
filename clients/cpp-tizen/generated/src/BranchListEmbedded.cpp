#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BranchList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BranchList__embedded::BranchList__embedded()
{
	//__init();
}

BranchList__embedded::~BranchList__embedded()
{
	//__cleanup();
}

void
BranchList__embedded::__init()
{
	//new std::list()std::list> branches;
}

void
BranchList__embedded::__cleanup()
{
	//if(branches != NULL) {
	//branches.RemoveAll(true);
	//delete branches;
	//branches = NULL;
	//}
	//
}

void
BranchList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *branchesKey = "branches";
	node = json_object_get_member(pJsonObject, branchesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RepositoryBranch> new_list;
			RepositoryBranch inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RepositoryBranch")) {
					jsonToValue(&inst, temp_json, "RepositoryBranch", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			branches = new_list;
		}
		
	}
}

BranchList__embedded::BranchList__embedded(char* json)
{
	this->fromJson(json);
}

char*
BranchList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RepositoryBranch")) {
		list<RepositoryBranch> new_list = static_cast<list <RepositoryBranch> > (getBranches());
		node = converttoJson(&new_list, "RepositoryBranch", "array");
	} else {
		node = json_node_alloc();
		list<RepositoryBranch> new_list = static_cast<list <RepositoryBranch> > (getBranches());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RepositoryBranch>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RepositoryBranch obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *branchesKey = "branches";
	json_object_set_member(pJsonObject, branchesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<RepositoryBranch>
BranchList__embedded::getBranches()
{
	return branches;
}

void
BranchList__embedded::setBranches(std::list <RepositoryBranch> branches)
{
	this->branches = branches;
}


