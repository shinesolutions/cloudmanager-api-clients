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
 * PipelineExecutionStepState.h
 *
 * Describes the status of a particular pipeline execution step for display purposes
 */

#ifndef PipelineExecutionStepState_H_
#define PipelineExecutionStepState_H_



#include "PipelineExecutionStepState__links.h"
#include <string>
#include "Object.h"
#include <map>
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Describes the status of a particular pipeline execution step for display purposes
/// </summary>
class  PipelineExecutionStepState 
{
public:
    PipelineExecutionStepState();
    virtual ~PipelineExecutionStepState();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// PipelineExecutionStepState members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getStepId() const;
    void setStepId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getPhaseId() const;
    void setPhaseId(std::string value);

    /// <summary>
    /// Name of the action
    /// </summary>
    std::string getAction() const;
    void setAction(std::string value);

    /// <summary>
    /// Target repository
    /// </summary>
    std::string getRepository() const;
    void setRepository(std::string value);

    /// <summary>
    /// Target branch
    /// </summary>
    std::string getBranch() const;
    void setBranch(std::string value);

    /// <summary>
    /// Target environment
    /// </summary>
    std::string getEnvironment() const;
    void setEnvironment(std::string value);

    /// <summary>
    /// Target environment type
    /// </summary>
    std::string getEnvironmentType() const;
    void setEnvironmentType(std::string value);

    /// <summary>
    /// Start time
    /// </summary>
    std::string getStartedAt() const;
    void setStartedAt(std::string value);

    /// <summary>
    /// Date the execution reached a final state
    /// </summary>
    std::string getFinishedAt() const;
    void setFinishedAt(std::string value);

    /// <summary>
    /// Information about step result
    /// </summary>
    std::map<std::string, std::shared_ptr<Object>> getDetails() const;
    void setDetails(std::map<std::string, std::shared_ptr<Object>> value);

    /// <summary>
    /// Action status
    /// </summary>
    std::string getStatus() const;
    void setStatus(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PipelineExecutionStepState__links> get_Links() const;
    void set_Links(std::shared_ptr<PipelineExecutionStepState__links> value);
protected:
    std::string m_Id;
    std::string m_StepId;
    std::string m_PhaseId;
    std::string m_Action;
    std::string m_Repository;
    std::string m_Branch;
    std::string m_Environment;
    std::string m_EnvironmentType;
    std::string m_StartedAt;
    std::string m_FinishedAt;
    std::map<std::string, std::shared_ptr<Object>> m_Details;
    std::string m_Status;
    std::shared_ptr<PipelineExecutionStepState__links> m__links;
    std::vector<std::string> m_StatusEnum;
};

}
}
}
}

#endif /* PipelineExecutionStepState_H_ */
