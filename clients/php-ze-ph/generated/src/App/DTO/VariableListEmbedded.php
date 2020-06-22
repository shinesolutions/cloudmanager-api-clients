<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VariableListEmbedded
{
    /**
     * Variables set on environment
     * @DTA\Data(field="variables", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Variable::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Variable::class}}
     * }})
     * @var \App\DTO\Variable[]
     */
    public $variables;
}
