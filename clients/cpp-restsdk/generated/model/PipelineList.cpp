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



#include "PipelineList.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




PipelineList::PipelineList()
{
    m__totalNumberOfItems = 0;
    m__totalNumberOfItemsIsSet = false;
    m__embeddedIsSet = false;
    m__linksIsSet = false;
}

PipelineList::~PipelineList()
{
}

void PipelineList::validate()
{
    // TODO: implement validation
}

web::json::value PipelineList::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m__totalNumberOfItemsIsSet)
    {
        val[utility::conversions::to_string_t("_totalNumberOfItems")] = ModelBase::toJson(m__totalNumberOfItems);
    }
    if(m__embeddedIsSet)
    {
        val[utility::conversions::to_string_t("_embedded")] = ModelBase::toJson(m__embedded);
    }
    if(m__linksIsSet)
    {
        val[utility::conversions::to_string_t("_links")] = ModelBase::toJson(m__links);
    }

    return val;
}

bool PipelineList::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("_totalNumberOfItems")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("_totalNumberOfItems"));
        if(!fieldValue.is_null())
        {
            int32_t refVal__totalNumberOfItems;
            ok &= ModelBase::fromJson(fieldValue, refVal__totalNumberOfItems);
            setTotalNumberOfItems(refVal__totalNumberOfItems);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("_embedded")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("_embedded"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<PipelineList__embedded> refVal__embedded;
            ok &= ModelBase::fromJson(fieldValue, refVal__embedded);
            setEmbedded(refVal__embedded);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("_links")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("_links"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ProgramList__links> refVal__links;
            ok &= ModelBase::fromJson(fieldValue, refVal__links);
            setLinks(refVal__links);
        }
    }
    return ok;
}

void PipelineList::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m__totalNumberOfItemsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("_totalNumberOfItems"), m__totalNumberOfItems));
    }
    if(m__embeddedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("_embedded"), m__embedded));
    }
    if(m__linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("_links"), m__links));
    }
}

bool PipelineList::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("_totalNumberOfItems")))
    {
        int32_t refVal__totalNumberOfItems;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("_totalNumberOfItems")), refVal__totalNumberOfItems );
        setTotalNumberOfItems(refVal__totalNumberOfItems);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("_embedded")))
    {
        std::shared_ptr<PipelineList__embedded> refVal__embedded;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("_embedded")), refVal__embedded );
        setEmbedded(refVal__embedded);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("_links")))
    {
        std::shared_ptr<ProgramList__links> refVal__links;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("_links")), refVal__links );
        setLinks(refVal__links);
    }
    return ok;
}

int32_t PipelineList::getTotalNumberOfItems() const
{
    return m__totalNumberOfItems;
}

void PipelineList::setTotalNumberOfItems(int32_t value)
{
    m__totalNumberOfItems = value;
    m__totalNumberOfItemsIsSet = true;
}

bool PipelineList::totalNumberOfItemsIsSet() const
{
    return m__totalNumberOfItemsIsSet;
}

void PipelineList::unset_totalNumberOfItems()
{
    m__totalNumberOfItemsIsSet = false;
}
std::shared_ptr<PipelineList__embedded> PipelineList::getEmbedded() const
{
    return m__embedded;
}

void PipelineList::setEmbedded(const std::shared_ptr<PipelineList__embedded>& value)
{
    m__embedded = value;
    m__embeddedIsSet = true;
}

bool PipelineList::embeddedIsSet() const
{
    return m__embeddedIsSet;
}

void PipelineList::unset_embedded()
{
    m__embeddedIsSet = false;
}
std::shared_ptr<ProgramList__links> PipelineList::getLinks() const
{
    return m__links;
}

void PipelineList::setLinks(const std::shared_ptr<ProgramList__links>& value)
{
    m__links = value;
    m__linksIsSet = true;
}

bool PipelineList::linksIsSet() const
{
    return m__linksIsSet;
}

void PipelineList::unset_links()
{
    m__linksIsSet = false;
}
}
}
}
}


