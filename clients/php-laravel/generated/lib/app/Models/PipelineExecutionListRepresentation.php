<?php
/**
 * PipelineExecutionListRepresentation
 */
namespace app\Models;

/**
 * PipelineExecutionListRepresentation
 */
class PipelineExecutionListRepresentation {

    /** @var int $totalNumberOfItems */
    private $totalNumberOfItems;

    /** @var \app\Models\RequestedPageDetails $page */
    private $page;

    /** @var \app\Models\PipelineExecutionListRepresentationEmbedded $embedded */
    private $embedded;

    /** @var \app\Models\PipelineExecutionListRepresentationLinks $links */
    private $links;

}
