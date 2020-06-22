<?php
/**
 * RepositoryBranch
 */
namespace app\Models;

/**
 * RepositoryBranch
 */
class RepositoryBranch {

    /** @var string $programId Identifier of the program. Unique within the space*/
    private $programId;

    /** @var int $repositoryId Identifier of the repository*/
    private $repositoryId;

    /** @var string $name Name of the branch*/
    private $name;

    /** @var \app\Models\RepositoryBranchLinks $links */
    private $links;

}
