-module(openapi_metric).

-export([encode/1]).

-export_type([openapi_metric/0]).

-type openapi_metric() ::
    #{ 'id' => binary(),
       'severity' => binary(),
       'passed' => boolean(),
       'override' => boolean(),
       'actualValue' => binary(),
       'expectedValue' => binary(),
       'comparator' => binary(),
       'kpi' => binary()
     }.

encode(#{ 'id' := Id,
          'severity' := Severity,
          'passed' := Passed,
          'override' := Override,
          'actualValue' := ActualValue,
          'expectedValue' := ExpectedValue,
          'comparator' := Comparator,
          'kpi' := Kpi
        }) ->
    #{ 'id' => Id,
       'severity' => Severity,
       'passed' => Passed,
       'override' => Override,
       'actualValue' => ActualValue,
       'expectedValue' => ExpectedValue,
       'comparator' => Comparator,
       'kpi' => Kpi
     }.
