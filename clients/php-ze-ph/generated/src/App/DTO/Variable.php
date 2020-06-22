<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A named value than can be set on an Environment
 */
class Variable
{
    /**
     * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":2, "max":100})
     * @DTA\Validator(name="Regex", options={"pattern":"/[a-zA-Z_][a-zA-Z_0-9]*/"})
     * @var string
     */
    public $name;
    /**
     * Value of the variable. Read-Write for non-secrets, write-only for secrets.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":0, "max":2048})
     * @var string
     */
    public $value;
    /**
     * Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $type;
}
