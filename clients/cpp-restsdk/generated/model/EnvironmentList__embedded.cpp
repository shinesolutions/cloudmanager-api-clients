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



#include "EnvironmentList__embedded.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




EnvironmentList__embedded::EnvironmentList__embedded()
{
    m_EnvironmentsIsSet = false;
}

EnvironmentList__embedded::~EnvironmentList__embedded()
{
}

void EnvironmentList__embedded::validate()
{
    // TODO: implement validation
}

web::json::value EnvironmentList__embedded::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_EnvironmentsIsSet)
    {
        val[utility::conversions::to_string_t("environments")] = ModelBase::toJson(m_Environments);
    }

    return val;
}

bool EnvironmentList__embedded::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("environments")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("environments"));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Environment>> refVal_environments;
            ok &= ModelBase::fromJson(fieldValue, refVal_environments);
            setEnvironments(refVal_environments);
        }
    }
    return ok;
}

void EnvironmentList__embedded::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_EnvironmentsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("environments"), m_Environments));
    }
}

bool EnvironmentList__embedded::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("environments")))
    {
        std::vector<std::shared_ptr<Environment>> refVal_environments;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("environments")), refVal_environments );
        setEnvironments(refVal_environments);
    }
    return ok;
}

std::vector<std::shared_ptr<Environment>>& EnvironmentList__embedded::getEnvironments()
{
    return m_Environments;
}

void EnvironmentList__embedded::setEnvironments(const std::vector<std::shared_ptr<Environment>>& value)
{
    m_Environments = value;
    m_EnvironmentsIsSet = true;
}

bool EnvironmentList__embedded::environmentsIsSet() const
{
    return m_EnvironmentsIsSet;
}

void EnvironmentList__embedded::unsetEnvironments()
{
    m_EnvironmentsIsSet = false;
}
}
}
}
}


