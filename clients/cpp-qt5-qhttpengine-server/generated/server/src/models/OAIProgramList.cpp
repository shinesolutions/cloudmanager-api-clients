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

#include "OAIProgramList.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIProgramList::OAIProgramList(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIProgramList::OAIProgramList() {
    this->initializeModel();
}

OAIProgramList::~OAIProgramList() {}

void OAIProgramList::initializeModel() {

    m__total_number_of_items_isSet = false;
    m__total_number_of_items_isValid = false;

    m__embedded_isSet = false;
    m__embedded_isValid = false;

    m__links_isSet = false;
    m__links_isValid = false;
}

void OAIProgramList::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIProgramList::fromJsonObject(QJsonObject json) {

    m__total_number_of_items_isValid = ::OpenAPI::fromJsonValue(_total_number_of_items, json[QString("_totalNumberOfItems")]);
    m__total_number_of_items_isSet = !json[QString("_totalNumberOfItems")].isNull() && m__total_number_of_items_isValid;

    m__embedded_isValid = ::OpenAPI::fromJsonValue(_embedded, json[QString("_embedded")]);
    m__embedded_isSet = !json[QString("_embedded")].isNull() && m__embedded_isValid;

    m__links_isValid = ::OpenAPI::fromJsonValue(_links, json[QString("_links")]);
    m__links_isSet = !json[QString("_links")].isNull() && m__links_isValid;
}

QString OAIProgramList::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIProgramList::asJsonObject() const {
    QJsonObject obj;
    if (m__total_number_of_items_isSet) {
        obj.insert(QString("_totalNumberOfItems"), ::OpenAPI::toJsonValue(_total_number_of_items));
    }
    if (_embedded.isSet()) {
        obj.insert(QString("_embedded"), ::OpenAPI::toJsonValue(_embedded));
    }
    if (_links.isSet()) {
        obj.insert(QString("_links"), ::OpenAPI::toJsonValue(_links));
    }
    return obj;
}

qint32 OAIProgramList::getTotalNumberOfItems() const {
    return _total_number_of_items;
}
void OAIProgramList::setTotalNumberOfItems(const qint32 &_total_number_of_items) {
    this->_total_number_of_items = _total_number_of_items;
    this->m__total_number_of_items_isSet = true;
}

OAIProgramList__embedded OAIProgramList::getEmbedded() const {
    return _embedded;
}
void OAIProgramList::setEmbedded(const OAIProgramList__embedded &_embedded) {
    this->_embedded = _embedded;
    this->m__embedded_isSet = true;
}

OAIProgramList__links OAIProgramList::getLinks() const {
    return _links;
}
void OAIProgramList::setLinks(const OAIProgramList__links &_links) {
    this->_links = _links;
    this->m__links_isSet = true;
}

bool OAIProgramList::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__total_number_of_items_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (_embedded.isSet()) {
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

bool OAIProgramList::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
