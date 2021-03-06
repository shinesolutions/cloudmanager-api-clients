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
 * Variable.h
 *
 * A named value than can be set on an Environment
 */

#ifndef Variable_H_
#define Variable_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// A named value than can be set on an Environment
/// </summary>
class  Variable
{
public:
    Variable();
    virtual ~Variable();

    void validate();

    /////////////////////////////////////////////
    /// Variable members

    /// <summary>
    /// Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Value of the variable. Read-Write for non-secrets, write-only for secrets.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string const& value);
    bool valueIsSet() const;
    void unsetValue();
    /// <summary>
    /// Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();

    friend void to_json(nlohmann::json& j, const Variable& o);
    friend void from_json(const nlohmann::json& j, Variable& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Value;
    bool m_ValueIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
};

}
}
}
}

#endif /* Variable_H_ */
