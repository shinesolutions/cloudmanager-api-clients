<?php
/**
 * PipelineLinks
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
 * Class representing the PipelineLinks model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class PipelineLinks 
{
        /**
     * @var OpenAPI\Server\Model\HalLink|null
     * @SerializedName("http://ns.adobe.com/adobecloud/rel/program")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $httpNsAdobeComAdobecloudRelProgram;

    /**
     * @var OpenAPI\Server\Model\HalLink|null
     * @SerializedName("http://ns.adobe.com/adobecloud/rel/execution")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $httpNsAdobeComAdobecloudRelExecution;

    /**
     * @var OpenAPI\Server\Model\HalLink|null
     * @SerializedName("http://ns.adobe.com/adobecloud/rel/executions")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $httpNsAdobeComAdobecloudRelExecutions;

    /**
     * @var OpenAPI\Server\Model\HalLink|null
     * @SerializedName("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;

    /**
     * @var OpenAPI\Server\Model\HalLink|null
     * @SerializedName("self")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $self;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->httpNsAdobeComAdobecloudRelProgram = isset($data['httpNsAdobeComAdobecloudRelProgram']) ? $data['httpNsAdobeComAdobecloudRelProgram'] : null;
        $this->httpNsAdobeComAdobecloudRelExecution = isset($data['httpNsAdobeComAdobecloudRelExecution']) ? $data['httpNsAdobeComAdobecloudRelExecution'] : null;
        $this->httpNsAdobeComAdobecloudRelExecutions = isset($data['httpNsAdobeComAdobecloudRelExecutions']) ? $data['httpNsAdobeComAdobecloudRelExecutions'] : null;
        $this->httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = isset($data['httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution']) ? $data['httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution'] : null;
        $this->self = isset($data['self']) ? $data['self'] : null;
    }

    /**
     * Gets httpNsAdobeComAdobecloudRelProgram.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getHttpNsAdobeComAdobecloudRelProgram(): ?HalLink
    {
        return $this->httpNsAdobeComAdobecloudRelProgram;
    }

    /**
     * Sets httpNsAdobeComAdobecloudRelProgram.
     *
     * @param OpenAPI\Server\Model\HalLink|null $httpNsAdobeComAdobecloudRelProgram
     *
     * @return $this
     */
    public function setHttpNsAdobeComAdobecloudRelProgram(HalLink $httpNsAdobeComAdobecloudRelProgram = null): ?HalLink
    {
        $this->httpNsAdobeComAdobecloudRelProgram = $httpNsAdobeComAdobecloudRelProgram;

        return $this;
    }

    /**
     * Gets httpNsAdobeComAdobecloudRelExecution.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getHttpNsAdobeComAdobecloudRelExecution(): ?HalLink
    {
        return $this->httpNsAdobeComAdobecloudRelExecution;
    }

    /**
     * Sets httpNsAdobeComAdobecloudRelExecution.
     *
     * @param OpenAPI\Server\Model\HalLink|null $httpNsAdobeComAdobecloudRelExecution
     *
     * @return $this
     */
    public function setHttpNsAdobeComAdobecloudRelExecution(HalLink $httpNsAdobeComAdobecloudRelExecution = null): ?HalLink
    {
        $this->httpNsAdobeComAdobecloudRelExecution = $httpNsAdobeComAdobecloudRelExecution;

        return $this;
    }

    /**
     * Gets httpNsAdobeComAdobecloudRelExecutions.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getHttpNsAdobeComAdobecloudRelExecutions(): ?HalLink
    {
        return $this->httpNsAdobeComAdobecloudRelExecutions;
    }

    /**
     * Sets httpNsAdobeComAdobecloudRelExecutions.
     *
     * @param OpenAPI\Server\Model\HalLink|null $httpNsAdobeComAdobecloudRelExecutions
     *
     * @return $this
     */
    public function setHttpNsAdobeComAdobecloudRelExecutions(HalLink $httpNsAdobeComAdobecloudRelExecutions = null): ?HalLink
    {
        $this->httpNsAdobeComAdobecloudRelExecutions = $httpNsAdobeComAdobecloudRelExecutions;

        return $this;
    }

    /**
     * Gets httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(): ?HalLink
    {
        return $this->httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
    }

    /**
     * Sets httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution.
     *
     * @param OpenAPI\Server\Model\HalLink|null $httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
     *
     * @return $this
     */
    public function setHttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink $httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = null): ?HalLink
    {
        $this->httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = $httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;

        return $this;
    }

    /**
     * Gets self.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getSelf(): ?HalLink
    {
        return $this->self;
    }

    /**
     * Sets self.
     *
     * @param OpenAPI\Server\Model\HalLink|null $self
     *
     * @return $this
     */
    public function setSelf(HalLink $self = null): ?HalLink
    {
        $this->self = $self;

        return $this;
    }
}


