<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineListEmbedded
{
    /**
     * @DTA\Data(field="pipelines", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Pipeline::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Pipeline::class}}
     * }})
     * @var \App\DTO\Pipeline[]
     */
    public $pipelines;
}
