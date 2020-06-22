#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Metric.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Metric::Metric()
{
	//__init();
}

Metric::~Metric()
{
	//__cleanup();
}

void
Metric::__init()
{
	//id = std::string();
	//severity = std::string();
	//passed = bool(false);
	//override = bool(false);
	//actualValue = std::string();
	//expectedValue = std::string();
	//comparator = std::string();
	//kpi = std::string();
}

void
Metric::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(severity != NULL) {
	//
	//delete severity;
	//severity = NULL;
	//}
	//if(passed != NULL) {
	//
	//delete passed;
	//passed = NULL;
	//}
	//if(override != NULL) {
	//
	//delete override;
	//override = NULL;
	//}
	//if(actualValue != NULL) {
	//
	//delete actualValue;
	//actualValue = NULL;
	//}
	//if(expectedValue != NULL) {
	//
	//delete expectedValue;
	//expectedValue = NULL;
	//}
	//if(comparator != NULL) {
	//
	//delete comparator;
	//comparator = NULL;
	//}
	//if(kpi != NULL) {
	//
	//delete kpi;
	//kpi = NULL;
	//}
	//
}

void
Metric::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *severityKey = "severity";
	node = json_object_get_member(pJsonObject, severityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&severity, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *passedKey = "passed";
	node = json_object_get_member(pJsonObject, passedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&passed, node, "bool", "");
		} else {
			
		}
	}
	const gchar *overrideKey = "override";
	node = json_object_get_member(pJsonObject, overrideKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&override, node, "bool", "");
		} else {
			
		}
	}
	const gchar *actualValueKey = "actualValue";
	node = json_object_get_member(pJsonObject, actualValueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&actualValue, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *expectedValueKey = "expectedValue";
	node = json_object_get_member(pJsonObject, expectedValueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&expectedValue, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *comparatorKey = "comparator";
	node = json_object_get_member(pJsonObject, comparatorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comparator, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *kpiKey = "kpi";
	node = json_object_get_member(pJsonObject, kpiKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&kpi, node, "std::string", "");
		} else {
			
		}
	}
}

Metric::Metric(char* json)
{
	this->fromJson(json);
}

char*
Metric::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSeverity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *severityKey = "severity";
	json_object_set_member(pJsonObject, severityKey, node);
	if (isprimitive("bool")) {
		bool obj = getPassed();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *passedKey = "passed";
	json_object_set_member(pJsonObject, passedKey, node);
	if (isprimitive("bool")) {
		bool obj = getOverride();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *overrideKey = "override";
	json_object_set_member(pJsonObject, overrideKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getActualValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *actualValueKey = "actualValue";
	json_object_set_member(pJsonObject, actualValueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExpectedValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *expectedValueKey = "expectedValue";
	json_object_set_member(pJsonObject, expectedValueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getComparator();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *comparatorKey = "comparator";
	json_object_set_member(pJsonObject, comparatorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKpi();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *kpiKey = "kpi";
	json_object_set_member(pJsonObject, kpiKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Metric::getId()
{
	return id;
}

void
Metric::setId(std::string  id)
{
	this->id = id;
}

std::string
Metric::getSeverity()
{
	return severity;
}

void
Metric::setSeverity(std::string  severity)
{
	this->severity = severity;
}

bool
Metric::getPassed()
{
	return passed;
}

void
Metric::setPassed(bool  passed)
{
	this->passed = passed;
}

bool
Metric::getOverride()
{
	return override;
}

void
Metric::setOverride(bool  override)
{
	this->override = override;
}

std::string
Metric::getActualValue()
{
	return actualValue;
}

void
Metric::setActualValue(std::string  actualValue)
{
	this->actualValue = actualValue;
}

std::string
Metric::getExpectedValue()
{
	return expectedValue;
}

void
Metric::setExpectedValue(std::string  expectedValue)
{
	this->expectedValue = expectedValue;
}

std::string
Metric::getComparator()
{
	return comparator;
}

void
Metric::setComparator(std::string  comparator)
{
	this->comparator = comparator;
}

std::string
Metric::getKpi()
{
	return kpi;
}

void
Metric::setKpi(std::string  kpi)
{
	this->kpi = kpi;
}


