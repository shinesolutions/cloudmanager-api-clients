<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineExecutionEmbedded
{
    /**
     * @DTA\Data(field="stepStates", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\PipelineExecutionStepState::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\PipelineExecutionStepState::class}}
     * }})
     * @var \App\DTO\PipelineExecutionStepState[]
     */
    public $step_states;
}
