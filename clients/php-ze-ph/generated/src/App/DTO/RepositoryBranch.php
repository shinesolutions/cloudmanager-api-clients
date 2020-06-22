<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a Git Branch
 */
class RepositoryBranch
{
    /**
     * Identifier of the program. Unique within the space
     * @DTA\Data(field="programId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $program_id;
    /**
     * Identifier of the repository
     * @DTA\Data(field="repositoryId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $repository_id;
    /**
     * Name of the branch
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RepositoryBranchLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\RepositoryBranchLinks::class})
     * @var \App\DTO\RepositoryBranchLinks
     */
    public $_links;
}
