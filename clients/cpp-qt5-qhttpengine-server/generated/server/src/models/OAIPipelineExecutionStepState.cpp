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

#include "OAIPipelineExecutionStepState.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPipelineExecutionStepState::OAIPipelineExecutionStepState(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPipelineExecutionStepState::OAIPipelineExecutionStepState() {
    this->initializeModel();
}

OAIPipelineExecutionStepState::~OAIPipelineExecutionStepState() {}

void OAIPipelineExecutionStepState::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_step_id_isSet = false;
    m_step_id_isValid = false;

    m_phase_id_isSet = false;
    m_phase_id_isValid = false;

    m_action_isSet = false;
    m_action_isValid = false;

    m_repository_isSet = false;
    m_repository_isValid = false;

    m_branch_isSet = false;
    m_branch_isValid = false;

    m_environment_isSet = false;
    m_environment_isValid = false;

    m_environment_type_isSet = false;
    m_environment_type_isValid = false;

    m_started_at_isSet = false;
    m_started_at_isValid = false;

    m_finished_at_isSet = false;
    m_finished_at_isValid = false;

    m_details_isSet = false;
    m_details_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m__links_isSet = false;
    m__links_isValid = false;
}

void OAIPipelineExecutionStepState::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPipelineExecutionStepState::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_step_id_isValid = ::OpenAPI::fromJsonValue(step_id, json[QString("stepId")]);
    m_step_id_isSet = !json[QString("stepId")].isNull() && m_step_id_isValid;

    m_phase_id_isValid = ::OpenAPI::fromJsonValue(phase_id, json[QString("phaseId")]);
    m_phase_id_isSet = !json[QString("phaseId")].isNull() && m_phase_id_isValid;

    m_action_isValid = ::OpenAPI::fromJsonValue(action, json[QString("action")]);
    m_action_isSet = !json[QString("action")].isNull() && m_action_isValid;

    m_repository_isValid = ::OpenAPI::fromJsonValue(repository, json[QString("repository")]);
    m_repository_isSet = !json[QString("repository")].isNull() && m_repository_isValid;

    m_branch_isValid = ::OpenAPI::fromJsonValue(branch, json[QString("branch")]);
    m_branch_isSet = !json[QString("branch")].isNull() && m_branch_isValid;

    m_environment_isValid = ::OpenAPI::fromJsonValue(environment, json[QString("environment")]);
    m_environment_isSet = !json[QString("environment")].isNull() && m_environment_isValid;

    m_environment_type_isValid = ::OpenAPI::fromJsonValue(environment_type, json[QString("environmentType")]);
    m_environment_type_isSet = !json[QString("environmentType")].isNull() && m_environment_type_isValid;

    m_started_at_isValid = ::OpenAPI::fromJsonValue(started_at, json[QString("startedAt")]);
    m_started_at_isSet = !json[QString("startedAt")].isNull() && m_started_at_isValid;

    m_finished_at_isValid = ::OpenAPI::fromJsonValue(finished_at, json[QString("finishedAt")]);
    m_finished_at_isSet = !json[QString("finishedAt")].isNull() && m_finished_at_isValid;

    m_details_isValid = ::OpenAPI::fromJsonValue(details, json[QString("details")]);
    m_details_isSet = !json[QString("details")].isNull() && m_details_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m__links_isValid = ::OpenAPI::fromJsonValue(_links, json[QString("_links")]);
    m__links_isSet = !json[QString("_links")].isNull() && m__links_isValid;
}

