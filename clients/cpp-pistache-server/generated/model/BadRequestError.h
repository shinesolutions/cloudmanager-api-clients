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
 * BadRequestError.h
 *
 * A Bad Request response error.
 */

#ifndef BadRequestError_H_
#define BadRequestError_H_


#include <string>
#include "InvalidParameter.h"
#include "MissingParameter.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A Bad Request response error.
/// </summary>
class  BadRequestError
{
public:
    BadRequestError();
    virtual ~BadRequestError();

    void validate();

    /////////////////////////////////////////////
    /// BadRequestError members

    /// <summary>
    /// HTTP status code of the response.
    /// </summary>
    int32_t getStatus() const;
    void setStatus(int32_t const value);
    bool statusIsSet() const;
    void unsetStatus();
    /// <summary>
    /// Error type identifier.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// A short summary of the error.
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string const& value);
    bool titleIsSet() const;
    void unsetTitle();
    /// <summary>
    /// Request&#39;s missing parameters.
    /// </summary>
    std::vector<MissingParameter>& getMissingParams();
    void setMissingParams(std::vector<MissingParameter> const& value);
    bool missingParamsIsSet() const;
    void unsetMissingParams();
    /// <summary>
    /// Request&#39;s invalid parameters.
    /// </summary>
    std::vector<InvalidParameter>& getInvalidParams();
    void setInvalidParams(std::vector<InvalidParameter> const& value);
    bool invalidParamsIsSet() const;
    void unsetInvalidParams();

    friend void to_json(nlohmann::json& j, const BadRequestError& o);
    friend void from_json(const nlohmann::json& j, BadRequestError& o);
protected:
    int32_t m_Status;
    bool m_StatusIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    std::string m_Title;
    bool m_TitleIsSet;
    std::vector<MissingParameter> m_MissingParams;
    bool m_MissingParamsIsSet;
    std::vector<InvalidParameter> m_InvalidParams;
    bool m_InvalidParamsIsSet;
};

}
}
}
}

#endif /* BadRequestError_H_ */
