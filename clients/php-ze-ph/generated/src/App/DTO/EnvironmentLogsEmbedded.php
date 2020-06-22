<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EnvironmentLogsEmbedded
{
    /**
     * Links to logs
     * @DTA\Data(field="downloads", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\EnvironmentLog::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\EnvironmentLog::class}}
     * }})
     * @var \App\DTO\EnvironmentLog[]
     */
    public $downloads;
}
