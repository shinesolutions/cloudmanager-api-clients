<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes a __Program__
 */
class Program
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
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":0, "max":64})
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
    /**
     * Organisation Id
     * @DTA\Data(field="imsOrgId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $ims_org_id;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProgramLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ProgramLinks::class})
     * @var \App\DTO\ProgramLinks
     */
    public $_links;
}
