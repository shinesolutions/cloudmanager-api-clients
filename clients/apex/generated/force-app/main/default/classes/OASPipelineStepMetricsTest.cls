@isTest
private class OASPipelineStepMetricsTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = pipelineStepMetrics1;
        OASPipelineStepMetrics pipelineStepMetrics3 = new OASPipelineStepMetrics();
        OASPipelineStepMetrics pipelineStepMetrics4 = pipelineStepMetrics3;

        System.assert(pipelineStepMetrics1.equals(pipelineStepMetrics2));
        System.assert(pipelineStepMetrics2.equals(pipelineStepMetrics1));
        System.assert(pipelineStepMetrics1.equals(pipelineStepMetrics1));
        System.assert(pipelineStepMetrics3.equals(pipelineStepMetrics4));
        System.assert(pipelineStepMetrics4.equals(pipelineStepMetrics3));
        System.assert(pipelineStepMetrics3.equals(pipelineStepMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics3 = new OASPipelineStepMetrics();
        OASPipelineStepMetrics pipelineStepMetrics4 = new OASPipelineStepMetrics();

        System.assert(pipelineStepMetrics1.equals(pipelineStepMetrics2));
        System.assert(pipelineStepMetrics2.equals(pipelineStepMetrics1));
        System.assert(pipelineStepMetrics3.equals(pipelineStepMetrics4));
        System.assert(pipelineStepMetrics4.equals(pipelineStepMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = new OASPipelineStepMetrics();

        System.assertEquals(false, pipelineStepMetrics1.equals('foo'));
        System.assertEquals(false, pipelineStepMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = new OASPipelineStepMetrics();
        OASPipelineStepMetrics pipelineStepMetrics3;

        System.assertEquals(false, pipelineStepMetrics1.equals(pipelineStepMetrics3));
        System.assertEquals(false, pipelineStepMetrics2.equals(pipelineStepMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = new OASPipelineStepMetrics();

        System.assertEquals(pipelineStepMetrics1.hashCode(), pipelineStepMetrics1.hashCode());
        System.assertEquals(pipelineStepMetrics2.hashCode(), pipelineStepMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineStepMetrics pipelineStepMetrics1 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics2 = OASPipelineStepMetrics.getExample();
        OASPipelineStepMetrics pipelineStepMetrics3 = new OASPipelineStepMetrics();
        OASPipelineStepMetrics pipelineStepMetrics4 = new OASPipelineStepMetrics();

        System.assert(pipelineStepMetrics1.equals(pipelineStepMetrics2));
        System.assert(pipelineStepMetrics3.equals(pipelineStepMetrics4));
        System.assertEquals(pipelineStepMetrics1.hashCode(), pipelineStepMetrics2.hashCode());
        System.assertEquals(pipelineStepMetrics3.hashCode(), pipelineStepMetrics4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPipelineStepMetrics pipelineStepMetrics = new OASPipelineStepMetrics();
        System.assertEquals(new List<OASMetric>(), pipelineStepMetrics.metrics);
    }
}
