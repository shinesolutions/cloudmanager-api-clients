@isTest
private class OASMetricTest {
    @isTest
    private static void equalsSameInstance() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = metric1;
        OASMetric metric3 = new OASMetric();
        OASMetric metric4 = metric3;

        System.assert(metric1.equals(metric2));
        System.assert(metric2.equals(metric1));
        System.assert(metric1.equals(metric1));
        System.assert(metric3.equals(metric4));
        System.assert(metric4.equals(metric3));
        System.assert(metric3.equals(metric3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = OASMetric.getExample();
        OASMetric metric3 = new OASMetric();
        OASMetric metric4 = new OASMetric();

        System.assert(metric1.equals(metric2));
        System.assert(metric2.equals(metric1));
        System.assert(metric3.equals(metric4));
        System.assert(metric4.equals(metric3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = new OASMetric();

        System.assertEquals(false, metric1.equals('foo'));
        System.assertEquals(false, metric2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = new OASMetric();
        OASMetric metric3;

        System.assertEquals(false, metric1.equals(metric3));
        System.assertEquals(false, metric2.equals(metric3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = new OASMetric();

        System.assertEquals(metric1.hashCode(), metric1.hashCode());
        System.assertEquals(metric2.hashCode(), metric2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMetric metric1 = OASMetric.getExample();
        OASMetric metric2 = OASMetric.getExample();
        OASMetric metric3 = new OASMetric();
        OASMetric metric4 = new OASMetric();

        System.assert(metric1.equals(metric2));
        System.assert(metric3.equals(metric4));
        System.assertEquals(metric1.hashCode(), metric2.hashCode());
        System.assertEquals(metric3.hashCode(), metric4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMetric metric = new OASMetric();
        Map<String, String> propertyMappings = metric.getPropertyMappings();
        System.assertEquals('r_override', propertyMappings.get('override'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMetric metric = new OASMetric();
        System.assertEquals(false, metric.passed);
        System.assertEquals(false, metric.r_override);
        System.assertEquals(null, metric.id);
        System.assertEquals(null, metric.severity);
        System.assertEquals(null, metric.actualValue);
        System.assertEquals(null, metric.expectedValue);
        System.assertEquals(null, metric.comparator);
        System.assertEquals(null, metric.kpi);
    }
}
