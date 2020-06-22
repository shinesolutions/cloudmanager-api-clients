<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EnvironmentLogLinks
{
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/logs/download", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_logs_download;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/logs/tail", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_logs_tail;
}
