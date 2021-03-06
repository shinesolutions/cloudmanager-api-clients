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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PipelinePhase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PipelinePhase_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Describes a phase of a pipeline
/// </summary>
class  PipelinePhase
    : public ModelBase
{
public:
    PipelinePhase();
    virtual ~PipelinePhase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PipelinePhase members

    /// <summary>
    /// Name of the phase
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// Type of the phase
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
    /// </summary>
    utility::string_t getRepositoryId() const;
    bool repositoryIdIsSet() const;
    void unsetRepositoryId();

    void setRepositoryId(const utility::string_t& value);

    /// <summary>
    /// Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
    /// </summary>
    utility::string_t getBranch() const;
    bool branchIsSet() const;
    void unsetBranch();

    void setBranch(const utility::string_t& value);

    /// <summary>
    /// Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
    /// </summary>
    utility::string_t getEnvironmentId() const;
    bool environmentIdIsSet() const;
    void unsetEnvironmentId();

    void setEnvironmentId(const utility::string_t& value);


protected:
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_RepositoryId;
    bool m_RepositoryIdIsSet;
    utility::string_t m_Branch;
    bool m_BranchIsSet;
    utility::string_t m_EnvironmentId;
    bool m_EnvironmentIdIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PipelinePhase_H_ */
