<?php

/**
 * InvalidParameter
 *
 * PHP version 7.1
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\Interfaces\ModelInterface;

/**
 * InvalidParameter
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class InvalidParameter implements ModelInterface
{
    private const MODEL_SCHEMA = <<<'SCHEMA'
{
  "type" : "object",
  "properties" : {
    "name" : {
      "type" : "string",
      "description" : "Name of the invalid parameter.",
      "example" : "paramName"
    },
    "reason" : {
      "type" : "string",
      "description" : "Reason of why the parameter's value is not accepted.",
      "example" : "value must be a positive number"
    }
  }
}
SCHEMA;

    /** @var string $name Name of the invalid parameter.*/
    private $name;

    /** @var string $reason Reason of why the parameter&#39;s value is not accepted.*/
    private $reason;

    /**
     * Returns model schema.
     *
     * @param bool $assoc When TRUE, returned objects will be converted into associative arrays. Default FALSE.
     *
     * @return array
     */
    public static function getOpenApiSchema($assoc = false)
    {
        return json_decode(static::MODEL_SCHEMA, $assoc);
    }
}
