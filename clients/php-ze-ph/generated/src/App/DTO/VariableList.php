<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VariableList
{
    /**
     * @DTA\Data(field="_totalNumberOfItems", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $_total_number_of_items;
    /**
     * @DTA\Data(field="_embedded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VariableListEmbedded::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VariableListEmbedded::class})
     * @var \App\DTO\VariableListEmbedded
     */
    public $_embedded;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VariableListLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VariableListLinks::class})
     * @var \App\DTO\VariableListLinks
     */
    public $_links;
}
