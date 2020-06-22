<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Wraps a pipeline execution
 */
class PipelineExecution
{
    /**
     * Pipeline execution identifier
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * Identifier of the program. Unique within the space.
     * @DTA\Data(field="programId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $program_id;
    /**
     * Identifier of the pipeline. Unique within the space.
     * @DTA\Data(field="pipelineId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $pipeline_id;
    /**
     * Version of the artifacts generated during this execution
     * @DTA\Data(field="artifactsVersion", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $artifacts_version;
    /**
     * AdobeID who started the pipeline. Empty for auto triggered builds
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $user;
    /**
     * Status of the execution
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $status;
    /**
     * How the execution was triggered.
     * @DTA\Data(field="trigger", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $trigger;
    /**
     * Start time
     * @DTA\Data(field="createdAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime
     */
    public $created_at;
    /**
     * Date of last status change
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime
     */
    public $updated_at;
    /**
     * Date the execution reached a final state
     * @DTA\Data(field="finishedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime
     */
    public $finished_at;
    /**
     * @DTA\Data(field="_embedded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PipelineExecutionEmbedded::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PipelineExecutionEmbedded::class})
     * @var \App\DTO\PipelineExecutionEmbedded
     */
    public $_embedded;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PipelineExecutionLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PipelineExecutionLinks::class})
     * @var \App\DTO\PipelineExecutionLinks
     */
    public $_links;
}
