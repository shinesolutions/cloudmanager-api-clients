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
/*
 * Environment__links.h
 *
 * 
 */

#ifndef Environment__links_H_
#define Environment__links_H_


#include "HalLink.h"
#include <nlohmann/json.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Environment__links
{
public:
    Environment__links();
    virtual ~Environment__links();

    void validate();

    /////////////////////////////////////////////
    /// Environment__links members

    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelProgram() const;
    void setHttpNsAdobeComAdobecloudRelProgram(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelProgramIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_program();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelPipeline() const;
    void setHttpNsAdobeComAdobecloudRelPipeline(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelPipelineIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_pipeline();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelAuthor() const;
    void setHttpNsAdobeComAdobecloudRelAuthor(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelAuthorIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_author();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelPublish() const;
    void setHttpNsAdobeComAdobecloudRelPublish(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelPublishIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_publish();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelDeveloperConsole() const;
    void setHttpNsAdobeComAdobecloudRelDeveloperConsole(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelDeveloperConsoleIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_developerConsole();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelLogs() const;
    void setHttpNsAdobeComAdobecloudRelLogs(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelLogsIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_logs();
    /// <summary>
    /// 
    /// </summary>
    HalLink getHttpNsAdobeComAdobecloudRelVariables() const;
    void setHttpNsAdobeComAdobecloudRelVariables(HalLink const& value);
    bool httpNsAdobeComAdobecloudRelVariablesIsSet() const;
    void unsetHttp__ns_adobe_com_adobecloud_rel_variables();
    /// <summary>
    /// 
    /// </summary>
    HalLink getSelf() const;
    void setSelf(HalLink const& value);
    bool selfIsSet() const;
    void unsetSelf();

    friend void to_json(nlohmann::json& j, const Environment__links& o);
    friend void from_json(const nlohmann::json& j, Environment__links& o);
protected:
    HalLink m_Http__ns_adobe_com_adobecloud_rel_program;
    bool m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_pipeline;
    bool m_Http__ns_adobe_com_adobecloud_rel_pipelineIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_author;
    bool m_Http__ns_adobe_com_adobecloud_rel_authorIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_publish;
    bool m_Http__ns_adobe_com_adobecloud_rel_publishIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_developerConsole;
    bool m_Http__ns_adobe_com_adobecloud_rel_developerConsoleIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_logs;
    bool m_Http__ns_adobe_com_adobecloud_rel_logsIsSet;
    HalLink m_Http__ns_adobe_com_adobecloud_rel_variables;
    bool m_Http__ns_adobe_com_adobecloud_rel_variablesIsSet;
    HalLink m_Self;
    bool m_SelfIsSet;
};

}
}
}
}

#endif /* Environment__links_H_ */
