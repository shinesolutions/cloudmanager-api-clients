<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes an __Embedded Program__
 */
class EmbeddedProgram
{
    /**
     * Identifier of the program. Unique within the space.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * Name of the program
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Whether this Program has been enabled for Cloud Manager usage
     * @DTA\Data(field="enabled", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $enabled;
    /**
     * Tenant Id
     * @DTA\Data(field="tenantId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $tenant_id;
}
