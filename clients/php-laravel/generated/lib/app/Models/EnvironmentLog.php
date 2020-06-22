<?php
/**
 * EnvironmentLog
 */
namespace app\Models;

/**
 * EnvironmentLog
 */
class EnvironmentLog {

    /** @var string $service Name of the service*/
    private $service;

    /** @var string $name Name of the Log*/
    private $name;

    /** @var string $date date of the Log*/
    private $date;

    /** @var int $programId */
    private $programId;

    /** @var int $environmentId */
    private $environmentId;

    /** @var \app\Models\EnvironmentLogLinks $links */
    private $links;

}
