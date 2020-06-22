<?php
/**
 * VariableList
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the VariableList model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class VariableList 
{
        /**
     * @var int|null
     * @SerializedName("_totalNumberOfItems")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $totalNumberOfItems;

    /**
     * @var OpenAPI\Server\Model\VariableListEmbedded|null
     * @SerializedName("_embedded")
     * @Assert\Type("OpenAPI\Server\Model\VariableListEmbedded")
     * @Type("OpenAPI\Server\Model\VariableListEmbedded")
     */
    protected $embedded;

    /**
     * @var OpenAPI\Server\Model\VariableListLinks|null
     * @SerializedName("_links")
     * @Assert\Type("OpenAPI\Server\Model\VariableListLinks")
     * @Type("OpenAPI\Server\Model\VariableListLinks")
     */
    protected $links;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->totalNumberOfItems = isset($data['totalNumberOfItems']) ? $data['totalNumberOfItems'] : null;
        $this->embedded = isset($data['embedded']) ? $data['embedded'] : null;
        $this->links = isset($data['links']) ? $data['links'] : null;
    }

    /**
     * Gets totalNumberOfItems.
     *
     * @return int|null
     */
    public function getTotalNumberOfItems()
    {
        return $this->totalNumberOfItems;
    }

    /**
     * Sets totalNumberOfItems.
     *
     * @param int|null $totalNumberOfItems
     *
     * @return $this
     */
    public function setTotalNumberOfItems($totalNumberOfItems = null)
    {
        $this->totalNumberOfItems = $totalNumberOfItems;

        return $this;
    }

    /**
     * Gets embedded.
     *
     * @return OpenAPI\Server\Model\VariableListEmbedded|null
     */
    public function getEmbedded(): ?VariableListEmbedded
    {
        return $this->embedded;
    }

    /**
     * Sets embedded.
     *
     * @param OpenAPI\Server\Model\VariableListEmbedded|null $embedded
     *
     * @return $this
     */
    public function setEmbedded(VariableListEmbedded $embedded = null): ?VariableListEmbedded
    {
        $this->embedded = $embedded;

        return $this;
    }

    /**
     * Gets links.
     *
     * @return OpenAPI\Server\Model\VariableListLinks|null
     */
    public function getLinks(): ?VariableListLinks
    {
        return $this->links;
    }

    /**
     * Sets links.
     *
     * @param OpenAPI\Server\Model\VariableListLinks|null $links
     *
     * @return $this
     */
    public function setLinks(VariableListLinks $links = null): ?VariableListLinks
    {
        $this->links = $links;

        return $this;
    }
}


