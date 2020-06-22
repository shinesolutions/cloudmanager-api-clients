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
 * OAIEnvironment.h
 *
 * An Environment that 
 */

#ifndef OAIEnvironment_H
#define OAIEnvironment_H

#include <QJsonObject>

#include "OAIEnvironment__links.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIEnvironment : public OAIObject {
public:
    OAIEnvironment();
    OAIEnvironment(QString json);
    ~OAIEnvironment() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);

    QString getProgramId() const;
    void setProgramId(const QString &program_id);

    QString getName() const;
    void setName(const QString &name);

    QString getDescription() const;
    void setDescription(const QString &description);

    QString getType() const;
    void setType(const QString &type);

    OAIEnvironment__links getLinks() const;
    void setLinks(const OAIEnvironment__links &_links);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString program_id;
    bool m_program_id_isSet;
    bool m_program_id_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIEnvironment__links _links;
    bool m__links_isSet;
    bool m__links_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIEnvironment)

#endif // OAIEnvironment_H
