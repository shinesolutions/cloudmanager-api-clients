<?php
/**
 * RepositoryBranchLinks
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
 * Class representing the RepositoryBranchLinks model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class RepositoryBranchLinks 
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
     * @SerializedName("http://ns.adobe.com/adobecloud/rel/repository")
     * @Assert\Type("OpenAPI\Server\Model\HalLink")
     * @Type("OpenAPI\Server\Model\HalLink")
     */
    protected $httpNsAdobeComAdobecloudRelRepository;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->httpNsAdobeComAdobecloudRelProgram = isset($data['httpNsAdobeComAdobecloudRelProgram']) ? $data['httpNsAdobeComAdobecloudRelProgram'] : null;
        $this->httpNsAdobeComAdobecloudRelRepository = isset($data['httpNsAdobeComAdobecloudRelRepository']) ? $data['httpNsAdobeComAdobecloudRelRepository'] : null;
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
     * Gets httpNsAdobeComAdobecloudRelRepository.
     *
     * @return OpenAPI\Server\Model\HalLink|null
     */
    public function getHttpNsAdobeComAdobecloudRelRepository(): ?HalLink
    {
        return $this->httpNsAdobeComAdobecloudRelRepository;
    }

    /**
     * Sets httpNsAdobeComAdobecloudRelRepository.
     *
     * @param OpenAPI\Server\Model\HalLink|null $httpNsAdobeComAdobecloudRelRepository
     *
     * @return $this
     */
    public function setHttpNsAdobeComAdobecloudRelRepository(HalLink $httpNsAdobeComAdobecloudRelRepository = null): ?HalLink
    {
        $this->httpNsAdobeComAdobecloudRelRepository = $httpNsAdobeComAdobecloudRelRepository;

        return $this;
    }
}


