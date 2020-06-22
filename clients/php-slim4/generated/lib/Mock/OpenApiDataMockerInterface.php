<?php

/**
 * OpenApiDataMockerInterface
 * @ref https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md#data-types
 *
 * PHP version 7.1
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */
namespace OpenAPIServer\Mock;

use InvalidArgumentException;

/**
 * OpenApiDataMockerInterface Class Doc Comment
 *
 * @package OpenAPIServer\Mock
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
interface OpenApiDataMockerInterface
{
    /** @var string DATA_TYPE_INTEGER  */
    public const DATA_TYPE_INTEGER = 'integer';

    /** @var string DATA_TYPE_NUMBER  */
    public const DATA_TYPE_NUMBER = 'number';

    /** @var string DATA_TYPE_STRING */
    public const DATA_TYPE_STRING = 'string';

    /** @var string DATA_TYPE_BOOLEAN */
    public const DATA_TYPE_BOOLEAN = 'boolean';

    /** @var string DATA_TYPE_FILE */
    public const DATA_TYPE_FILE = 'file';

    /** @var string DATA_TYPE_ARRAY */
    public const DATA_TYPE_ARRAY = 'array';

    /** @var string DATA_TYPE_OBJECT */
    public const DATA_TYPE_OBJECT = 'object';

    /** @var string DATA_FORMAT_INT32 Signed 32 bits */
    public const DATA_FORMAT_INT32 = 'int32';

    /** @var string DATA_FORMAT_INT64 Signed 64 bits */
    public const DATA_FORMAT_INT64 = 'int64';

    /** @var string DATA_FORMAT_FLOAT */
    public const DATA_FORMAT_FLOAT = 'float';

    /** @var string DATA_FORMAT_DOUBLE */
    public const DATA_FORMAT_DOUBLE = 'double';

    /** @var string DATA_FORMAT_BYTE base64 encoded characters */
    public const DATA_FORMAT_BYTE = 'byte';

    /** @var string DATA_FORMAT_BINARY Any sequence of octets */
    public const DATA_FORMAT_BINARY = 'binary';

    /** @var string DATA_FORMAT_DATE As defined by full-date [RFC3339](http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14) */
    public const DATA_FORMAT_DATE = 'date';

    /** @var string DATA_FORMAT_DATE_TIME As defined by date-time [RFC3339](http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14) */
    public const DATA_FORMAT_DATE_TIME = 'date-time';

    /** @var string DATA_FORMAT_PASSWORD Used to hint UIs the input needs to be obscured. */
    public const DATA_FORMAT_PASSWORD = 'password';

    /** @var string DATA_FORMAT_EMAIL */
    public const DATA_FORMAT_EMAIL = 'email';

    /** @var string DATA_FORMAT_UUID */
    public const DATA_FORMAT_UUID = 'uuid';

    /**
     * Mocks OpenApi Data.
     * @see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md#data-types
     *
     * @param $dataType   string     OpenApi data type. Use constants from this class
     * @param $dataFormat string     (optional) OpenApi data format
     * @param $options    array|null (optional) OpenApi data options
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return mixed
     */
    public function mock(
        $dataType,
        $dataFormat = null,
        $options = []
    );

    /**
     * Shortcut to mock integer type
     * Equivalent to mockData(DATA_TYPE_INTEGER);
     *
     * @param string|null $dataFormat       (optional) int32 or int64
     * @param number|null $minimum          (optional) Default is 0
     * @param number|null $maximum          (optional) Default is mt_getrandmax()
     * @param bool|null   $exclusiveMinimum (optional) Default is false
     * @param bool|null   $exclusiveMaximum (optional) Default is false
     *
     * @throws \InvalidArgumentException when $maximum less than $minimum or invalid arguments provided
     *
     * @return int
     */
    public function mockInteger(
        $dataFormat = null,
        $minimum = null,
        $maximum = null,
        $exclusiveMinimum = false,
        $exclusiveMaximum = false
    );

    /**
     * Shortcut to mock number type
     * Equivalent to mockData(DATA_TYPE_NUMBER);
     *
     * @param string|null $dataFormat       (optional) float or double
     * @param number|null $minimum          (optional) Default is 0
     * @param number|null $maximum          (optional) Default is mt_getrandmax()
     * @param bool|null   $exclusiveMinimum (optional) Default is false
     * @param bool|null   $exclusiveMaximum (optional) Default is false
     *
     * @throws \InvalidArgumentException when $maximum less than $minimum or invalid arguments provided
     *
     * @return float
     */
    public function mockNumber(
        $dataFormat = null,
        $minimum = null,
        $maximum = null,
        $exclusiveMinimum = false,
        $exclusiveMaximum = false
    );

    /**
     * Shortcut to mock string type
     * Equivalent to mockData(DATA_TYPE_STRING);
     *
     * @param string|null $dataFormat (optional) one of byte, binary, date, date-time, password
     * @param int|null    $minLength  (optional) Default is 0
     * @param int|null    $maxLength  (optional) Default is 100 chars
     * @param array       $enum       (optional) This array should have at least one element.
     * Elements in the array should be unique.
     * @param string|null $pattern    (optional) This string should be a valid regular expression, according to the ECMA 262 regular expression dialect.
     * Recall: regular expressions are not implicitly anchored.
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return string
     */
    public function mockString(
        $dataFormat = null,
        $minLength = 0,
        $maxLength = null,
        $enum = null,
        $pattern = null
    );

    /**
     * Shortcut to mock boolean type
     * Equivalent to mockData(DATA_TYPE_BOOLEAN);
     *
     * @return bool
     */
    public function mockBoolean();

    /**
     * Shortcut to mock array type
     * Equivalent to mockData(DATA_TYPE_ARRAY);
     *
     * @param object|array $items       Object or assoc array of described items
     * @param int|null     $minItems    (optional) An array instance is valid against "minItems" if its size is greater than, or equal to, the value of this keyword.
     * @param int|null     $maxItems    (optional) An array instance is valid against "maxItems" if its size is less than, or equal to, the value of this keyword
     * @param bool|null    $uniqueItems (optional) If it has boolean value true, the instance validates successfully if all of its elements are unique
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return array
     */
    public function mockArray(
        $items,
        $minItems = 0,
        $maxItems = null,
        $uniqueItems = false
    );

    /**
     * Shortcut to mock object type.
     * Equivalent to mockData(DATA_TYPE_OBJECT);
     *
     * @param object|array           $properties           Object or array of described properties
     * @param int|null               $minProperties        (optional) An object instance is valid against "minProperties" if its number of properties is greater than, or equal to, the value of this keyword.
     * @param int|null               $maxProperties        (optional) An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of this keyword.
     * @param bool|object|array|null $additionalProperties (optional) If "additionalProperties" is true, validation always succeeds.
     * If "additionalProperties" is false, validation succeeds only if the instance is an object and all properties on the instance were covered by "properties" and/or "patternProperties".
     * If "additionalProperties" is an object, validate the value as a schema to all of the properties that weren't validated by "properties" nor "patternProperties".
     * @param array|null             $required             (optional) This array MUST have at least one element.  Elements of this array must be strings, and MUST be unique.
     * An object instance is valid if its property set contains all elements in this array value.
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return object
     */
    public function mockObject(
        $properties,
        $minProperties = 0,
        $maxProperties = null,
        $additionalProperties = null,
        $required = null
    );

    /**
     * Mocks OpenApi Data from schema.
     *
     * @param array|object $schema OpenAPI schema
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return mixed
     */
    public function mockFromSchema($schema);

    /**
     * Mock data by referenced schema.
     * TODO: this method will return model instance, not an StdClass
     *
     * @param string|null $ref Ref to model, eg. #/components/schemas/User
     *
     * @throws \InvalidArgumentException when invalid arguments passed
     *
     * @return mixed
     */
    public function mockFromRef($ref);
}
