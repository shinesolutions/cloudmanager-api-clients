<?php
/**
 * Metric
 */
namespace app\Models;

/**
 * Metric
 */
class Metric {

    /** @var string $id KPI result identifier*/
    private $id;

    /** @var string $severity Severity of the metric*/
    private $severity;

    /** @var bool $passed Whether metric is considered passed*/
    private $passed;

    /** @var bool $override Whether user override the failed metric*/
    private $override;

    /** @var string $actualValue Expected value for the metric*/
    private $actualValue;

    /** @var string $expectedValue Expected value for the metric*/
    private $expectedValue;

    /** @var string $comparator Comparator used for the metric*/
    private $comparator;

    /** @var string $kpi KPI identifier*/
    private $kpi;

}
