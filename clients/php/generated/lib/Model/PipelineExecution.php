<?php
/**
 * PipelineExecution
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * PipelineExecution Class Doc Comment
 *
 * @category Class
 * @description Wraps a pipeline execution
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class PipelineExecution implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'pipelineExecution';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'string',
        'program_id' => 'string',
        'pipeline_id' => 'string',
        'artifacts_version' => 'string',
        'user' => 'string',
        'status' => 'string',
        'trigger' => 'string',
        'created_at' => '\DateTime',
        'updated_at' => '\DateTime',
        'finished_at' => '\DateTime',
        '_embedded' => '\OpenAPI\Client\Model\PipelineExecutionEmbedded',
        '_links' => '\OpenAPI\Client\Model\PipelineExecutionLinks'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'id' => null,
        'program_id' => null,
        'pipeline_id' => null,
        'artifacts_version' => null,
        'user' => null,
        'status' => null,
        'trigger' => null,
        'created_at' => 'date-time',
        'updated_at' => 'date-time',
        'finished_at' => 'date-time',
        '_embedded' => null,
        '_links' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'program_id' => 'programId',
        'pipeline_id' => 'pipelineId',
        'artifacts_version' => 'artifactsVersion',
        'user' => 'user',
        'status' => 'status',
        'trigger' => 'trigger',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'finished_at' => 'finishedAt',
        '_embedded' => '_embedded',
        '_links' => '_links'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'program_id' => 'setProgramId',
        'pipeline_id' => 'setPipelineId',
        'artifacts_version' => 'setArtifactsVersion',
        'user' => 'setUser',
        'status' => 'setStatus',
        'trigger' => 'setTrigger',
        'created_at' => 'setCreatedAt',
        'updated_at' => 'setUpdatedAt',
        'finished_at' => 'setFinishedAt',
        '_embedded' => 'setEmbedded',
        '_links' => 'setLinks'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'program_id' => 'getProgramId',
        'pipeline_id' => 'getPipelineId',
        'artifacts_version' => 'getArtifactsVersion',
        'user' => 'getUser',
        'status' => 'getStatus',
        'trigger' => 'getTrigger',
        'created_at' => 'getCreatedAt',
        'updated_at' => 'getUpdatedAt',
        'finished_at' => 'getFinishedAt',
        '_embedded' => 'getEmbedded',
        '_links' => 'getLinks'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    const STATUS_NOT_STARTED = 'NOT_STARTED';
    const STATUS_RUNNING = 'RUNNING';
    const STATUS_CANCELLING = 'CANCELLING';
    const STATUS_CANCELLED = 'CANCELLED';
    const STATUS_FINISHED = 'FINISHED';
    const STATUS_ERROR = 'ERROR';
    const STATUS_FAILED = 'FAILED';
    const TRIGGER_ON_COMMIT = 'ON_COMMIT';
    const TRIGGER_MANUAL = 'MANUAL';
    const TRIGGER_SCHEDULE = 'SCHEDULE';
    const TRIGGER_PUSH_UPGRADES = 'PUSH_UPGRADES';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getStatusAllowableValues()
    {
        return [
            self::STATUS_NOT_STARTED,
            self::STATUS_RUNNING,
            self::STATUS_CANCELLING,
            self::STATUS_CANCELLED,
            self::STATUS_FINISHED,
            self::STATUS_ERROR,
            self::STATUS_FAILED,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getTriggerAllowableValues()
    {
        return [
            self::TRIGGER_ON_COMMIT,
            self::TRIGGER_MANUAL,
            self::TRIGGER_SCHEDULE,
            self::TRIGGER_PUSH_UPGRADES,
        ];
    }
    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['program_id'] = isset($data['program_id']) ? $data['program_id'] : null;
        $this->container['pipeline_id'] = isset($data['pipeline_id']) ? $data['pipeline_id'] : null;
        $this->container['artifacts_version'] = isset($data['artifacts_version']) ? $data['artifacts_version'] : null;
        $this->container['user'] = isset($data['user']) ? $data['user'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['trigger'] = isset($data['trigger']) ? $data['trigger'] : null;
        $this->container['created_at'] = isset($data['created_at']) ? $data['created_at'] : null;
        $this->container['updated_at'] = isset($data['updated_at']) ? $data['updated_at'] : null;
        $this->container['finished_at'] = isset($data['finished_at']) ? $data['finished_at'] : null;
        $this->container['_embedded'] = isset($data['_embedded']) ? $data['_embedded'] : null;
        $this->container['_links'] = isset($data['_links']) ? $data['_links'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getStatusAllowableValues();
        if (!is_null($this->container['status']) && !in_array($this->container['status'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'status', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getTriggerAllowableValues();
        if (!is_null($this->container['trigger']) && !in_array($this->container['trigger'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'trigger', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return string|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string|null $id Pipeline execution identifier
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets program_id
     *
     * @return string|null
     */
    public function getProgramId()
    {
        return $this->container['program_id'];
    }

    /**
     * Sets program_id
     *
     * @param string|null $program_id Identifier of the program. Unique within the space.
     *
     * @return $this
     */
    public function setProgramId($program_id)
    {
        $this->container['program_id'] = $program_id;

        return $this;
    }

    /**
     * Gets pipeline_id
     *
     * @return string|null
     */
    public function getPipelineId()
    {
        return $this->container['pipeline_id'];
    }

    /**
     * Sets pipeline_id
     *
     * @param string|null $pipeline_id Identifier of the pipeline. Unique within the space.
     *
     * @return $this
     */
    public function setPipelineId($pipeline_id)
    {
        $this->container['pipeline_id'] = $pipeline_id;

        return $this;
    }

    /**
     * Gets artifacts_version
     *
     * @return string|null
     */
    public function getArtifactsVersion()
    {
        return $this->container['artifacts_version'];
    }

    /**
     * Sets artifacts_version
     *
     * @param string|null $artifacts_version Version of the artifacts generated during this execution
     *
     * @return $this
     */
    public function setArtifactsVersion($artifacts_version)
    {
        $this->container['artifacts_version'] = $artifacts_version;

        return $this;
    }

    /**
     * Gets user
     *
     * @return string|null
     */
    public function getUser()
    {
        return $this->container['user'];
    }

    /**
     * Sets user
     *
     * @param string|null $user AdobeID who started the pipeline. Empty for auto triggered builds
     *
     * @return $this
     */
    public function setUser($user)
    {
        $this->container['user'] = $user;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string|null $status Status of the execution
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $allowedValues = $this->getStatusAllowableValues();
        if (!is_null($status) && !in_array($status, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'status', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets trigger
     *
     * @return string|null
     */
    public function getTrigger()
    {
        return $this->container['trigger'];
    }

    /**
     * Sets trigger
     *
     * @param string|null $trigger How the execution was triggered.
     *
     * @return $this
     */
    public function setTrigger($trigger)
    {
        $allowedValues = $this->getTriggerAllowableValues();
        if (!is_null($trigger) && !in_array($trigger, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'trigger', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['trigger'] = $trigger;

        return $this;
    }

    /**
     * Gets created_at
     *
     * @return \DateTime|null
     */
    public function getCreatedAt()
    {
        return $this->container['created_at'];
    }

    /**
     * Sets created_at
     *
     * @param \DateTime|null $created_at Start time
     *
     * @return $this
     */
    public function setCreatedAt($created_at)
    {
        $this->container['created_at'] = $created_at;

        return $this;
    }

    /**
     * Gets updated_at
     *
     * @return \DateTime|null
     */
    public function getUpdatedAt()
    {
        return $this->container['updated_at'];
    }

    /**
     * Sets updated_at
     *
     * @param \DateTime|null $updated_at Date of last status change
     *
     * @return $this
     */
    public function setUpdatedAt($updated_at)
    {
        $this->container['updated_at'] = $updated_at;

        return $this;
    }

    /**
     * Gets finished_at
     *
     * @return \DateTime|null
     */
    public function getFinishedAt()
    {
        return $this->container['finished_at'];
    }

    /**
     * Sets finished_at
     *
     * @param \DateTime|null $finished_at Date the execution reached a final state
     *
     * @return $this
     */
    public function setFinishedAt($finished_at)
    {
        $this->container['finished_at'] = $finished_at;

        return $this;
    }

    /**
     * Gets _embedded
     *
     * @return \OpenAPI\Client\Model\PipelineExecutionEmbedded|null
     */
    public function getEmbedded()
    {
        return $this->container['_embedded'];
    }

    /**
     * Sets _embedded
     *
     * @param \OpenAPI\Client\Model\PipelineExecutionEmbedded|null $_embedded _embedded
     *
     * @return $this
     */
    public function setEmbedded($_embedded)
    {
        $this->container['_embedded'] = $_embedded;

        return $this;
    }

    /**
     * Gets _links
     *
     * @return \OpenAPI\Client\Model\PipelineExecutionLinks|null
     */
    public function getLinks()
    {
        return $this->container['_links'];
    }

    /**
     * Sets _links
     *
     * @param \OpenAPI\Client\Model\PipelineExecutionLinks|null $_links _links
     *
     * @return $this
     */
    public function setLinks($_links)
    {
        $this->container['_links'] = $_links;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


