<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes the status of a particular pipeline execution step for display purposes
 */
class PipelineExecutionStepState
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * @DTA\Data(field="stepId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $step_id;
    /**
     * @DTA\Data(field="phaseId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $phase_id;
    /**
     * Name of the action
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * Target repository
     * @DTA\Data(field="repository", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $repository;
    /**
     * Target branch
     * @DTA\Data(field="branch", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $branch;
    /**
     * Target environment
     * @DTA\Data(field="environment", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $environment;
    /**
     * Target environment type
     * @DTA\Data(field="environmentType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $environment_type;
    /**
     * Start time
     * @DTA\Data(field="startedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime
     */
    public $started_at;
    /**
     * Date the execution reached a final state
     * @DTA\Data(field="finishedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime
     */
    public $finished_at;
    /**
     * Information about step result
     * @DTA\Data(field="details", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"object"}}
     * }})
     * @var map[string,object]
     */
    public $details;
    /**
     * Action status
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $status;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PipelineExecutionStepStateLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PipelineExecutionStepStateLinks::class})
     * @var \App\DTO\PipelineExecutionStepStateLinks
     */
    public $_links;
}
