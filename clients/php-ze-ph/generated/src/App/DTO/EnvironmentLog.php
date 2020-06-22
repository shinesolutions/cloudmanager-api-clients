<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Log from Environment
 */
class EnvironmentLog
{
    /**
     * Name of the service
     * @DTA\Data(field="service", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $service;
    /**
     * Name of the Log
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * date of the Log
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $date;
    /**
     * @DTA\Data(field="programId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $program_id;
    /**
     * @DTA\Data(field="environmentId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $environment_id;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnvironmentLogLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\EnvironmentLogLinks::class})
     * @var \App\DTO\EnvironmentLogLinks
     */
    public $_links;
}
