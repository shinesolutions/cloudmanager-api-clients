<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EnvironmentList
{
    /**
     * @DTA\Data(field="_totalNumberOfItems", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $_total_number_of_items;
    /**
     * @DTA\Data(field="_embedded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EnvironmentListEmbedded::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\EnvironmentListEmbedded::class})
     * @var \App\DTO\EnvironmentListEmbedded
     */
    public $_embedded;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProgramListLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ProgramListLinks::class})
     * @var \App\DTO\ProgramListLinks
     */
    public $_links;
}
