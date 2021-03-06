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
 * EnvironmentLogs__embedded.h
 *
 * 
 */

#ifndef EnvironmentLogs__embedded_H_
#define EnvironmentLogs__embedded_H_



#include <vector>
#include "EnvironmentLog.h"
#include <memory>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  EnvironmentLogs__embedded 
{
public:
    EnvironmentLogs__embedded();
    virtual ~EnvironmentLogs__embedded();
    
    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// EnvironmentLogs__embedded members

    /// <summary>
    /// Links to logs
    /// </summary>
    std::vector<std::shared_ptr<EnvironmentLog>> getDownloads() const;
    void setDownloads(std::vector<std::shared_ptr<EnvironmentLog>> value);
protected:
    std::vector<std::shared_ptr<EnvironmentLog>> m_Downloads;
};

}
}
}
}

#endif /* EnvironmentLogs__embedded_H_ */
