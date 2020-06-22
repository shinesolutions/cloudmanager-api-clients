<?php
/**
 * Environment
 */
namespace app\Models;

/**
 * Environment
 */
class Environment {

    /** @var string $id id*/
    private $id;

    /** @var string $programId Identifier of the program. Unique within the space.*/
    private $programId;

    /** @var string $name Name of the environment*/
    private $name;

    /** @var string $description Description of the environment*/
    private $description;

    /** @var string $type Type of the environment*/
    private $type;

    /** @var \app\Models\EnvironmentLinks $links */
    private $links;

}
