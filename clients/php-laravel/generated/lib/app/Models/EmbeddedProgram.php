<?php
/**
 * EmbeddedProgram
 */
namespace app\Models;

/**
 * EmbeddedProgram
 */
class EmbeddedProgram {

    /** @var string $id Identifier of the program. Unique within the space.*/
    private $id;

    /** @var string $name Name of the program*/
    private $name;

    /** @var bool $enabled Whether this Program has been enabled for Cloud Manager usage*/
    private $enabled;

    /** @var string $tenantId Tenant Id*/
    private $tenantId;

}
