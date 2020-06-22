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

#include "OAIProgramList__links.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIProgramList__links::OAIProgramList__links(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIProgramList__links::OAIProgramList__links() {
    this->initializeModel();
}

OAIProgramList__links::~OAIProgramList__links() {}

void OAIProgramList__links::initializeModel() {

    m_next_isSet = false;
    m_next_isValid = false;

    m_prev_isSet = false;
    m_prev_isValid = false;

    m_self_isSet = false;
    m_self_isValid = false;
}

void OAIProgramList__links::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIProgramList__links::fromJsonObject(QJsonObject json) {

    m_next_isValid = ::OpenAPI::fromJsonValue(next, json[QString("next")]);
    m_next_isSet = !json[QString("next")].isNull() && m_next_isValid;

    m_prev_isValid = ::OpenAPI::fromJsonValue(prev, json[QString("prev")]);
    m_prev_isSet = !json[QString("prev")].isNull() && m_prev_isValid;

    m_self_isValid = ::OpenAPI::fromJsonValue(self, json[QString("self")]);
    m_self_isSet = !json[QString("self")].isNull() && m_self_isValid;
}

QString OAIProgramList__links::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIProgramList__links::asJsonObject() const {
    QJsonObject obj;
    if (next.isSet()) {
        obj.insert(QString("next"), ::OpenAPI::toJsonValue(next));
    }
    if (prev.isSet()) {
        obj.insert(QString("prev"), ::OpenAPI::toJsonValue(prev));
    }
    if (self.isSet()) {
        obj.insert(QString("self"), ::OpenAPI::toJsonValue(self));
    }
    return obj;
}

OAIHalLink OAIProgramList__links::getNext() const {
    return next;
}
void OAIProgramList__links::setNext(const OAIHalLink &next) {
    this->next = next;
    this->m_next_isSet = true;
}

OAIHalLink OAIProgramList__links::getPrev() const {
    return prev;
}
void OAIProgramList__links::setPrev(const OAIHalLink &prev) {
    this->prev = prev;
    this->m_prev_isSet = true;
}

OAIHalLink OAIProgramList__links::getSelf() const {
    return self;
}
void OAIProgramList__links::setSelf(const OAIHalLink &self) {
    this->self = self;
    this->m_self_isSet = true;
}

bool OAIProgramList__links::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (next.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (prev.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (self.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIProgramList__links::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
