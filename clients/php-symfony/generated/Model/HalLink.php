<?php
/**
 * HalLink
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
 * Class representing the HalLink model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class HalLink 
{
        /**
     * @var string|null
     * @SerializedName("href")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $href;

    /**
     * @var bool|null
     * @SerializedName("templated")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected $templated;

    /**
     * @var string|null
     * @SerializedName("type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $type;

    /**
     * @var string|null
     * @SerializedName("deprecation")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $deprecation;

    /**
     * @var string|null
     * @SerializedName("profile")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $profile;

    /**
     * @var string|null
     * @SerializedName("title")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $title;

    /**
     * @var string|null
     * @SerializedName("hreflang")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $hreflang;

    /**
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->href = isset($data['href']) ? $data['href'] : null;
        $this->templated = isset($data['templated']) ? $data['templated'] : false;
        $this->type = isset($data['type']) ? $data['type'] : null;
        $this->deprecation = isset($data['deprecation']) ? $data['deprecation'] : null;
        $this->profile = isset($data['profile']) ? $data['profile'] : null;
        $this->title = isset($data['title']) ? $data['title'] : null;
        $this->hreflang = isset($data['hreflang']) ? $data['hreflang'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
    }

    /**
     * Gets href.
     *
     * @return string|null
     */
    public function getHref()
    {
        return $this->href;
    }

    /**
     * Sets href.
     *
     * @param string|null $href
     *
     * @return $this
     */
    public function setHref($href = null)
    {
        $this->href = $href;

        return $this;
    }

    /**
     * Gets templated.
     *
     * @return bool|null
     */
    public function isTemplated()
    {
        return $this->templated;
    }

    /**
     * Sets templated.
     *
     * @param bool|null $templated
     *
     * @return $this
     */
    public function setTemplated($templated = null)
    {
        $this->templated = $templated;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Sets type.
     *
     * @param string|null $type
     *
     * @return $this
     */
    public function setType($type = null)
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets deprecation.
     *
     * @return string|null
     */
    public function getDeprecation()
    {
        return $this->deprecation;
    }

    /**
     * Sets deprecation.
     *
     * @param string|null $deprecation
     *
     * @return $this
     */
    public function setDeprecation($deprecation = null)
    {
        $this->deprecation = $deprecation;

        return $this;
    }

    /**
     * Gets profile.
     *
     * @return string|null
     */
    public function getProfile()
    {
        return $this->profile;
    }

    /**
     * Sets profile.
     *
     * @param string|null $profile
     *
     * @return $this
     */
    public function setProfile($profile = null)
    {
        $this->profile = $profile;

        return $this;
    }

    /**
     * Gets title.
     *
     * @return string|null
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Sets title.
     *
     * @param string|null $title
     *
     * @return $this
     */
    public function setTitle($title = null)
    {
        $this->title = $title;

        return $this;
    }

    /**
     * Gets hreflang.
     *
     * @return string|null
     */
    public function getHreflang()
    {
        return $this->hreflang;
    }

    /**
     * Sets hreflang.
     *
     * @param string|null $hreflang
     *
     * @return $this
     */
    public function setHreflang($hreflang = null)
    {
        $this->hreflang = $hreflang;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }
}


