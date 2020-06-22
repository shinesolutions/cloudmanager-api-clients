<?php

/**
 * PipelineExecutionListRepresentationTest
 *
 * PHP version 7.1
 *
 * @package OpenAPIServer\Model
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
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\PipelineExecutionListRepresentation;

/**
 * PipelineExecutionListRepresentationTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\PipelineExecutionListRepresentation
 */
class PipelineExecutionListRepresentationTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test "PipelineExecutionListRepresentation"
     */
    public function testPipelineExecutionListRepresentation()
    {
        $testPipelineExecutionListRepresentation = new PipelineExecutionListRepresentation();
    }

    /**
     * Test attribute "totalNumberOfItems"
     */
    public function testPropertyTotalNumberOfItems()
    {
    }

    /**
     * Test attribute "page"
     */
    public function testPropertyPage()
    {
    }

    /**
     * Test attribute "embedded"
     */
    public function testPropertyEmbedded()
    {
    }

    /**
     * Test attribute "links"
     */
    public function testPropertyLinks()
    {
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaObject = PipelineExecutionListRepresentation::getOpenApiSchema();
        $schemaArr = PipelineExecutionListRepresentation::getOpenApiSchema(true);
        $this->assertIsObject($schemaObject);
        $this->assertIsArray($schemaArr);
    }
}
