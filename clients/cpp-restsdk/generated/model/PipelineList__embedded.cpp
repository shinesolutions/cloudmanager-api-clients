/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "PipelineList__embedded.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




PipelineList__embedded::PipelineList__embedded()
{
    m_PipelinesIsSet = false;
}

PipelineList__embedded::~PipelineList__embedded()
{
}

void PipelineList__embedded::validate()
{
    // TODO: implement validation
}

web::json::value PipelineList__embedded::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_PipelinesIsSet)
    {
        val[utility::conversions::to_string_t("pipelines")] = ModelBase::toJson(m_Pipelines);
    }

    return val;
}

bool PipelineList__embedded::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("pipelines")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("pipelines"));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Pipeline>> refVal_pipelines;
            ok &= ModelBase::fromJson(fieldValue, refVal_pipelines);
            setPipelines(refVal_pipelines);
        }
    }
    return ok;
}

void PipelineList__embedded::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_PipelinesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("pipelines"), m_Pipelines));
    }
}

bool PipelineList__embedded::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("pipelines")))
    {
        std::vector<std::shared_ptr<Pipeline>> refVal_pipelines;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("pipelines")), refVal_pipelines );
        setPipelines(refVal_pipelines);
    }
    return ok;
}

std::vector<std::shared_ptr<Pipeline>>& PipelineList__embedded::getPipelines()
{
    return m_Pipelines;
}

void PipelineList__embedded::setPipelines(const std::vector<std::shared_ptr<Pipeline>>& value)
{
    m_Pipelines = value;
    m_PipelinesIsSet = true;
}

bool PipelineList__embedded::pipelinesIsSet() const
{
    return m_PipelinesIsSet;
}

void PipelineList__embedded::unsetPipelines()
{
    m_PipelinesIsSet = false;
}
}
}
}
}


