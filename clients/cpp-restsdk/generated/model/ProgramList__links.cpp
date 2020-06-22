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



#include "ProgramList__links.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




ProgramList__links::ProgramList__links()
{
    m_NextIsSet = false;
    m_PrevIsSet = false;
    m_SelfIsSet = false;
}

ProgramList__links::~ProgramList__links()
{
}

void ProgramList__links::validate()
{
    // TODO: implement validation
}

web::json::value ProgramList__links::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NextIsSet)
    {
        val[utility::conversions::to_string_t("next")] = ModelBase::toJson(m_Next);
    }
    if(m_PrevIsSet)
    {
        val[utility::conversions::to_string_t("prev")] = ModelBase::toJson(m_Prev);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t("self")] = ModelBase::toJson(m_Self);
    }

    return val;
}

bool ProgramList__links::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("next")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("next"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_next;
            ok &= ModelBase::fromJson(fieldValue, refVal_next);
            setNext(refVal_next);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("prev")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("prev"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_prev;
            ok &= ModelBase::fromJson(fieldValue, refVal_prev);
            setPrev(refVal_prev);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("self")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("self"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<HalLink> refVal_self;
            ok &= ModelBase::fromJson(fieldValue, refVal_self);
            setSelf(refVal_self);
        }
    }
    return ok;
}

void ProgramList__links::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_NextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("next"), m_Next));
    }
    if(m_PrevIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("prev"), m_Prev));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("self"), m_Self));
    }
}

bool ProgramList__links::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("next")))
    {
        std::shared_ptr<HalLink> refVal_next;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("next")), refVal_next );
        setNext(refVal_next);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("prev")))
    {
        std::shared_ptr<HalLink> refVal_prev;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("prev")), refVal_prev );
        setPrev(refVal_prev);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("self")))
    {
        std::shared_ptr<HalLink> refVal_self;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("self")), refVal_self );
        setSelf(refVal_self);
    }
    return ok;
}

std::shared_ptr<HalLink> ProgramList__links::getNext() const
{
    return m_Next;
}

void ProgramList__links::setNext(const std::shared_ptr<HalLink>& value)
{
    m_Next = value;
    m_NextIsSet = true;
}

bool ProgramList__links::nextIsSet() const
{
    return m_NextIsSet;
}

void ProgramList__links::unsetNext()
{
    m_NextIsSet = false;
}
std::shared_ptr<HalLink> ProgramList__links::getPrev() const
{
    return m_Prev;
}

void ProgramList__links::setPrev(const std::shared_ptr<HalLink>& value)
{
    m_Prev = value;
    m_PrevIsSet = true;
}

bool ProgramList__links::prevIsSet() const
{
    return m_PrevIsSet;
}

void ProgramList__links::unsetPrev()
{
    m_PrevIsSet = false;
}
std::shared_ptr<HalLink> ProgramList__links::getSelf() const
{
    return m_Self;
}

void ProgramList__links::setSelf(const std::shared_ptr<HalLink>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool ProgramList__links::selfIsSet() const
{
    return m_SelfIsSet;
}

void ProgramList__links::unsetSelf()
{
    m_SelfIsSet = false;
}
}
}
}
}


