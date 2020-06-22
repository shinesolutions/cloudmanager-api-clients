/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "PipelineExecutionStepState.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




PipelineExecutionStepState::PipelineExecutionStepState()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_StepId = utility::conversions::to_string_t("");
    m_StepIdIsSet = false;
    m_PhaseId = utility::conversions::to_string_t("");
    m_PhaseIdIsSet = false;
    m_Action = utility::conversions::to_string_t("");
    m_ActionIsSet = false;
    m_Repository = utility::conversions::to_string_t("");
    m_RepositoryIsSet = false;
    m_Branch = utility::conversions::to_string_t("");
    m_BranchIsSet = false;
    m_Environment = utility::conversions::to_string_t("");
    m_EnvironmentIsSet = false;
    m_EnvironmentType = utility::conversions::to_string_t("");
    m_EnvironmentTypeIsSet = false;
    m_StartedAt = utility::datetime();
    m_StartedAtIsSet = false;
    m_FinishedAt = utility::datetime();
    m_FinishedAtIsSet = false;
    m_DetailsIsSet = false;
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
    m__linksIsSet = false;
}

PipelineExecutionStepState::~PipelineExecutionStepState()
{
}

void PipelineExecutionStepState::validate()
{
    // TODO: implement validation
}

web::json::value PipelineExecutionStepState::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_StepIdIsSet)
    {
        val[utility::conversions::to_string_t("stepId")] = ModelBase::toJson(m_StepId);
    }
    if(m_PhaseIdIsSet)
    {
        val[utility::conversions::to_string_t("phaseId")] = ModelBase::toJson(m_PhaseId);
    }
    if(m_ActionIsSet)
    {
        val[utility::conversions::to_string_t("action")] = ModelBase::toJson(m_Action);
    }
    if(m_RepositoryIsSet)
    {
        val[utility::conversions::to_string_t("repository")] = ModelBase::toJson(m_Repository);
    }
    if(m_BranchIsSet)
    {
        val[utility::conversions::to_string_t("branch")] = ModelBase::toJson(m_Branch);
    }
    if(m_EnvironmentIsSet)
    {
        val[utility::conversions::to_string_t("environment")] = ModelBase::toJson(m_Environment);
    }
    if(m_EnvironmentTypeIsSet)
    {
        val[utility::conversions::to_string_t("environmentType")] = ModelBase::toJson(m_EnvironmentType);
    }
    if(m_StartedAtIsSet)
    {
        val[utility::conversions::to_string_t("startedAt")] = ModelBase::toJson(m_StartedAt);
    }
    if(m_FinishedAtIsSet)
    {
        val[utility::conversions::to_string_t("finishedAt")] = ModelBase::toJson(m_FinishedAt);
    }
    if(m_DetailsIsSet)
    {
        val[utility::conversions::to_string_t("details")] = ModelBase::toJson(m_Details);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t("status")] = ModelBase::toJson(m_Status);
    }
    if(m__linksIsSet)
    {
        val[utility::conversions::to_string_t("_links")] = ModelBase::toJson(m__links);
    }

    return val;
}

bool PipelineExecutionStepState::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_id);
            setId(refVal_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("stepId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("stepId"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_stepId;
            ok &= ModelBase::fromJson(fieldValue, refVal_stepId);
            setStepId(refVal_stepId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("phaseId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("phaseId"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_phaseId;
            ok &= ModelBase::fromJson(fieldValue, refVal_phaseId);
            setPhaseId(refVal_phaseId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("action")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("action"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_action;
            ok &= ModelBase::fromJson(fieldValue, refVal_action);
            setAction(refVal_action);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("repository")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("repository"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_repository;
            ok &= ModelBase::fromJson(fieldValue, refVal_repository);
            setRepository(refVal_repository);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("branch")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("branch"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_branch;
            ok &= ModelBase::fromJson(fieldValue, refVal_branch);
            setBranch(refVal_branch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("environment")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("environment"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_environment;
            ok &= ModelBase::fromJson(fieldValue, refVal_environment);
            setEnvironment(refVal_environment);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("environmentType")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("environmentType"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_environmentType;
            ok &= ModelBase::fromJson(fieldValue, refVal_environmentType);
            setEnvironmentType(refVal_environmentType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startedAt")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startedAt"));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_startedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_startedAt);
            setStartedAt(refVal_startedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("finishedAt")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("finishedAt"));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_finishedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_finishedAt);
            setFinishedAt(refVal_finishedAt);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("details")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("details"));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::shared_ptr<Object>> refVal_details;
            ok &= ModelBase::fromJson(fieldValue, refVal_details);
            setDetails(refVal_details);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("status")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("status"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_status;
            ok &= ModelBase::fromJson(fieldValue, refVal_status);
            setStatus(refVal_status);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("_links")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("_links"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<PipelineExecutionStepState__links> refVal__links;
            ok &= ModelBase::fromJson(fieldValue, refVal__links);
            setLinks(refVal__links);
        }
    }
    return ok;
}

void PipelineExecutionStepState::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_StepIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("stepId"), m_StepId));
    }
    if(m_PhaseIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("phaseId"), m_PhaseId));
    }
    if(m_ActionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("action"), m_Action));
    }
    if(m_RepositoryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("repository"), m_Repository));
    }
    if(m_BranchIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("branch"), m_Branch));
    }
    if(m_EnvironmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("environment"), m_Environment));
    }
    if(m_EnvironmentTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("environmentType"), m_EnvironmentType));
    }
    if(m_StartedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startedAt"), m_StartedAt));
    }
    if(m_FinishedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("finishedAt"), m_FinishedAt));
    }
    if(m_DetailsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("details"), m_Details));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("status"), m_Status));
    }
    if(m__linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("_links"), m__links));
    }
}

