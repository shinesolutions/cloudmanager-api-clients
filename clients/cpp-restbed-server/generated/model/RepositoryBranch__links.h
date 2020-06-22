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

/*
 * RepositoryBranch__links.h
 *
 * 
 */

#ifndef RepositoryBranch__links_H_
#define RepositoryBranch__links_H_



#include "HalLink.h"
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RepositoryBranch__links 
{
public:
    RepositoryBranch__links();
    virtual ~RepositoryBranch__links();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// RepositoryBranch__links members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<HalLink> getHttpNsAdobeComAdobecloudRelProgram() const;
    void setHttpNsAdobeComAdobecloudRelProgram(std::shared_ptr<HalLink> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<HalLink> getHttpNsAdobeComAdobecloudRelRepository() const;
    void setHttpNsAdobeComAdobecloudRelRepository(std::shared_ptr<HalLink> value);
protected:
    std::shared_ptr<HalLink> m_Http__ns_adobe_com_adobecloud_rel_program;
    std::shared_ptr<HalLink> m_Http__ns_adobe_com_adobecloud_rel_repository;
};

}
}
}
}

#endif /* RepositoryBranch__links_H_ */
