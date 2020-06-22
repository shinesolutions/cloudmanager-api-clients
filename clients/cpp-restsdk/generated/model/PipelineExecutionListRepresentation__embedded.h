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
 * PipelineExecutionListRepresentation__embedded.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineExecutionListRepresentation__embedded_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineExecutionListRepresentation__embedded_H_


#include "../ModelBase.h"

#include "PipelineExecution.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  PipelineExecutionListRepresentation__embedded
    : public ModelBase
{
public:
    PipelineExecutionListRepresentation__embedded();
    virtual ~PipelineExecutionListRepresentation__embedded();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PipelineExecutionListRepresentation__embedded members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<PipelineExecution>>& getExecutions();
    bool executionsIsSet() const;
    void unsetExecutions();

    void setExecutions(const std::vector<std::shared_ptr<PipelineExecution>>& value);


protected:
    std::vector<std::shared_ptr<PipelineExecution>> m_Executions;
    bool m_ExecutionsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineExecutionListRepresentation__embedded_H_ */