bool PipelineExecutionStepState::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        utility::string_t refVal_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("id")), refVal_id );
        setId(refVal_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("stepId")))
    {
        utility::string_t refVal_stepId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("stepId")), refVal_stepId );
        setStepId(refVal_stepId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("phaseId")))
    {
        utility::string_t refVal_phaseId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("phaseId")), refVal_phaseId );
        setPhaseId(refVal_phaseId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("action")))
    {
        utility::string_t refVal_action;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("action")), refVal_action );
        setAction(refVal_action);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("repository")))
    {
        utility::string_t refVal_repository;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("repository")), refVal_repository );
        setRepository(refVal_repository);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("branch")))
    {
        utility::string_t refVal_branch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("branch")), refVal_branch );
        setBranch(refVal_branch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("environment")))
    {
        utility::string_t refVal_environment;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("environment")), refVal_environment );
        setEnvironment(refVal_environment);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("environmentType")))
    {
        utility::string_t refVal_environmentType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("environmentType")), refVal_environmentType );
        setEnvironmentType(refVal_environmentType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startedAt")))
    {
        utility::datetime refVal_startedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("startedAt")), refVal_startedAt );
        setStartedAt(refVal_startedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("finishedAt")))
    {
        utility::datetime refVal_finishedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("finishedAt")), refVal_finishedAt );
        setFinishedAt(refVal_finishedAt);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("details")))
    {
        std::map<utility::string_t, std::shared_ptr<Object>> refVal_details;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("details")), refVal_details );
        setDetails(refVal_details);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("status")))
    {
        utility::string_t refVal_status;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("status")), refVal_status );
        setStatus(refVal_status);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("_links")))
    {
        std::shared_ptr<PipelineExecutionStepState__links> refVal__links;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("_links")), refVal__links );
        setLinks(refVal__links);
    }
    return ok;
}

utility::string_t PipelineExecutionStepState::getId() const
{
    return m_Id;
}

void PipelineExecutionStepState::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool PipelineExecutionStepState::idIsSet() const
{
    return m_IdIsSet;
}

void PipelineExecutionStepState::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t PipelineExecutionStepState::getStepId() const
{
    return m_StepId;
}

void PipelineExecutionStepState::setStepId(const utility::string_t& value)
{
    m_StepId = value;
    m_StepIdIsSet = true;
}

bool PipelineExecutionStepState::stepIdIsSet() const
{
    return m_StepIdIsSet;
}

void PipelineExecutionStepState::unsetStepId()
{
    m_StepIdIsSet = false;
}
utility::string_t PipelineExecutionStepState::getPhaseId() const
{
    return m_PhaseId;
}

void PipelineExecutionStepState::setPhaseId(const utility::string_t& value)
{
    m_PhaseId = value;
    m_PhaseIdIsSet = true;
}

bool PipelineExecutionStepState::phaseIdIsSet() const
{
    return m_PhaseIdIsSet;
}

void PipelineExecutionStepState::unsetPhaseId()
{
    m_PhaseIdIsSet = false;
}
utility::string_t PipelineExecutionStepState::getAction() const
{
    return m_Action;
}

void PipelineExecutionStepState::setAction(const utility::string_t& value)
{
    m_Action = value;
    m_ActionIsSet = true;
}

