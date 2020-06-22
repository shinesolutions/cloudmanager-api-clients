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
 * OAIRequestedPageDetails.h
 *
 * Filtering and sorting page details
 */

#ifndef OAIRequestedPageDetails_H
#define OAIRequestedPageDetails_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRequestedPageDetails : public OAIObject {
public:
    OAIRequestedPageDetails();
    OAIRequestedPageDetails(QString json);
    ~OAIRequestedPageDetails() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getStart() const;
    void setStart(const qint32 &start);

    qint32 getLimit() const;
    void setLimit(const qint32 &limit);

    QString getOrderBy() const;
    void setOrderBy(const QString &order_by);

    QList<QString> getProperty() const;
    void setProperty(const QList<QString> &property);

    QString getType() const;
    void setType(const QString &type);

    qint32 getNext() const;
    void setNext(const qint32 &next);

    qint32 getPrev() const;
    void setPrev(const qint32 &prev);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 start;
    bool m_start_isSet;
    bool m_start_isValid;

    qint32 limit;
    bool m_limit_isSet;
    bool m_limit_isValid;

    QString order_by;
    bool m_order_by_isSet;
    bool m_order_by_isValid;

    QList<QString> property;
    bool m_property_isSet;
    bool m_property_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    qint32 next;
    bool m_next_isSet;
    bool m_next_isValid;

    qint32 prev;
    bool m_prev_isSet;
    bool m_prev_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRequestedPageDetails)

#endif // OAIRequestedPageDetails_H
