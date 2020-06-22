<?php
/**
 * Pipeline
 */
namespace app\Models;

/**
 * Pipeline
 */
class Pipeline {

    /** @var string $id Identifier of the pipeline. Unique within the program.*/
    private $id;

    /** @var string $programId Identifier of the program. Unique within the space.*/
    private $programId;

    /** @var string $name Name of the pipeline*/
    private $name;

    /** @var string $trigger How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}*/
    private $trigger;

    /** @var string $status Pipeline status*/
    private $status;

    /** @var \DateTime $createdAt Create date*/
    private $createdAt;

    /** @var \DateTime $updatedAt Update date*/
    private $updatedAt;

    /** @var \DateTime $lastStartedAt Last pipeline execution start*/
    private $lastStartedAt;

    /** @var \DateTime $lastFinishedAt Last pipeline execution end*/
    private $lastFinishedAt;

    /** @var \app\Models\PipelinePhase[] $phases Pipeline phases in execution order*/
    private $phases;

    /** @var \app\Models\PipelineLinks $links */
    private $links;

}
