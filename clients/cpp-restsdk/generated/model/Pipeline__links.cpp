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



#include "Pipeline__links.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Pipeline__links::Pipeline__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet = false;
    m_SelfIsSet = false;
}

Pipeline__links::~Pipeline__links()
{
}

void Pipeline__links::validate()
{
    // TODO: implement validation
}

web::json::value Pipeline__links::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Http__ns_adobe_com_adobecloud_rel_programIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_program);
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_executionIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_execution);
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_executions);
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t("self")] = ModelBase::toJson(m_Self);
    }

    return val;
}

bool Pipeline__links::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/execution;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/execution);
            setHttpNsAdobeComAdobecloudRelExecution(refVal_http://ns.adobe.com/adobecloud/rel/execution);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/executions;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/executions);
            setHttpNsAdobeComAdobecloudRelExecutions(refVal_http://ns.adobe.com/adobecloud/rel/executions);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution);
            setHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution);
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

void Pipeline__links::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_programIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program"), m_Http__ns_adobe_com_adobecloud_rel_program));
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_executionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution"), m_Http__ns_adobe_com_adobecloud_rel_execution));
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions"), m_Http__ns_adobe_com_adobecloud_rel_executions));
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution"), m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("self"), m_Self));
    }
}

bool Pipeline__links::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/program;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/program")), refVal_http://ns.adobe.com/adobecloud/rel/program );
        setHttpNsAdobeComAdobecloudRelProgram(refVal_http://ns.adobe.com/adobecloud/rel/program);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/execution;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/execution")), refVal_http://ns.adobe.com/adobecloud/rel/execution );
        setHttpNsAdobeComAdobecloudRelExecution(refVal_http://ns.adobe.com/adobecloud/rel/execution);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/executions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/executions")), refVal_http://ns.adobe.com/adobecloud/rel/executions );
        setHttpNsAdobeComAdobecloudRelExecutions(refVal_http://ns.adobe.com/adobecloud/rel/executions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")), refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution );
        setHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(refVal_http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("self")))
    {
        std::shared_ptr<HalLink> refVal_self;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("self")), refVal_self );
        setSelf(refVal_self);
    }
    return ok;
}

std::shared_ptr<HalLink> Pipeline__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}

void Pipeline__links::setHttpNsAdobeComAdobecloudRelProgram(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_program = value;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
}

bool Pipeline__links::httpNsAdobeComAdobecloudRelProgramIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
}

void Pipeline__links::unsetHttp__ns_adobe_com_adobecloud_rel_program()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
}
std::shared_ptr<HalLink> Pipeline__links::getHttpNsAdobeComAdobecloudRelExecution() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_execution;
}

void Pipeline__links::setHttpNsAdobeComAdobecloudRelExecution(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_execution = value;
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = true;
}

bool Pipeline__links::httpNsAdobeComAdobecloudRelExecutionIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_executionIsSet;
}

void Pipeline__links::unsetHttp__ns_adobe_com_adobecloud_rel_execution()
{
    m_Http__ns_adobe_com_adobecloud_rel_executionIsSet = false;
}
std::shared_ptr<HalLink> Pipeline__links::getHttpNsAdobeComAdobecloudRelExecutions() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_executions;
}

void Pipeline__links::setHttpNsAdobeComAdobecloudRelExecutions(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_executions = value;
    m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet = true;
}

bool Pipeline__links::httpNsAdobeComAdobecloudRelExecutionsIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet;
}

void Pipeline__links::unsetHttp__ns_adobe_com_adobecloud_rel_executions()
{
    m_Http__ns_adobe_com_adobecloud_rel_executionsIsSet = false;
}
std::shared_ptr<HalLink> Pipeline__links::getHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution;
}

void Pipeline__links::setHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution = value;
    m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet = true;
}

bool Pipeline__links::httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecutionIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet;
}

void Pipeline__links::unsetHttp__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecution()
{
    m_Http__ns_adobe_com_adobecloud_rel_rollbackLastSuccessfulExecutionIsSet = false;
}
std::shared_ptr<HalLink> Pipeline__links::getSelf() const
{
    return m_Self;
}

void Pipeline__links::setSelf(const std::shared_ptr<HalLink>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool Pipeline__links::selfIsSet() const
{
    return m_SelfIsSet;
}

void Pipeline__links::unsetSelf()
{
    m_SelfIsSet = false;
}
}
}
}
}


