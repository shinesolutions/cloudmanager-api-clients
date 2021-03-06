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
 * PipelinePhase.h
 *
 * Describes a phase of a pipeline
 */

#ifndef PipelinePhase_H_
#define PipelinePhase_H_



#include <string>
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Describes a phase of a pipeline
/// </summary>
class  PipelinePhase 
{
public:
    PipelinePhase();
    virtual ~PipelinePhase();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// PipelinePhase members

    /// <summary>
    /// Name of the phase
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Type of the phase
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
    /// </summary>
    std::string getRepositoryId() const;
    void setRepositoryId(std::string value);

    /// <summary>
    /// Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
    /// </summary>
    std::string getBranch() const;
    void setBranch(std::string value);

    /// <summary>
    /// Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
    /// </summary>
    std::string getEnvironmentId() const;
    void setEnvironmentId(std::string value);
protected:
    std::string m_Name;
    std::string m_Type;
    std::string m_RepositoryId;
    std::string m_Branch;
    std::string m_EnvironmentId;
    std::vector<std::string> m_TypeEnum;
};

}
}
}
}

#endif /* PipelinePhase_H_ */
