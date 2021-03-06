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

#include "OAIEnvironmentLog__links.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIEnvironmentLog__links::OAIEnvironmentLog__links(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIEnvironmentLog__links::OAIEnvironmentLog__links() {
    this->initializeModel();
}

OAIEnvironmentLog__links::~OAIEnvironmentLog__links() {}

void OAIEnvironmentLog__links::initializeModel() {

    m_http__ns_adobe_com_adobecloud_rel_logs_download_isSet = false;
    m_http__ns_adobe_com_adobecloud_rel_logs_download_isValid = false;

    m_http__ns_adobe_com_adobecloud_rel_logs_tail_isSet = false;
    m_http__ns_adobe_com_adobecloud_rel_logs_tail_isValid = false;
}

void OAIEnvironmentLog__links::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIEnvironmentLog__links::fromJsonObject(QJsonObject json) {

    m_http__ns_adobe_com_adobecloud_rel_logs_download_isValid = ::OpenAPI::fromJsonValue(http__ns_adobe_com_adobecloud_rel_logs_download, json[QString("http://ns.adobe.com/adobecloud/rel/logs/download")]);
    m_http__ns_adobe_com_adobecloud_rel_logs_download_isSet = !json[QString("http://ns.adobe.com/adobecloud/rel/logs/download")].isNull() && m_http__ns_adobe_com_adobecloud_rel_logs_download_isValid;

    m_http__ns_adobe_com_adobecloud_rel_logs_tail_isValid = ::OpenAPI::fromJsonValue(http__ns_adobe_com_adobecloud_rel_logs_tail, json[QString("http://ns.adobe.com/adobecloud/rel/logs/tail")]);
    m_http__ns_adobe_com_adobecloud_rel_logs_tail_isSet = !json[QString("http://ns.adobe.com/adobecloud/rel/logs/tail")].isNull() && m_http__ns_adobe_com_adobecloud_rel_logs_tail_isValid;
}

QString OAIEnvironmentLog__links::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIEnvironmentLog__links::asJsonObject() const {
    QJsonObject obj;
    if (http__ns_adobe_com_adobecloud_rel_logs_download.isSet()) {
        obj.insert(QString("http://ns.adobe.com/adobecloud/rel/logs/download"), ::OpenAPI::toJsonValue(http__ns_adobe_com_adobecloud_rel_logs_download));
    }
    if (http__ns_adobe_com_adobecloud_rel_logs_tail.isSet()) {
        obj.insert(QString("http://ns.adobe.com/adobecloud/rel/logs/tail"), ::OpenAPI::toJsonValue(http__ns_adobe_com_adobecloud_rel_logs_tail));
    }
    return obj;
}

OAIHalLink OAIEnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsDownload() const {
    return http__ns_adobe_com_adobecloud_rel_logs_download;
}
void OAIEnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsDownload(const OAIHalLink &http__ns_adobe_com_adobecloud_rel_logs_download) {
    this->http__ns_adobe_com_adobecloud_rel_logs_download = http__ns_adobe_com_adobecloud_rel_logs_download;
    this->m_http__ns_adobe_com_adobecloud_rel_logs_download_isSet = true;
}

OAIHalLink OAIEnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsTail() const {
    return http__ns_adobe_com_adobecloud_rel_logs_tail;
}
void OAIEnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsTail(const OAIHalLink &http__ns_adobe_com_adobecloud_rel_logs_tail) {
    this->http__ns_adobe_com_adobecloud_rel_logs_tail = http__ns_adobe_com_adobecloud_rel_logs_tail;
    this->m_http__ns_adobe_com_adobecloud_rel_logs_tail_isSet = true;
}

bool OAIEnvironmentLog__links::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (http__ns_adobe_com_adobecloud_rel_logs_download.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (http__ns_adobe_com_adobecloud_rel_logs_tail.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIEnvironmentLog__links::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
