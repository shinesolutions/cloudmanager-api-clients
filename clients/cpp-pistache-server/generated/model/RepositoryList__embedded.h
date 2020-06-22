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
 * RepositoryList__embedded.h
 *
 * 
 */

#ifndef RepositoryList__embedded_H_
#define RepositoryList__embedded_H_


#include "Repository.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RepositoryList__embedded
{
public:
    RepositoryList__embedded();
    virtual ~RepositoryList__embedded();

    void validate();

    /////////////////////////////////////////////
    /// RepositoryList__embedded members

    /// <summary>
    /// 
    /// </summary>
    std::vector<Repository>& getRepositories();
    void setRepositories(std::vector<Repository> const& value);
    bool repositoriesIsSet() const;
    void unsetRepositories();

    friend void to_json(nlohmann::json& j, const RepositoryList__embedded& o);
    friend void from_json(const nlohmann::json& j, RepositoryList__embedded& o);
protected:
    std::vector<Repository> m_Repositories;
    bool m_RepositoriesIsSet;
};

}
}
}
}

#endif /* RepositoryList__embedded_H_ */
