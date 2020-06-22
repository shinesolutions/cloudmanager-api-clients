<?php
/**
 * PipelinePhase
 */
namespace app\Models;

/**
 * PipelinePhase
 */
class PipelinePhase {

    /** @var string $name Name of the phase*/
    private $name;

    /** @var string $type Type of the phase*/
    private $type;

    /** @var string $repositoryId Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD*/
    private $repositoryId;

    /** @var string $branch Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.*/
    private $branch;

    /** @var string $environmentId Identifier of the target environment. Mandatory if type&#x3D;DEPLOY*/
    private $environmentId;

}
