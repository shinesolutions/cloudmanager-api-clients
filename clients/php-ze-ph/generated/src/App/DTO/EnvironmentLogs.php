<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Logs of an Environment
 */
class EnvironmentLogs
{
    /**
     * Name of the service
     * @DTA\Data(field="service", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $service;
    /**
     * Name of the Log
     * @DTA\Data(field="name", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var string[]
     */
    public $name;
    /**
     * Number of days
     * @DTA\Data(field="days", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $days;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnvironmentLogsLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\EnvironmentLogsLinks::class})
     * @var \App\DTO\EnvironmentLogsLinks
     */
    public $_links;
    /**
     * @DTA\Data(field="_embedded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnvironmentLogsEmbedded::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\EnvironmentLogsEmbedded::class})
     * @var \App\DTO\EnvironmentLogsEmbedded
     */
    public $_embedded;
}
