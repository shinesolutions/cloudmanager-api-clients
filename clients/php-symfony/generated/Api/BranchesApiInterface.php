<?php
/**
 * BranchesApiInterface
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server
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

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\BranchList;

/**
 * BranchesApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface BranchesApiInterface
{

    /**
     * Operation getBranches
     *
     * List Branches
     *
     * @param  string $programId  Identifier of the program. (required)
     * @param  string $repositoryId  Identifier of the repository (required)
     * @param  string $xGwImsOrgId  IMS organization ID that the request is being made under. (required)
     * @param  string $authorization  Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param  string $xApiKey  IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\BranchList
     *
     */
    public function getBranches($programId, $repositoryId, $xGwImsOrgId, $authorization, $xApiKey, &$responseCode, array &$responseHeaders);
}
