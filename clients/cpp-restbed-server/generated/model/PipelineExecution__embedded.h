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
 * PipelineExecution__embedded.h
 *
 * 
 */

#ifndef PipelineExecution__embedded_H_
#define PipelineExecution__embedded_H_



#include "PipelineExecutionStepState.h"
#include <vector>
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  PipelineExecution__embedded 
{
public:
    PipelineExecution__embedded();
    virtual ~PipelineExecution__embedded();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// PipelineExecution__embedded members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<PipelineExecutionStepState>> getStepStates() const;
    void setStepStates(std::vector<std::shared_ptr<PipelineExecutionStepState>> value);
protected:
    std::vector<std::shared_ptr<PipelineExecutionStepState>> m_StepStates;
};

}
}
}
}

#endif /* PipelineExecution__embedded_H_ */
