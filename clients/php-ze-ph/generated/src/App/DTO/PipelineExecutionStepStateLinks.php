<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PipelineExecutionStepStateLinks
{
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/execution", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_execution;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline/logs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline_logs;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline/metrics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline_metrics;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline/advance", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline_advance;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipeline/cancel", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipeline_cancel;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/program", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_program;
    /**
     * @DTA\Data(field="self", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $self;
}
