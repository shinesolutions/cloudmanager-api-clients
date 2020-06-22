<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * List of pipeline executions
 */
class PipelineExecutionListRepresentation
{
    /**
     * @DTA\Data(field="_totalNumberOfItems", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $_total_number_of_items;
    /**
     * @DTA\Data(field="_page", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RequestedPageDetails::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\RequestedPageDetails::class})
     * @var \App\DTO\RequestedPageDetails
     */
    public $_page;
    /**
     * @DTA\Data(field="_embedded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PipelineExecutionListRepresentationEmbedded::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PipelineExecutionListRepresentationEmbedded::class})
     * @var \App\DTO\PipelineExecutionListRepresentationEmbedded
     */
    public $_embedded;
    /**
     * @DTA\Data(field="_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PipelineExecutionListRepresentationLinks::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\PipelineExecutionListRepresentationLinks::class})
     * @var \App\DTO\PipelineExecutionListRepresentationLinks
     */
    public $_links;
}
