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



#include "EnvironmentLog__links.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




EnvironmentLog__links::EnvironmentLog__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = false;
}

EnvironmentLog__links::~EnvironmentLog__links()
{
}

void EnvironmentLog__links::validate()
{
    // TODO: implement validation
}

web::json::value EnvironmentLog__links::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_logs_download);
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet)
    {
        val[utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail")] = ModelBase::toJson(m_Http__ns_adobe_com_adobecloud_rel_logs_tail);
    }

    return val;
}

bool EnvironmentLog__links::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/logs/download;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/logs/download);
            setHttpNsAdobeComAdobecloudRelLogsDownload(refVal_http://ns.adobe.com/adobecloud/rel/logs/download);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/logs/tail;
            ok &= ModelBase::fromJson(fieldValue, refVal_http://ns.adobe.com/adobecloud/rel/logs/tail);
            setHttpNsAdobeComAdobecloudRelLogsTail(refVal_http://ns.adobe.com/adobecloud/rel/logs/tail);
        }
    }
    return ok;
}

void EnvironmentLog__links::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download"), m_Http__ns_adobe_com_adobecloud_rel_logs_download));
    }
    if(m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail"), m_Http__ns_adobe_com_adobecloud_rel_logs_tail));
    }
}

bool EnvironmentLog__links::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/logs/download;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/download")), refVal_http://ns.adobe.com/adobecloud/rel/logs/download );
        setHttpNsAdobeComAdobecloudRelLogsDownload(refVal_http://ns.adobe.com/adobecloud/rel/logs/download);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail")))
    {
        std::shared_ptr<HalLink> refVal_http://ns.adobe.com/adobecloud/rel/logs/tail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("http://ns.adobe.com/adobecloud/rel/logs/tail")), refVal_http://ns.adobe.com/adobecloud/rel/logs/tail );
        setHttpNsAdobeComAdobecloudRelLogsTail(refVal_http://ns.adobe.com/adobecloud/rel/logs/tail);
    }
    return ok;
}

std::shared_ptr<HalLink> EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsDownload() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_download;
}

void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsDownload(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_download = value;
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = true;
}

bool EnvironmentLog__links::httpNsAdobeComAdobecloudRelLogsDownloadIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet;
}

void EnvironmentLog__links::unsetHttp__ns_adobe_com_adobecloud_rel_logs_download()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = false;
}
std::shared_ptr<HalLink> EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsTail() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_tail;
}

void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsTail(const std::shared_ptr<HalLink>& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_tail = value;
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = true;
}

bool EnvironmentLog__links::httpNsAdobeComAdobecloudRelLogsTailIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet;
}

void EnvironmentLog__links::unsetHttp__ns_adobe_com_adobecloud_rel_logs_tail()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = false;
}
}
}
}
}


