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

#include "OAIEnvironmentLog.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIEnvironmentLog::OAIEnvironmentLog(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIEnvironmentLog::OAIEnvironmentLog() {
    this->initializeModel();
}

OAIEnvironmentLog::~OAIEnvironmentLog() {}

void OAIEnvironmentLog::initializeModel() {

    m_service_isSet = false;
    m_service_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_date_isSet = false;
    m_date_isValid = false;

    m_program_id_isSet = false;
    m_program_id_isValid = false;

    m_environment_id_isSet = false;
    m_environment_id_isValid = false;

    m__links_isSet = false;
    m__links_isValid = false;
}

void OAIEnvironmentLog::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIEnvironmentLog::fromJsonObject(QJsonObject json) {

    m_service_isValid = ::OpenAPI::fromJsonValue(service, json[QString("service")]);
    m_service_isSet = !json[QString("service")].isNull() && m_service_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_date_isValid = ::OpenAPI::fromJsonValue(date, json[QString("date")]);
    m_date_isSet = !json[QString("date")].isNull() && m_date_isValid;

    m_program_id_isValid = ::OpenAPI::fromJsonValue(program_id, json[QString("programId")]);
    m_program_id_isSet = !json[QString("programId")].isNull() && m_program_id_isValid;

    m_environment_id_isValid = ::OpenAPI::fromJsonValue(environment_id, json[QString("environmentId")]);
    m_environment_id_isSet = !json[QString("environmentId")].isNull() && m_environment_id_isValid;

    m__links_isValid = ::OpenAPI::fromJsonValue(_links, json[QString("_links")]);
    m__links_isSet = !json[QString("_links")].isNull() && m__links_isValid;
}

QString OAIEnvironmentLog::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIEnvironmentLog::asJsonObject() const {
    QJsonObject obj;
    if (m_service_isSet) {
        obj.insert(QString("service"), ::OpenAPI::toJsonValue(service));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_date_isSet) {
        obj.insert(QString("date"), ::OpenAPI::toJsonValue(date));
    }
    if (m_program_id_isSet) {
        obj.insert(QString("programId"), ::OpenAPI::toJsonValue(program_id));
    }
    if (m_environment_id_isSet) {
        obj.insert(QString("environmentId"), ::OpenAPI::toJsonValue(environment_id));
    }
    if (_links.isSet()) {
        obj.insert(QString("_links"), ::OpenAPI::toJsonValue(_links));
    }
    return obj;
}

QString OAIEnvironmentLog::getService() const {
    return service;
}
void OAIEnvironmentLog::setService(const QString &service) {
    this->service = service;
    this->m_service_isSet = true;
}

QString OAIEnvironmentLog::getName() const {
    return name;
}
void OAIEnvironmentLog::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString OAIEnvironmentLog::getDate() const {
    return date;
}
void OAIEnvironmentLog::setDate(const QString &date) {
    this->date = date;
    this->m_date_isSet = true;
}

qint64 OAIEnvironmentLog::getProgramId() const {
    return program_id;
}
void OAIEnvironmentLog::setProgramId(const qint64 &program_id) {
    this->program_id = program_id;
    this->m_program_id_isSet = true;
}

qint64 OAIEnvironmentLog::getEnvironmentId() const {
    return environment_id;
}
void OAIEnvironmentLog::setEnvironmentId(const qint64 &environment_id) {
    this->environment_id = environment_id;
    this->m_environment_id_isSet = true;
}

OAIEnvironmentLog__links OAIEnvironmentLog::getLinks() const {
    return _links;
}
void OAIEnvironmentLog::setLinks(const OAIEnvironmentLog__links &_links) {
    this->_links = _links;
    this->m__links_isSet = true;
}

bool OAIEnvironmentLog::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_service_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_program_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_environment_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (_links.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIEnvironmentLog::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
