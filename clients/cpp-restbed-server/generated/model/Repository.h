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
 * Repository.h
 *
 * A sourcecode repository
 */

#ifndef Repository_H_
#define Repository_H_



#include "Repository__links.h"
#include <string>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A sourcecode repository
/// </summary>
class  Repository 
{
public:
    Repository();
    virtual ~Repository();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Repository members

    /// <summary>
    /// Repository name
    /// </summary>
    std::string getRepo() const;
    void setRepo(std::string value);

    /// <summary>
    /// description
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Repository__links> get_Links() const;
    void set_Links(std::shared_ptr<Repository__links> value);
protected:
    std::string m_Repo;
    std::string m_Description;
    std::shared_ptr<Repository__links> m__links;
};

}
}
}
}

#endif /* Repository_H_ */
