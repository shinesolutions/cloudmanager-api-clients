<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineExecutionLinks
{
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/program", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_program;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline;
    /**
     * @DTA\Data(field="self", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $self;
}
