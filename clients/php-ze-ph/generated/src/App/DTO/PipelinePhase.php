<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes a phase of a pipeline
 */
class PipelinePhase
{
    /**
     * Name of the phase
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Type of the phase
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $type;
    /**
     * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
     * @DTA\Data(field="repositoryId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $repository_id;
    /**
     * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
     * @DTA\Data(field="branch", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $branch;
    /**
     * Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
     * @DTA\Data(field="environmentId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $environment_id;
}
