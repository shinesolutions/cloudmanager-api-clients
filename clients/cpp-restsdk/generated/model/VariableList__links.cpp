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



#include "VariableList__links.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




VariableList__links::VariableList__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
    m_SelfIsSet = false;
}

VariableList__links::~VariableList__links()
{
}

void VariableList__links::validate()
{
    // TODO: implement validation
}

web::json::value VariableList__links::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_environment);
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_programIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_program);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t("self")] = ModelBase::toJson(m_Self);
    }

    return val;
}

bool VariableList__links::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/environment;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/environment);
            setHttpNsAdobeComAdobecloudRelEnvironment(refVal_http://ns.adobe.com/adobecloud/rel/environment);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/program;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/program);
            setHttpNsAdobeComAdobecloudRelProgram(refVal_http://ns.adobe.com/adobecloud/rel/program);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("self")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("self"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_self;
            ok &= ModelBase::fromJson(fieldValue, refVal_self);
            setSelf(refVal_self);
        }
    }
    return ok;
}

void VariableList__links::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment"), m_Http__ns_adobe_com_adobecloud_rel_environment));
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_programIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program"), m_Http__ns_adobe_com_adobecloud_rel_program));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("self"), m_Self));
    }
}

bool VariableList__links::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/environment;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/environment")), refVal_http://ns.adobe.com/adobecloud/rel/environment );
        setHttpNsAdobeComAdobecloudRelEnvironment(refVal_http://ns.adobe.com/adobecloud/rel/environment);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/program;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")), refVal_http://ns.adobe.com/adobecloud/rel/program );
        setHttpNsAdobeComAdobecloudRelProgram(refVal_http://ns.adobe.com/adobecloud/rel/program);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("self")))
    {
        std::shared_ptr<HalLink> refVal_self;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("self")), refVal_self );
        setSelf(refVal_self);
    }
    return ok;
}

std::shared_ptr<HalLink> VariableList__links::getHttpNsAdobeComAdobecloudRelEnvironment() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_environment;
}

void VariableList__links::setHttpNsAdobeComAdobecloudRelEnvironment(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_environment = value;
    m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet = true;
}

bool VariableList__links::httpNsAdobeComAdobecloudRelEnvironmentIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet;
}

void VariableList__links::unsetHttp__ns_adobe_com_adobecloud_rel_environment()
{
    m_Http__ns_adobe_com_adobecloud_rel_environmentIsSet = false;
}
std::shared_ptr<HalLink> VariableList__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}

void VariableList__links::setHttpNsAdobeComAdobecloudRelProgram(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_program = value;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
}

bool VariableList__links::httpNsAdobeComAdobecloudRelProgramIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
}

void VariableList__links::unsetHttp__ns_adobe_com_adobecloud_rel_program()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
}
std::shared_ptr<HalLink> VariableList__links::getSelf() const
{
    return m_Self;
}

void VariableList__links::setSelf(const std::shared_ptr<HalLink>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool VariableList__links::selfIsSet() const
{
    return m_SelfIsSet;
}

void VariableList__links::unsetSelf()
{
    m_SelfIsSet = false;
}
}
}
}
}


