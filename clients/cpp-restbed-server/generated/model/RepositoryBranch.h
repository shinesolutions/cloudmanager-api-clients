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
 * RepositoryBranch.h
 *
 * Represents a Git Branch
 */

#ifndef RepositoryBranch_H_
#define RepositoryBranch_H_



#include <string>
#include "RepositoryBranch__links.h"
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Represents a Git Branch
/// </summary>
class  RepositoryBranch 
{
public:
    RepositoryBranch();
    virtual ~RepositoryBranch();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// RepositoryBranch members

    /// <summary>
    /// Identifier of the program. Unique within the space
    /// </summary>
    std::string getProgramId() const;
    void setProgramId(std::string value);

    /// <summary>
    /// Identifier of the repository
    /// </summary>
    int64_t getRepositoryId() const;
    void setRepositoryId(int64_t value);

    /// <summary>
    /// Name of the branch
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RepositoryBranch__links> get_Links() const;
    void set_Links(std::shared_ptr<RepositoryBranch__links> value);
protected:
    std::string m_ProgramId;
    int64_t m_RepositoryId;
    std::string m_Name;
    std::shared_ptr<RepositoryBranch__links> m__links;
};

}
}
}
}

#endif /* RepositoryBranch_H_ */