bool PipelineExecutionStepState::actionIsSet() const
{
    return m_ActionIsSet;
}

void PipelineExecutionStepState::unsetAction()
{
    m_ActionIsSet = false;
}
utility::string_t PipelineExecutionStepState::getRepository() const
{
    return m_Repository;
}

void PipelineExecutionStepState::setRepository(const utility::string_t& value)
{
    m_Repository = value;
    m_RepositoryIsSet = true;
}

bool PipelineExecutionStepState::repositoryIsSet() const
{
    return m_RepositoryIsSet;
}

void PipelineExecutionStepState::unsetRepository()
{
    m_RepositoryIsSet = false;
}
utility::string_t PipelineExecutionStepState::getBranch() const
{
    return m_Branch;
}

void PipelineExecutionStepState::setBranch(const utility::string_t& value)
{
    m_Branch = value;
    m_BranchIsSet = true;
}

bool PipelineExecutionStepState::branchIsSet() const
{
    return m_BranchIsSet;
}

void PipelineExecutionStepState::unsetBranch()
{
    m_BranchIsSet = false;
}
utility::string_t PipelineExecutionStepState::getEnvironment() const
{
    return m_Environment;
}

void PipelineExecutionStepState::setEnvironment(const utility::string_t& value)
{
    m_Environment = value;
    m_EnvironmentIsSet = true;
}

bool PipelineExecutionStepState::environmentIsSet() const
{
    return m_EnvironmentIsSet;
}

void PipelineExecutionStepState::unsetEnvironment()
{
    m_EnvironmentIsSet = false;
}
utility::string_t PipelineExecutionStepState::getEnvironmentType() const
{
    return m_EnvironmentType;
}

void PipelineExecutionStepState::setEnvironmentType(const utility::string_t& value)
{
    m_EnvironmentType = value;
    m_EnvironmentTypeIsSet = true;
}

bool PipelineExecutionStepState::environmentTypeIsSet() const
{
    return m_EnvironmentTypeIsSet;
}

void PipelineExecutionStepState::unsetEnvironmentType()
{
    m_EnvironmentTypeIsSet = false;
}
utility::datetime PipelineExecutionStepState::getStartedAt() const
{
    return m_StartedAt;
}

void PipelineExecutionStepState::setStartedAt(const utility::datetime& value)
{
    m_StartedAt = value;
    m_StartedAtIsSet = true;
}

bool PipelineExecutionStepState::startedAtIsSet() const
{
    return m_StartedAtIsSet;
}

void PipelineExecutionStepState::unsetStartedAt()
{
    m_StartedAtIsSet = false;
}
utility::datetime PipelineExecutionStepState::getFinishedAt() const
{
    return m_FinishedAt;
}

void PipelineExecutionStepState::setFinishedAt(const utility::datetime& value)
{
    m_FinishedAt = value;
    m_FinishedAtIsSet = true;
}

bool PipelineExecutionStepState::finishedAtIsSet() const
{
    return m_FinishedAtIsSet;
}

void PipelineExecutionStepState::unsetFinishedAt()
{
    m_FinishedAtIsSet = false;
}
std::map<utility::string_t, std::shared_ptr<Object>>& PipelineExecutionStepState::getDetails()
{
    return m_Details;
}

void PipelineExecutionStepState::setDetails(const std::map<utility::string_t, std::shared_ptr<Object>>& value)
{
    m_Details = value;
    m_DetailsIsSet = true;
}

bool PipelineExecutionStepState::detailsIsSet() const
{
    return m_DetailsIsSet;
}

void PipelineExecutionStepState::unsetDetails()
{
    m_DetailsIsSet = false;
}
utility::string_t PipelineExecutionStepState::getStatus() const
{
    return m_Status;
}

void PipelineExecutionStepState::setStatus(const utility::string_t& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool PipelineExecutionStepState::statusIsSet() const
{
    return m_StatusIsSet;
}

void PipelineExecutionStepState::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<PipelineExecutionStepState__links> PipelineExecutionStepState::getLinks() const
{
    return m__links;
}

void PipelineExecutionStepState::setLinks(const std::shared_ptr<PipelineExecutionStepState__links>& value)
{
    m__links = value;
    m__linksIsSet = true;
}

bool PipelineExecutionStepState::linksIsSet() const
{
    return m__linksIsSet;
}

void PipelineExecutionStepState::unset_links()
{
    m__linksIsSet = false;
}
}
}
}
}


