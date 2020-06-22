<?php

/**
 * EnvironmentsController
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\EnvironmentsApiInterface;
use OpenAPI\Server\Model\BadRequestError;
use OpenAPI\Server\Model\Environment;
use OpenAPI\Server\Model\EnvironmentList;
use OpenAPI\Server\Model\EnvironmentLogs;

/**
 * EnvironmentsController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class EnvironmentsController extends Controller
{

    /**
     * Operation deleteEnvironment
     *
     * DeleteEnvironment
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function deleteEnvironmentAction(Request $request, $programId, $environmentId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $xGwImsOrgId = $request->headers->get('x-gw-ims-org-id');
        $authorization = $request->headers->get('Authorization');
        $xApiKey = $request->headers->get('x-api-key');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $programId = $this->deserialize($programId, 'string', 'string');
            $environmentId = $this->deserialize($environmentId, 'string', 'string');
            $xGwImsOrgId = $this->deserialize($xGwImsOrgId, 'string', 'string');
            $authorization = $this->deserialize($authorization, 'string', 'string');
            $xApiKey = $this->deserialize($xApiKey, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($programId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($environmentId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xGwImsOrgId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorization, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xApiKey, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->deleteEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Environment deleted';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 201:
                    $message = 'Environment deleted';
                    break;
                case 400:
                    $message = 'Environment deletion in progress';
                    break;
                case 404:
                    $message = 'Environment not found';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation downloadLogs
     *
     * Download Logs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function downloadLogsAction(Request $request, $programId, $environmentId)
    {
        // Handle authentication

        // Read out all input parameter values into variables
        $service = $request->query->get('service');
        $name = $request->query->get('name');
        $date = $request->query->get('date');
        $xGwImsOrgId = $request->headers->get('x-gw-ims-org-id');
        $authorization = $request->headers->get('Authorization');
        $xApiKey = $request->headers->get('x-api-key');
        $accept = $request->headers->get('Accept');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $programId = $this->deserialize($programId, 'string', 'string');
            $environmentId = $this->deserialize($environmentId, 'string', 'string');
            $service = $this->deserialize($service, 'string', 'string');
            $name = $this->deserialize($name, 'string', 'string');
            $date = $this->deserialize($date, 'string', 'string');
            $xGwImsOrgId = $this->deserialize($xGwImsOrgId, 'string', 'string');
            $authorization = $this->deserialize($authorization, 'string', 'string');
            $xApiKey = $this->deserialize($xApiKey, 'string', 'string');
            $accept = $this->deserialize($accept, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($programId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($environmentId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($service, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($name, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($date, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xGwImsOrgId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorization, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xApiKey, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($accept, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];
            $result = $handler->downloadLogs($programId, $environmentId, $service, $name, $date, $xGwImsOrgId, $authorization, $xApiKey, $accept, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Successful retrieval of logs';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Successful retrieval of logs';
                    break;
                case 400:
                    $message = 'invalid parameters';
                    break;
                case 404:
                    $message = 'Environment not found';
                    break;
            }

            return new Response(
                '',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getEnvironment
     *
     * Get Environment
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getEnvironmentAction(Request $request, $programId, $environmentId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $xGwImsOrgId = $request->headers->get('x-gw-ims-org-id');
        $authorization = $request->headers->get('Authorization');
        $xApiKey = $request->headers->get('x-api-key');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $programId = $this->deserialize($programId, 'string', 'string');
            $environmentId = $this->deserialize($environmentId, 'string', 'string');
            $xGwImsOrgId = $this->deserialize($xGwImsOrgId, 'string', 'string');
            $authorization = $this->deserialize($authorization, 'string', 'string');
            $xApiKey = $this->deserialize($xApiKey, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($programId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($environmentId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xGwImsOrgId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorization, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xApiKey, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'successful operation';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'successful operation';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getEnvironmentLogs
     *
     * Get Environment Logs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getEnvironmentLogsAction(Request $request, $programId, $environmentId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $service = $request->query->get('service');
        $name = $request->query->get('name');
        $days = $request->query->get('days');
        $xGwImsOrgId = $request->headers->get('x-gw-ims-org-id');
        $authorization = $request->headers->get('Authorization');
        $xApiKey = $request->headers->get('x-api-key');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $programId = $this->deserialize($programId, 'string', 'string');
            $environmentId = $this->deserialize($environmentId, 'string', 'string');
            $days = $this->deserialize($days, 'int', 'string');
            $xGwImsOrgId = $this->deserialize($xGwImsOrgId, 'string', 'string');
            $authorization = $this->deserialize($authorization, 'string', 'string');
            $xApiKey = $this->deserialize($xApiKey, 'string', 'string');
            $service = $this->deserialize($service, 'array<multi,string>', 'string');
            $name = $this->deserialize($name, 'array<multi,string>', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($programId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($environmentId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($days, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xGwImsOrgId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorization, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xApiKey, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\All([
            new Assert\Type("string"),
        ]);
        $response = $this->validate($service, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\All([
            new Assert\Type("string"),
        ]);
        $response = $this->validate($name, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getEnvironmentLogs($programId, $environmentId, $days, $xGwImsOrgId, $authorization, $xApiKey, $service, $name, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Successful retrieval of logs for an environment';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Successful retrieval of logs for an environment';
                    break;
                case 400:
                    $message = 'invalid parameters';
                    break;
                case 404:
                    $message = 'Environment not found';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getEnvironments
     *
     * List Environments
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getEnvironmentsAction(Request $request, $programId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication

        // Read out all input parameter values into variables
        $type = $request->query->get('type');
        $xGwImsOrgId = $request->headers->get('x-gw-ims-org-id');
        $authorization = $request->headers->get('Authorization');
        $xApiKey = $request->headers->get('x-api-key');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $programId = $this->deserialize($programId, 'string', 'string');
            $xGwImsOrgId = $this->deserialize($xGwImsOrgId, 'string', 'string');
            $authorization = $this->deserialize($authorization, 'string', 'string');
            $xApiKey = $this->deserialize($xApiKey, 'string', 'string');
            $type = $this->deserialize($type, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($programId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xGwImsOrgId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($authorization, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($xApiKey, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "dev", "stage", "prod" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($type, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->getEnvironments($programId, $xGwImsOrgId, $authorization, $xApiKey, $type, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Successful retrieval of environment list';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Successful retrieval of environment list';
                    break;
                case 404:
                    $message = 'Program not found';
                    break;
            }

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return EnvironmentsApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('environments');
    }
}
