<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes a __Metric__
 */
class Metric
{
    /**
     * KPI result identifier
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $id;
    /**
     * Severity of the metric
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $severity;
    /**
     * Whether metric is considered passed
     * @DTA\Data(field="passed", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $passed;
    /**
     * Whether user override the failed metric
     * @DTA\Data(field="override", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $override;
    /**
     * Expected value for the metric
     * @DTA\Data(field="actualValue", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $actual_value;
    /**
     * Expected value for the metric
     * @DTA\Data(field="expectedValue", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $expected_value;
    /**
     * Comparator used for the metric
     * @DTA\Data(field="comparator", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $comparator;
    /**
     * KPI identifier
     * @DTA\Data(field="kpi", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $kpi;
}
