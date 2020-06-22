<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/api/program/{programId}/repository/{repositoryId}/branches', function(Application $app, Request $request, $programId, $repositoryId) {
            return new Response('How about implementing getBranches as a GET method ?');
            });


$app->DELETE('/api/program/{programId}/environment/{environmentId}', function(Application $app, Request $request, $programId, $environmentId) {
            return new Response('How about implementing deleteEnvironment as a DELETE method ?');
            });


$app->GET('/api/program/{programId}/environment/{environmentId}/logs/download', function(Application $app, Request $request, $programId, $environmentId) {
            $service = $request->get('service');
            $name = $request->get('name');
            $date = $request->get('date');
            return new Response('How about implementing downloadLogs as a GET method ?');
            });


$app->GET('/api/program/{programId}/environment/{environmentId}', function(Application $app, Request $request, $programId, $environmentId) {
            return new Response('How about implementing getEnvironment as a GET method ?');
            });


$app->GET('/api/program/{programId}/environment/{environmentId}/logs', function(Application $app, Request $request, $programId, $environmentId) {
            $service = $request->get('service');
            $name = $request->get('name');
            $days = $request->get('days');
            return new Response('How about implementing getEnvironmentLogs as a GET method ?');
            });


$app->GET('/api/program/{programId}/environments', function(Application $app, Request $request, $programId) {
            $type = $request->get('type');
            return new Response('How about implementing getEnvironments as a GET method ?');
            });


$app->PUT('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance', function(Application $app, Request $request, $programId, $pipelineId, $executionId, $phaseId, $stepId) {
            return new Response('How about implementing advancePipelineExecution as a PUT method ?');
            });


$app->PUT('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel', function(Application $app, Request $request, $programId, $pipelineId, $executionId, $phaseId, $stepId) {
            return new Response('How about implementing cancelPipelineExecutionStep as a PUT method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/execution', function(Application $app, Request $request, $programId, $pipelineId) {
            return new Response('How about implementing getCurrentExecution as a GET method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}', function(Application $app, Request $request, $programId, $pipelineId, $executionId) {
            return new Response('How about implementing getExecution as a GET method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/executions', function(Application $app, Request $request, $programId, $pipelineId) {
            $start = $request->get('start');
            $limit = $request->get('limit');
            return new Response('How about implementing getExecutions as a GET method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs', function(Application $app, Request $request, $programId, $pipelineId, $executionId, $phaseId, $stepId) {
            $file = $request->get('file');
            return new Response('How about implementing getStepLogs as a GET method ?');
            });


$app->PUT('/api/program/{programId}/pipeline/{pipelineId}/execution', function(Application $app, Request $request, $programId, $pipelineId) {
            return new Response('How about implementing startPipeline as a PUT method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics', function(Application $app, Request $request, $programId, $pipelineId, $executionId, $phaseId, $stepId) {
            return new Response('How about implementing stepMetric as a GET method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}', function(Application $app, Request $request, $programId, $pipelineId, $executionId, $phaseId, $stepId) {
            return new Response('How about implementing stepState as a GET method ?');
            });


$app->DELETE('/api/program/{programId}/pipeline/{pipelineId}', function(Application $app, Request $request, $programId, $pipelineId) {
            return new Response('How about implementing deletePipeline as a DELETE method ?');
            });


$app->GET('/api/program/{programId}/pipeline/{pipelineId}', function(Application $app, Request $request, $programId, $pipelineId) {
            return new Response('How about implementing getPipeline as a GET method ?');
            });


$app->GET('/api/program/{programId}/pipelines', function(Application $app, Request $request, $programId) {
            return new Response('How about implementing getPipelines as a GET method ?');
            });


$app->PATCH('/api/program/{programId}/pipeline/{pipelineId}', function(Application $app, Request $request, $programId, $pipelineId) {
            return new Response('How about implementing patchPipeline as a PATCH method ?');
            });


$app->DELETE('/api/program/{programId}', function(Application $app, Request $request, $programId) {
            return new Response('How about implementing deleteProgram as a DELETE method ?');
            });


$app->GET('/api/program/{programId}', function(Application $app, Request $request, $programId) {
            return new Response('How about implementing getProgram as a GET method ?');
            });


$app->GET('/api/programs', function(Application $app, Request $request) {
            return new Response('How about implementing getPrograms as a GET method ?');
            });


$app->GET('/api/program/{programId}/repositories', function(Application $app, Request $request, $programId) {
            return new Response('How about implementing getRepositories as a GET method ?');
            });


$app->GET('/api/program/{programId}/repository/{repositoryId}', function(Application $app, Request $request, $programId, $repositoryId) {
            return new Response('How about implementing getRepository as a GET method ?');
            });


$app->GET('/api/program/{programId}/environment/{environmentId}/variables', function(Application $app, Request $request, $programId, $environmentId) {
            return new Response('How about implementing getEnvironmentVariables as a GET method ?');
            });


$app->PATCH('/api/program/{programId}/environment/{environmentId}/variables', function(Application $app, Request $request, $programId, $environmentId) {
            return new Response('How about implementing patchEnvironmentVariables as a PATCH method ?');
            });


$app->run();
