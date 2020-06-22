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
 * BadRequestError.h
 *
 * A Bad Request response error.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BadRequestError_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BadRequestError_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "InvalidParameter.h"
#include "MissingParameter.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// A Bad Request response error.
/// </summary>
class  BadRequestError
    : public ModelBase
{
public:
    BadRequestError();
    virtual ~BadRequestError();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BadRequestError members

    /// <summary>
    /// HTTP status code of the response.
    /// </summary>
    int32_t getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(int32_t value);

    /// <summary>
    /// Error type identifier.
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// A short summary of the error.
    /// </summary>
    utility::string_t getTitle() const;
    bool titleIsSet() const;
    void unsetTitle();

    void setTitle(const utility::string_t& value);

    /// <summary>
    /// Request&#39;s missing parameters.
    /// </summary>
    std::vector<std::shared_ptr<MissingParameter>>& getMissingParams();
    bool missingParamsIsSet() const;
    void unsetMissingParams();

    void setMissingParams(const std::vector<std::shared_ptr<MissingParameter>>& value);

    /// <summary>
    /// Request&#39;s invalid parameters.
    /// </summary>
    std::vector<std::shared_ptr<InvalidParameter>>& getInvalidParams();
    bool invalidParamsIsSet() const;
    void unsetInvalidParams();

    void setInvalidParams(const std::vector<std::shared_ptr<InvalidParameter>>& value);


protected:
    int32_t m_Status;
    bool m_StatusIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_Title;
    bool m_TitleIsSet;
    std::vector<std::shared_ptr<MissingParameter>> m_MissingParams;
    bool m_MissingParamsIsSet;
    std::vector<std::shared_ptr<InvalidParameter>> m_InvalidParams;
    bool m_InvalidParamsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BadRequestError_H_ */
