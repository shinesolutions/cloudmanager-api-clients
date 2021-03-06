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
 * OAIRepository__links.h
 *
 * 
 */

#ifndef OAIRepository__links_H
#define OAIRepository__links_H

#include <QJsonObject>

#include "OAIHalLink.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRepository__links : public OAIObject {
public:
    OAIRepository__links();
    OAIRepository__links(QString json);
    ~OAIRepository__links() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIHalLink getHttpNsAdobeComAdobecloudRelProgram() const;
    void setHttpNsAdobeComAdobecloudRelProgram(const OAIHalLink &http__ns_adobe_com_adobecloud_rel_program);

    OAIHalLink getHttpNsAdobeComAdobecloudRelBranches() const;
    void setHttpNsAdobeComAdobecloudRelBranches(const OAIHalLink &http__ns_adobe_com_adobecloud_rel_branches);

    OAIHalLink getSelf() const;
    void setSelf(const OAIHalLink &self);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIHalLink http__ns_adobe_com_adobecloud_rel_program;
    bool m_http__ns_adobe_com_adobecloud_rel_program_isSet;
    bool m_http__ns_adobe_com_adobecloud_rel_program_isValid;

    OAIHalLink http__ns_adobe_com_adobecloud_rel_branches;
    bool m_http__ns_adobe_com_adobecloud_rel_branches_isSet;
    bool m_http__ns_adobe_com_adobecloud_rel_branches_isValid;

    OAIHalLink self;
    bool m_self_isSet;
    bool m_self_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRepository__links)

#endif // OAIRepository__links_H
