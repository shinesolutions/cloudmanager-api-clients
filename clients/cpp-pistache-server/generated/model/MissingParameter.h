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
 * MissingParameter.h
 *
 * 
 */

#ifndef MissingParameter_H_
#define MissingParameter_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  MissingParameter
{
public:
    MissingParameter();
    virtual ~MissingParameter();

    void validate();

    /////////////////////////////////////////////
    /// MissingParameter members

    /// <summary>
    /// Name of the missing parameter.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Type of the missing parameter.
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();

    friend void to_json(nlohmann::json& j, const MissingParameter& o);
    friend void from_json(const nlohmann::json& j, MissingParameter& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
};

}
}
}
}

#endif /* MissingParameter_H_ */
