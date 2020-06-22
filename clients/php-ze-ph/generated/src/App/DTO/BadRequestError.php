<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A Bad Request response error.
 */
class BadRequestError
{
    /**
     * HTTP status code of the response.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $status;
    /**
     * Error type identifier.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $type;
    /**
     * A short summary of the error.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $title;
    /**
     * Request&#39;s missing parameters.
     * @DTA\Data(field="missingParams", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\MissingParameter::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\MissingParameter::class}}
     * }})
     * @var \App\DTO\MissingParameter[]
     */
    public $missing_params;
    /**
     * Request&#39;s invalid parameters.
     * @DTA\Data(field="invalidParams", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\InvalidParameter::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\InvalidParameter::class}}
     * }})
     * @var \App\DTO\InvalidParameter[]
     */
    public $invalid_params;
}
