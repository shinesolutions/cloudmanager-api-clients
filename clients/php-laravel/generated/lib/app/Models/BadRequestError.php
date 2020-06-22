<?php
/**
 * BadRequestError
 */
namespace app\Models;

/**
 * BadRequestError
 */
class BadRequestError {

    /** @var int $status HTTP status code of the response.*/
    private $status;

    /** @var string $type Error type identifier.*/
    private $type;

    /** @var string $title A short summary of the error.*/
    private $title;

    /** @var \app\Models\MissingParameter[] $missingParams Request&#39;s missing parameters.*/
    private $missingParams;

    /** @var \app\Models\InvalidParameter[] $invalidParams Request&#39;s invalid parameters.*/
    private $invalidParams;

}
