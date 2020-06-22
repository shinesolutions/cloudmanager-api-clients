#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecutionStepState__links.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecutionStepState__links::PipelineExecutionStepState__links()
{
	//__init();
}

PipelineExecutionStepState__links::~PipelineExecutionStepState__links()
{
	//__cleanup();
}

void
PipelineExecutionStepState__links::__init()
{
	//httpnsadobecomadobecloudrelexecution = new HalLink();
	//httpnsadobecomadobecloudrelpipeline = new HalLink();
	//httpnsadobecomadobecloudrelpipelinelogs = new HalLink();
	//httpnsadobecomadobecloudrelpipelinemetrics = new HalLink();
	//httpnsadobecomadobecloudrelpipelineadvance = new HalLink();
	//httpnsadobecomadobecloudrelpipelinecancel = new HalLink();
	//httpnsadobecomadobecloudrelprogram = new HalLink();
	//self = new HalLink();
}

void
PipelineExecutionStepState__links::__cleanup()
{
	//if(httpnsadobecomadobecloudrelexecution != NULL) {
	//
	//delete httpnsadobecomadobecloudrelexecution;
	//httpnsadobecomadobecloudrelexecution = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipeline != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipeline;
	//httpnsadobecomadobecloudrelpipeline = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipelinelogs != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipelinelogs;
	//httpnsadobecomadobecloudrelpipelinelogs = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipelinemetrics != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipelinemetrics;
	//httpnsadobecomadobecloudrelpipelinemetrics = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipelineadvance != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipelineadvance;
	//httpnsadobecomadobecloudrelpipelineadvance = NULL;
	//}
	//if(httpnsadobecomadobecloudrelpipelinecancel != NULL) {
	//
	//delete httpnsadobecomadobecloudrelpipelinecancel;
	//httpnsadobecomadobecloudrelpipelinecancel = NULL;
	//}
	//if(httpnsadobecomadobecloudrelprogram != NULL) {
	//
	//delete httpnsadobecomadobecloudrelprogram;
	//httpnsadobecomadobecloudrelprogram = NULL;
	//}
	//if(self != NULL) {
	//
	//delete self;
	//self = NULL;
	//}
	//
}