QString OAIPipelineExecutionStepState::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPipelineExecutionStepState::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_step_id_isSet) {
        obj.insert(QString("stepId"), ::OpenAPI::toJsonValue(step_id));
    }
    if (m_phase_id_isSet) {
        obj.insert(QString("phaseId"), ::OpenAPI::toJsonValue(phase_id));
    }
    if (m_action_isSet) {
        obj.insert(QString("action"), ::OpenAPI::toJsonValue(action));
    }
    if (m_repository_isSet) {
        obj.insert(QString("repository"), ::OpenAPI::toJsonValue(repository));
    }
    if (m_branch_isSet) {
        obj.insert(QString("branch"), ::OpenAPI::toJsonValue(branch));
    }
    if (m_environment_isSet) {
        obj.insert(QString("environment"), ::OpenAPI::toJsonValue(environment));
    }
    if (m_environment_type_isSet) {
        obj.insert(QString("environmentType"), ::OpenAPI::toJsonValue(environment_type));
    }
    if (m_started_at_isSet) {
        obj.insert(QString("startedAt"), ::OpenAPI::toJsonValue(started_at));
    }
    if (m_finished_at_isSet) {
        obj.insert(QString("finishedAt"), ::OpenAPI::toJsonValue(finished_at));
    }
    if (details.size() > 0) {
        obj.insert(QString("details"), ::OpenAPI::toJsonValue(details));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (_links.isSet()) {
        obj.insert(QString("_links"), ::OpenAPI::toJsonValue(_links));
    }
    return obj;
}

QString OAIPipelineExecutionStepState::getId() const {
    return id;
}
void OAIPipelineExecutionStepState::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString OAIPipelineExecutionStepState::getStepId() const {
    return step_id;
}
void OAIPipelineExecutionStepState::setStepId(const QString &step_id) {
    this->step_id = step_id;
    this->m_step_id_isSet = true;
}

QString OAIPipelineExecutionStepState::getPhaseId() const {
    return phase_id;
}
void OAIPipelineExecutionStepState::setPhaseId(const QString &phase_id) {
    this->phase_id = phase_id;
    this->m_phase_id_isSet = true;
}

QString OAIPipelineExecutionStepState::getAction() const {
    return action;
}
void OAIPipelineExecutionStepState::setAction(const QString &action) {
    this->action = action;
    this->m_action_isSet = true;
}

QString OAIPipelineExecutionStepState::getRepository() const {
    return repository;
}
void OAIPipelineExecutionStepState::setRepository(const QString &repository) {
    this->repository = repository;
    this->m_repository_isSet = true;
}

QString OAIPipelineExecutionStepState::getBranch() const {
    return branch;
}
void OAIPipelineExecutionStepState::setBranch(const QString &branch) {
    this->branch = branch;
    this->m_branch_isSet = true;
}

QString OAIPipelineExecutionStepState::getEnvironment() const {
    return environment;
}
void OAIPipelineExecutionStepState::setEnvironment(const QString &environment) {
    this->environment = environment;
    this->m_environment_isSet = true;
}

QString OAIPipelineExecutionStepState::getEnvironmentType() const {
    return environment_type;
}
void OAIPipelineExecutionStepState::setEnvironmentType(const QString &environment_type) {
    this->environment_type = environment_type;
    this->m_environment_type_isSet = true;
}

QDateTime OAIPipelineExecutionStepState::getStartedAt() const {
    return started_at;
}
void OAIPipelineExecutionStepState::setStartedAt(const QDateTime &started_at) {
    this->started_at = started_at;
    this->m_started_at_isSet = true;
}

QDateTime OAIPipelineExecutionStepState::getFinishedAt() const {
    return finished_at;
}
void OAIPipelineExecutionStepState::setFinishedAt(const QDateTime &finished_at) {
    this->finished_at = finished_at;
    this->m_finished_at_isSet = true;
}

QMap<QString, OAIObject> OAIPipelineExecutionStepState::getDetails() const {
    return details;
}
void OAIPipelineExecutionStepState::setDetails(const QMap<QString, OAIObject> &details) {
    this->details = details;
    this->m_details_isSet = true;
}

QString OAIPipelineExecutionStepState::getStatus() const {
    return status;
}
void OAIPipelineExecutionStepState::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

OAIPipelineExecutionStepState__links OAIPipelineExecutionStepState::getLinks() const {
    return _links;
}
void OAIPipelineExecutionStepState::setLinks(const OAIPipelineExecutionStepState__links &_links) {
    this->_links = _links;
    this->m__links_isSet = true;
}

bool OAIPipelineExecutionStepState::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_step_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_phase_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_action_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_repository_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_branch_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_environment_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_environment_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_started_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_finished_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (details.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
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

bool OAIPipelineExecutionStepState::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
