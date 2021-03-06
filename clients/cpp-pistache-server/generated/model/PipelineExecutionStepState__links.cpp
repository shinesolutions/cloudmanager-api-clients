/**
* Cloud Manager API
* This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
*
* The version of the OpenAPI document: 1.0.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "PipelineExecutionStepState__links.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

PipelineExecutionStepState__links::PipelineExecutionStepState__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_logsIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_metricsIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_advanceIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancelIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
    m_SelfIsSet = false;
    
}

PipelineExecutionStepState__links::~PipelineExecutionStepState__links()
{
}

void PipelineExecutionStepState__links::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const PipelineExecutionStepState__links& o)
{
    j = nlohmann::json();
    if(o.httpNsAdobeComAdobecloudRelExecutionIsSet())
        j["http://ns.adobe.com/adobecloud/rel/execution"] = o.m_Http__ns_adobe_com_adobecloud_rel_execution;
    if(o.httpNsAdobeComAdobecloudRelPipelineIsSet())
        j["http://ns.adobe.com/adobecloud/rel/pipeline"] = o.m_Http__ns_adobe_com_adobecloud_rel_pipeline;
    if(o.httpNsAdobeComAdobecloudRelPipelineLogsIsSet())
        j["http://ns.adobe.com/adobecloud/rel/pipeline/logs"] = o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_logs;
    if(o.httpNsAdobeComAdobecloudRelPipelineMetricsIsSet())
        j["http://ns.adobe.com/adobecloud/rel/pipeline/metrics"] = o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_metrics;
    if(o.httpNsAdobeComAdobecloudRelPipelineAdvanceIsSet())
        j["http://ns.adobe.com/adobecloud/rel/pipeline/advance"] = o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_advance;
    if(o.httpNsAdobeComAdobecloudRelPipelineCancelIsSet())
        j["http://ns.adobe.com/adobecloud/rel/pipeline/cancel"] = o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancel;
    if(o.httpNsAdobeComAdobecloudRelProgramIsSet())
        j["http://ns.adobe.com/adobecloud/rel/program"] = o.m_Http__ns_adobe_com_adobecloud_rel_program;
    if(o.selfIsSet())
        j["self"] = o.m_Self;
}

void from_json(const nlohmann::json& j, PipelineExecutionStepState__links& o)
{
    if(j.find("http://ns.adobe.com/adobecloud/rel/execution") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/execution").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_execution);
        o.m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/pipeline") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/pipeline").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_pipeline);
        o.m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/pipeline/logs") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/pipeline/logs").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_logs);
        o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_logsIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/pipeline/metrics") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/pipeline/metrics").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_metrics);
        o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_metricsIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/pipeline/advance") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/pipeline/advance").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_advance);
        o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_advanceIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/pipeline/cancel") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/pipeline/cancel").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancel);
        o.m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancelIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/program") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/program").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_program);
        o.m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
    } 
    if(j.find("self") != j.end())
    {
        j.at("self").get_to(o.m_Self);
        o.m_SelfIsSet = true;
    } 
}

HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelExecution() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_execution;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelExecution(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_execution = value;
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelExecutionIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_executionIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_execution()
{
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelPipeline() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelPipeline(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline = value;
    m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelPipelineIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_pipeline()
{
    m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelPipelineLogs() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_logs;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelPipelineLogs(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_logs = value;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_logsIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelPipelineLogsIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_logsIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_pipeline_logs()
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_logsIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelPipelineMetrics() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_metrics;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelPipelineMetrics(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_metrics = value;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_metricsIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelPipelineMetricsIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_metricsIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_pipeline_metrics()
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_metricsIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelPipelineAdvance() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_advance;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelPipelineAdvance(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_advance = value;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_advanceIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelPipelineAdvanceIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_advanceIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_pipeline_advance()
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_advanceIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelPipelineCancel() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancel;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelPipelineCancel(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancel = value;
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancelIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelPipelineCancelIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancelIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_pipeline_cancel()
{
    m_Http__ns_adobe_com_adobecloud_rel_pipeline_cancelIsSet = false;
}
HalLink PipelineExecutionStepState__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}
void PipelineExecutionStepState__links::setHttpNsAdobeComAdobecloudRelProgram(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_program = value;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
}
bool PipelineExecutionStepState__links::httpNsAdobeComAdobecloudRelProgramIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
}
void PipelineExecutionStepState__links::unsetHttp__ns_adobe_com_adobecloud_rel_program()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
}
HalLink PipelineExecutionStepState__links::getSelf() const
{
    return m_Self;
}
void PipelineExecutionStepState__links::setSelf(HalLink const& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}
bool PipelineExecutionStepState__links::selfIsSet() const
{
    return m_SelfIsSet;
}
void PipelineExecutionStepState__links::unsetSelf()
{
    m_SelfIsSet = false;
}

}
}
}
}

