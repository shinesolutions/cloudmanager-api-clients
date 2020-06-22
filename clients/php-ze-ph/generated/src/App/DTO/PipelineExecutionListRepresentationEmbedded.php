<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineExecutionListRepresentationEmbedded
{
    /**
     * @DTA\Data(field="executions", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\PipelineExecution::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\PipelineExecution::class}}
     * }})
     * @var \App\DTO\PipelineExecution[]
     */
    public $executions;
}
