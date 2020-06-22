<?php
/**
 * BranchList
 */
namespace app\Models;

/**
 * BranchList
 */
class BranchList {

    /** @var int $totalNumberOfItems */
    private $totalNumberOfItems;

    /** @var \app\Models\BranchListEmbedded $embedded */
    private $embedded;

    /** @var \app\Models\ProgramListLinks $links */
    private $links;

}
