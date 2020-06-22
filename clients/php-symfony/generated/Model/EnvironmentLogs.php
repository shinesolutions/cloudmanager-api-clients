<?php
/**
 * EnvironmentLogs
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
 * Class representing the EnvironmentLogs model.
 *
 * Logs of an Environment
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class EnvironmentLogs 
{
        /**
     * Name of the service
     *
     * @var string[]|null
     * @SerializedName("service")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $service;

    /**
     * Name of the Log
     *
     * @var string[]|null
     * @SerializedName("name")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected $name;

    /**
     * Number of days
     *
     * @var int|null
     * @SerializedName("days")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $days;

    /**
     * @var OpenAPI\Server\Model\EnvironmentLogsLinks|null
     * @SerializedName("_links")
     * @Assert\Type("OpenAPI\Server\Model\EnvironmentLogsLinks")
     * @Type("OpenAPI\Server\Model\EnvironmentLogsLinks")
     */
    protected $links;

    /**
     * @var OpenAPI\Server\Model\EnvironmentLogsEmbedded|null
     * @SerializedName("_embedded")
     * @Assert\Type("OpenAPI\Server\Model\EnvironmentLogsEmbedded")
     * @Type("OpenAPI\Server\Model\EnvironmentLogsEmbedded")
     */
    protected $embedded;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->service = isset($data['service']) ? $data['service'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->days = isset($data['days']) ? $data['days'] : null;
        $this->links = isset($data['links']) ? $data['links'] : null;
        $this->embedded = isset($data['embedded']) ? $data['embedded'] : null;
    }

    /**
     * Gets service.
     *
     * @return string[]|null
     */
    public function getService(): ?array
    {
        return $this->service;
    }

    /**
     * Sets service.
     *
     * @param string[]|null $service  Name of the service
     *
     * @return $this
     */
    public function setService(array $service = null): ?array
    {
        $this->service = $service;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string[]|null
     */
    public function getName(): ?array
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string[]|null $name  Name of the Log
     *
     * @return $this
     */
    public function setName(array $name = null): ?array
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets days.
     *
     * @return int|null
     */
    public function getDays()
    {
        return $this->days;
    }

    /**
     * Sets days.
     *
     * @param int|null $days  Number of days
     *
     * @return $this
     */
    public function setDays($days = null)
    {
        $this->days = $days;

        return $this;
    }

    /**
     * Gets links.
     *
     * @return OpenAPI\Server\Model\EnvironmentLogsLinks|null
     */
    public function getLinks(): ?EnvironmentLogsLinks
    {
        return $this->links;
    }

    /**
     * Sets links.
     *
     * @param OpenAPI\Server\Model\EnvironmentLogsLinks|null $links
     *
     * @return $this
     */
    public function setLinks(EnvironmentLogsLinks $links = null): ?EnvironmentLogsLinks
    {
        $this->links = $links;

        return $this;
    }

    /**
     * Gets embedded.
     *
     * @return OpenAPI\Server\Model\EnvironmentLogsEmbedded|null
     */
    public function getEmbedded(): ?EnvironmentLogsEmbedded
    {
        return $this->embedded;
    }

    /**
     * Sets embedded.
     *
     * @param OpenAPI\Server\Model\EnvironmentLogsEmbedded|null $embedded
     *
     * @return $this
     */
    public function setEmbedded(EnvironmentLogsEmbedded $embedded = null): ?EnvironmentLogsEmbedded
    {
        $this->embedded = $embedded;

        return $this;
    }
}


