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
 * OAIPipelinePhase.h
 *
 * Describes a phase of a pipeline
 */

#ifndef OAIPipelinePhase_H
#define OAIPipelinePhase_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPipelinePhase : public OAIObject {
public:
    OAIPipelinePhase();
    OAIPipelinePhase(QString json);
    ~OAIPipelinePhase() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);

    QString getType() const;
    void setType(const QString &type);

    QString getRepositoryId() const;
    void setRepositoryId(const QString &repository_id);

    QString getBranch() const;
    void setBranch(const QString &branch);

    QString getEnvironmentId() const;
    void setEnvironmentId(const QString &environment_id);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString repository_id;
    bool m_repository_id_isSet;
    bool m_repository_id_isValid;

    QString branch;
    bool m_branch_isSet;
    bool m_branch_isValid;

    QString environment_id;
    bool m_environment_id_isSet;
    bool m_environment_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPipelinePhase)

#endif // OAIPipelinePhase_H
