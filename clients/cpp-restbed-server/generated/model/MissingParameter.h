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
 * MissingParameter.h
 *
 * 
 */

#ifndef MissingParameter_H_
#define MissingParameter_H_



#include <string>
#include <memory>
#include <boost/property_tree/ptree.hpp>

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
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// MissingParameter members

    /// <summary>
    /// Name of the missing parameter.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Type of the missing parameter.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);
protected:
    std::string m_Name;
    std::string m_Type;
};

}
}
}
}

#endif /* MissingParameter_H_ */