void
PipelineExecutionStepState__links::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *httpnsadobecomadobecloudrelexecutionKey = "http://ns.adobe.com/adobecloud/rel/execution";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelexecutionKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelexecution, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelexecution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpipelineKey = "http://ns.adobe.com/adobecloud/rel/pipeline";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelineKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipeline, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipeline);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpipelinelogsKey = "http://ns.adobe.com/adobecloud/rel/pipeline/logs";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelinelogsKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipelinelogs, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipelinelogs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpipelinemetricsKey = "http://ns.adobe.com/adobecloud/rel/pipeline/metrics";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelinemetricsKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipelinemetrics, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipelinemetrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpipelineadvanceKey = "http://ns.adobe.com/adobecloud/rel/pipeline/advance";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelineadvanceKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipelineadvance, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipelineadvance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelpipelinecancelKey = "http://ns.adobe.com/adobecloud/rel/pipeline/cancel";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelpipelinecancelKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelpipelinecancel, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelpipelinecancel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpnsadobecomadobecloudrelprogramKey = "http://ns.adobe.com/adobecloud/rel/program";
	node = json_object_get_member(pJsonObject, httpnsadobecomadobecloudrelprogramKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&httpnsadobecomadobecloudrelprogram, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&httpnsadobecomadobecloudrelprogram);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *selfKey = "self";
	node = json_object_get_member(pJsonObject, selfKey);
	if (node !=NULL) {
	

		if (isprimitive("HalLink")) {
			jsonToValue(&self, node, "HalLink", "HalLink");
		} else {
			
			HalLink* obj = static_cast<HalLink*> (&self);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PipelineExecutionStepState__links::PipelineExecutionStepState__links(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecutionStepState__links::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelexecution();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelexecution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelexecutionKey = "http://ns.adobe.com/adobecloud/rel/execution";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelexecutionKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipeline();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipeline());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelineKey = "http://ns.adobe.com/adobecloud/rel/pipeline";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelineKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipelinelogs();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipelinelogs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelinelogsKey = "http://ns.adobe.com/adobecloud/rel/pipeline/logs";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelinelogsKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipelinemetrics();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipelinemetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelinemetricsKey = "http://ns.adobe.com/adobecloud/rel/pipeline/metrics";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelinemetricsKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipelineadvance();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipelineadvance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelineadvanceKey = "http://ns.adobe.com/adobecloud/rel/pipeline/advance";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelineadvanceKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelpipelinecancel();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelpipelinecancel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelpipelinecancelKey = "http://ns.adobe.com/adobecloud/rel/pipeline/cancel";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelpipelinecancelKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getHttpnsadobecomadobecloudrelprogram();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getHttpnsadobecomadobecloudrelprogram());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpnsadobecomadobecloudrelprogramKey = "http://ns.adobe.com/adobecloud/rel/program";
	json_object_set_member(pJsonObject, httpnsadobecomadobecloudrelprogramKey, node);
	if (isprimitive("HalLink")) {
		HalLink obj = getSelf();
		node = converttoJson(&obj, "HalLink", "");
	}
	else {
		
		HalLink obj = static_cast<HalLink> (getSelf());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *selfKey = "self";
	json_object_set_member(pJsonObject, selfKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelexecution()
{
	return httpnsadobecomadobecloudrelexecution;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelexecution(HalLink  httpnsadobecomadobecloudrelexecution)
{
	this->httpnsadobecomadobecloudrelexecution = httpnsadobecomadobecloudrelexecution;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelpipeline()
{
	return httpnsadobecomadobecloudrelpipeline;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelpipeline(HalLink  httpnsadobecomadobecloudrelpipeline)
{
	this->httpnsadobecomadobecloudrelpipeline = httpnsadobecomadobecloudrelpipeline;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelpipelinelogs()
{
	return httpnsadobecomadobecloudrelpipelinelogs;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelpipelinelogs(HalLink  httpnsadobecomadobecloudrelpipelinelogs)
{
	this->httpnsadobecomadobecloudrelpipelinelogs = httpnsadobecomadobecloudrelpipelinelogs;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelpipelinemetrics()
{
	return httpnsadobecomadobecloudrelpipelinemetrics;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelpipelinemetrics(HalLink  httpnsadobecomadobecloudrelpipelinemetrics)
{
	this->httpnsadobecomadobecloudrelpipelinemetrics = httpnsadobecomadobecloudrelpipelinemetrics;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelpipelineadvance()
{
	return httpnsadobecomadobecloudrelpipelineadvance;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelpipelineadvance(HalLink  httpnsadobecomadobecloudrelpipelineadvance)
{
	this->httpnsadobecomadobecloudrelpipelineadvance = httpnsadobecomadobecloudrelpipelineadvance;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelpipelinecancel()
{
	return httpnsadobecomadobecloudrelpipelinecancel;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelpipelinecancel(HalLink  httpnsadobecomadobecloudrelpipelinecancel)
{
	this->httpnsadobecomadobecloudrelpipelinecancel = httpnsadobecomadobecloudrelpipelinecancel;
}

HalLink
PipelineExecutionStepState__links::getHttpnsadobecomadobecloudrelprogram()
{
	return httpnsadobecomadobecloudrelprogram;
}

void
PipelineExecutionStepState__links::setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram)
{
	this->httpnsadobecomadobecloudrelprogram = httpnsadobecomadobecloudrelprogram;
}

HalLink
PipelineExecutionStepState__links::getSelf()
{
	return self;
}

void
PipelineExecutionStepState__links::setSelf(HalLink  self)
{
	this->self = self;
}


