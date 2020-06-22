#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RepositoryList__embedded.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RepositoryList__embedded::RepositoryList__embedded()
{
	//__init();
}

RepositoryList__embedded::~RepositoryList__embedded()
{
	//__cleanup();
}

void
RepositoryList__embedded::__init()
{
	//new std::list()std::list> repositories;
}

void
RepositoryList__embedded::__cleanup()
{
	//if(repositories != NULL) {
	//repositories.RemoveAll(true);
	//delete repositories;
	//repositories = NULL;
	//}
	//
}

void
RepositoryList__embedded::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *repositoriesKey = "repositories";
	node = json_object_get_member(pJsonObject, repositoriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Repository> new_list;
			Repository inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Repository")) {
					jsonToValue(&inst, temp_json, "Repository", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			repositories = new_list;
		}
		
	}
}

RepositoryList__embedded::RepositoryList__embedded(char* json)
{
	this->fromJson(json);
}

char*
RepositoryList__embedded::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Repository")) {
		list<Repository> new_list = static_cast<list <Repository> > (getRepositories());
		node = converttoJson(&new_list, "Repository", "array");
	} else {
		node = json_node_alloc();
		list<Repository> new_list = static_cast<list <Repository> > (getRepositories());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Repository>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Repository obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *repositoriesKey = "repositories";
	json_object_set_member(pJsonObject, repositoriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Repository>
RepositoryList__embedded::getRepositories()
{
	return repositories;
}

void
RepositoryList__embedded::setRepositories(std::list <Repository> repositories)
{
	this->repositories = repositories;
}


