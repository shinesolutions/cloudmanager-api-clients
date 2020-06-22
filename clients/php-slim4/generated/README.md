# php-base - PHP Slim 4 Server library for Cloud Manager API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.

## Requirements

* Web server with URL rewriting
* PHP 7.1 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 6 or 7(depends from your PHP version) for unit testing.
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [PHPUnit Manual - Chapter 2. Writing Tests for PHPUnit](https://phpunit.de/manual/6.5/en/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests
`$ composer test-mock` | Mock feature tests
`$ composer test-utils` | Utils tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 7.4 Manual](https://phpunit.readthedocs.io/en/7.4/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch on option in `./index.php`:
```diff
/**
 * Add Error Handling Middleware
 *
 * @param bool $displayErrorDetails -> Should be set to false in production
 * @param bool $logErrors -> Parameter is passed to the default ErrorHandler
 * @param bool $logErrorDetails -> Display error details in error log
 * which can be replaced by a callable of your choice.

 * Note: This middleware should be added last. It will not handle any exceptions/errors
 * for middleware added after it.
 */
--- $app->addErrorMiddleware(false, true, true);
+++ $app->addErrorMiddleware(true, true, true);
```

## [Mock Server Documentation](./docs/MockServer.md)

## API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;

class PetApi extends AbstractPetApi
{

    public function addPet($request, $response, $args)
    {
        // your implementation of addPet method here
    }
}
```

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractBranchesApi* | **getBranches** | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*AbstractEnvironmentsApi* | **deleteEnvironment** | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*AbstractEnvironmentsApi* | **downloadLogs** | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*AbstractEnvironmentsApi* | **getEnvironment** | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*AbstractEnvironmentsApi* | **getEnvironmentLogs** | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*AbstractEnvironmentsApi* | **getEnvironments** | **GET** /api/program/{programId}/environments | List Environments
*AbstractPipelineExecutionApi* | **advancePipelineExecution** | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*AbstractPipelineExecutionApi* | **cancelPipelineExecutionStep** | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*AbstractPipelineExecutionApi* | **getCurrentExecution** | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*AbstractPipelineExecutionApi* | **getExecution** | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*AbstractPipelineExecutionApi* | **getExecutions** | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*AbstractPipelineExecutionApi* | **getStepLogs** | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*AbstractPipelineExecutionApi* | **startPipeline** | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*AbstractPipelineExecutionApi* | **stepMetric** | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*AbstractPipelineExecutionApi* | **stepState** | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*AbstractPipelinesApi* | **deletePipeline** | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*AbstractPipelinesApi* | **getPipeline** | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*AbstractPipelinesApi* | **getPipelines** | **GET** /api/program/{programId}/pipelines | List Pipelines
*AbstractPipelinesApi* | **patchPipeline** | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*AbstractProgramsApi* | **getPrograms** | **GET** /api/programs | Lists Programs
*AbstractProgramsApi* | **deleteProgram** | **DELETE** /api/program/{programId} | Delete Program
*AbstractProgramsApi* | **getProgram** | **GET** /api/program/{programId} | Get Program
*AbstractRepositoriesApi* | **getRepositories** | **GET** /api/program/{programId}/repositories | Lists Repositories
*AbstractRepositoriesApi* | **getRepository** | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*AbstractVariablesApi* | **getEnvironmentVariables** | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*AbstractVariablesApi* | **patchEnvironmentVariables** | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Models

* OpenAPIServer\Model\BadRequestError
* OpenAPIServer\Model\BranchList
* OpenAPIServer\Model\BranchListEmbedded
* OpenAPIServer\Model\EmbeddedProgram
* OpenAPIServer\Model\Environment
* OpenAPIServer\Model\EnvironmentLinks
* OpenAPIServer\Model\EnvironmentList
* OpenAPIServer\Model\EnvironmentListEmbedded
* OpenAPIServer\Model\EnvironmentLog
* OpenAPIServer\Model\EnvironmentLogLinks
* OpenAPIServer\Model\EnvironmentLogs
* OpenAPIServer\Model\EnvironmentLogsEmbedded
* OpenAPIServer\Model\EnvironmentLogsLinks
* OpenAPIServer\Model\HalLink
* OpenAPIServer\Model\InvalidParameter
* OpenAPIServer\Model\Metric
* OpenAPIServer\Model\MissingParameter
* OpenAPIServer\Model\Pipeline
* OpenAPIServer\Model\PipelineExecution
* OpenAPIServer\Model\PipelineExecutionEmbedded
* OpenAPIServer\Model\PipelineExecutionLinks
* OpenAPIServer\Model\PipelineExecutionListRepresentation
* OpenAPIServer\Model\PipelineExecutionListRepresentationEmbedded
* OpenAPIServer\Model\PipelineExecutionListRepresentationLinks
* OpenAPIServer\Model\PipelineExecutionStepState
* OpenAPIServer\Model\PipelineExecutionStepStateLinks
* OpenAPIServer\Model\PipelineLinks
* OpenAPIServer\Model\PipelineList
* OpenAPIServer\Model\PipelineListEmbedded
* OpenAPIServer\Model\PipelinePhase
* OpenAPIServer\Model\PipelineStepMetrics
* OpenAPIServer\Model\Program
* OpenAPIServer\Model\ProgramLinks
* OpenAPIServer\Model\ProgramList
* OpenAPIServer\Model\ProgramListEmbedded
* OpenAPIServer\Model\ProgramListLinks
* OpenAPIServer\Model\Repository
* OpenAPIServer\Model\RepositoryBranch
* OpenAPIServer\Model\RepositoryBranchLinks
* OpenAPIServer\Model\RepositoryLinks
* OpenAPIServer\Model\RepositoryList
* OpenAPIServer\Model\RepositoryListEmbedded
* OpenAPIServer\Model\RequestedPageDetails
* OpenAPIServer\Model\Variable
* OpenAPIServer\Model\VariableList
* OpenAPIServer\Model\VariableListEmbedded
* OpenAPIServer\Model\VariableListLinks


