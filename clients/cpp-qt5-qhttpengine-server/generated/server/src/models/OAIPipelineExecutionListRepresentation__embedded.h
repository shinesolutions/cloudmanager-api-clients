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
 * OAIPipelineExecutionListRepresentation__embedded.h
 *
 * 
 */

#ifndef OAIPipelineExecutionListRepresentation__embedded_H
#define OAIPipelineExecutionListRepresentation__embedded_H

#include <QJsonObject>

#include "OAIPipelineExecution.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPipelineExecutionListRepresentation__embedded : public OAIObject {
public:
    OAIPipelineExecutionListRepresentation__embedded();
    OAIPipelineExecutionListRepresentation__embedded(QString json);
    ~OAIPipelineExecutionListRepresentation__embedded() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIPipelineExecution> getExecutions() const;
    void setExecutions(const QList<OAIPipelineExecution> &executions);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIPipelineExecution> executions;
    bool m_executions_isSet;
    bool m_executions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPipelineExecutionListRepresentation__embedded)

#endif // OAIPipelineExecutionListRepresentation__embedded_H
