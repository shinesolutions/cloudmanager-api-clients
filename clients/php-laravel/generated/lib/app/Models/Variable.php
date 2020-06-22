<?php
/**
 * Variable
 */
namespace app\Models;

/**
 * Variable
 */
class Variable {

    /** @var string $name Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.*/
    private $name;

    /** @var string $value Value of the variable. Read-Write for non-secrets, write-only for secrets.*/
    private $value;

    /** @var string $type Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.*/
    private $type;

}
