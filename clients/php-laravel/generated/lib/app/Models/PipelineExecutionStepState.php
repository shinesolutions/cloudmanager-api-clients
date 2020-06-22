<?php
/**
 * PipelineExecutionStepState
 */
namespace app\Models;

/**
 * PipelineExecutionStepState
 */
class PipelineExecutionStepState {

    /** @var string $id */
    private $id;

    /** @var string $stepId */
    private $stepId;

    /** @var string $phaseId */
    private $phaseId;

    /** @var string $action Name of the action*/
    private $action;

    /** @var string $repository Target repository*/
    private $repository;

    /** @var string $branch Target branch*/
    private $branch;

    /** @var string $environment Target environment*/
    private $environment;

    /** @var string $environmentType Target environment type*/
    private $environmentType;

    /** @var \DateTime $startedAt Start time*/
    private $startedAt;

    /** @var \DateTime $finishedAt Date the execution reached a final state*/
    private $finishedAt;

    /** @var map[string,object] $details Information about step result*/
    private $details;

    /** @var string $status Action status*/
    private $status;

    /** @var \app\Models\PipelineExecutionStepStateLinks $links */
    private $links;

}
