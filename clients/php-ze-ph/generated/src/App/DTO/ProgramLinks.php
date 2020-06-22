<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProgramLinks
{
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/pipelines", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_pipelines;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/environments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_environments;
    /**
     * @DTA\Data(field="http://ns.adobe.com/adobecloud/rel/repositories", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $http__ns_adobe_com_adobecloud_rel_repositories;
    /**
     * @DTA\Data(field="self", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\HalLink::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\HalLink::class})
     * @var \App\DTO\HalLink
     */
    public $self;
}
