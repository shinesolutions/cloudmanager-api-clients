<?php
/**
 * EnvironmentLogs
 */
namespace app\Models;

/**
 * EnvironmentLogs
 */
class EnvironmentLogs {

    /** @var string[] $service Name of the service*/
    private $service;

    /** @var string[] $name Name of the Log*/
    private $name;

    /** @var int $days Number of days*/
    private $days;

    /** @var \app\Models\EnvironmentLogsLinks $links */
    private $links;

    /** @var \app\Models\EnvironmentLogsEmbedded $embedded */
    private $embedded;

}
