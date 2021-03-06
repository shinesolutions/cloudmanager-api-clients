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
 * OAIHalLink.h
 *
 * 
 */

#ifndef OAIHalLink_H
#define OAIHalLink_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIHalLink : public OAIObject {
public:
    OAIHalLink();
    OAIHalLink(QString json);
    ~OAIHalLink() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getHref() const;
    void setHref(const QString &href);

    bool isTemplated() const;
    void setTemplated(const bool &templated);

    QString getType() const;
    void setType(const QString &type);

    QString getDeprecation() const;
    void setDeprecation(const QString &deprecation);

    QString getProfile() const;
    void setProfile(const QString &profile);

    QString getTitle() const;
    void setTitle(const QString &title);

    QString getHreflang() const;
    void setHreflang(const QString &hreflang);

    QString getName() const;
    void setName(const QString &name);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString href;
    bool m_href_isSet;
    bool m_href_isValid;

    bool templated;
    bool m_templated_isSet;
    bool m_templated_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString deprecation;
    bool m_deprecation_isSet;
    bool m_deprecation_isValid;

    QString profile;
    bool m_profile_isSet;
    bool m_profile_isValid;

    QString title;
    bool m_title_isSet;
    bool m_title_isValid;

    QString hreflang;
    bool m_hreflang_isSet;
    bool m_hreflang_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIHalLink)

#endif // OAIHalLink_H
