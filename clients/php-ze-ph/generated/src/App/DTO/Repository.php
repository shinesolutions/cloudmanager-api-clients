<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A sourcecode repository
 */
class Repository
{
    /**
     * Repository name
     * @DTA\Data(field="repo", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $repo;
    /**
     * description
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $description;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RepositoryLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\RepositoryLinks::class})
     * @var \App\DTO\RepositoryLinks
     */
    public $_links;
}
