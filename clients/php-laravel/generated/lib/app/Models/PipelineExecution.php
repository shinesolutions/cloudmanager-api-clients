<?php
/**
 * PipelineExecution
 */
namespace app\Models;

/**
 * PipelineExecution
 */
class PipelineExecution {

    /** @var string $id Pipeline execution identifier*/
    private $id;

    /** @var string $programId Identifier of the program. Unique within the space.*/
    private $programId;

    /** @var string $pipelineId Identifier of the pipeline. Unique within the space.*/
    private $pipelineId;

    /** @var string $artifactsVersion Version of the artifacts generated during this execution*/
    private $artifactsVersion;

    /** @var string $user AdobeID who started the pipeline. Empty for auto triggered builds*/
    private $user;

    /** @var string $status Status of the execution*/
    private $status;

    /** @var string $trigger How the execution was triggered.*/
    private $trigger;

    /** @var \DateTime $createdAt Start time*/
    private $createdAt;

    /** @var \DateTime $updatedAt Date of last status change*/
    private $updatedAt;

    /** @var \DateTime $finishedAt Date the execution reached a final state*/
    private $finishedAt;

    /** @var \app\Models\PipelineExecutionEmbedded $embedded */
    private $embedded;

    /** @var \app\Models\PipelineExecutionLinks $links */
    private $links;

}
