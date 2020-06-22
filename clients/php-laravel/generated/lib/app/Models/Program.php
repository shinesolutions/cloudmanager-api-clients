<?php
/**
 * Program
 */
namespace app\Models;

/**
 * Program
 */
class Program {

    /** @var string $id Identifier of the program. Unique within the space.*/
    private $id;

    /** @var string $name Name of the program*/
    private $name;

    /** @var bool $enabled Whether this Program has been enabled for Cloud Manager usage*/
    private $enabled;

    /** @var string $tenantId Tenant Id*/
    private $tenantId;

    /** @var string $imsOrgId Organisation Id*/
    private $imsOrgId;

    /** @var \app\Models\ProgramLinks $links */
    private $links;

}
