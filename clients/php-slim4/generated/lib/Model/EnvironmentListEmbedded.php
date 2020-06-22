<?php

/**
 * EnvironmentListEmbedded
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
 * EnvironmentListEmbedded
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class EnvironmentListEmbedded implements ModelInterface
{
    private const MODEL_SCHEMA = <<<'SCHEMA'
{
  "properties" : {
    "environments" : {
      "type" : "array",
      "items" : {
        "$ref" : "#/components/schemas/Environment"
      }
    }
  }
}
SCHEMA;

    /** @var \OpenAPIServer\Model\Environment[] $environments */
    private $environments;

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
