@isTest
private class OASPipelineExecutionEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = pipelineExecutionEmbedded1;
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded3 = new OASPipelineExecutionEmbedded();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded4 = pipelineExecutionEmbedded3;

        System.assert(pipelineExecutionEmbedded1.equals(pipelineExecutionEmbedded2));
        System.assert(pipelineExecutionEmbedded2.equals(pipelineExecutionEmbedded1));
        System.assert(pipelineExecutionEmbedded1.equals(pipelineExecutionEmbedded1));
        System.assert(pipelineExecutionEmbedded3.equals(pipelineExecutionEmbedded4));
        System.assert(pipelineExecutionEmbedded4.equals(pipelineExecutionEmbedded3));
        System.assert(pipelineExecutionEmbedded3.equals(pipelineExecutionEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded3 = new OASPipelineExecutionEmbedded();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded4 = new OASPipelineExecutionEmbedded();

        System.assert(pipelineExecutionEmbedded1.equals(pipelineExecutionEmbedded2));
        System.assert(pipelineExecutionEmbedded2.equals(pipelineExecutionEmbedded1));
        System.assert(pipelineExecutionEmbedded3.equals(pipelineExecutionEmbedded4));
        System.assert(pipelineExecutionEmbedded4.equals(pipelineExecutionEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = new OASPipelineExecutionEmbedded();

        System.assertEquals(false, pipelineExecutionEmbedded1.equals('foo'));
        System.assertEquals(false, pipelineExecutionEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = new OASPipelineExecutionEmbedded();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded3;

        System.assertEquals(false, pipelineExecutionEmbedded1.equals(pipelineExecutionEmbedded3));
        System.assertEquals(false, pipelineExecutionEmbedded2.equals(pipelineExecutionEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = new OASPipelineExecutionEmbedded();

        System.assertEquals(pipelineExecutionEmbedded1.hashCode(), pipelineExecutionEmbedded1.hashCode());
        System.assertEquals(pipelineExecutionEmbedded2.hashCode(), pipelineExecutionEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded1 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded2 = OASPipelineExecutionEmbedded.getExample();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded3 = new OASPipelineExecutionEmbedded();
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded4 = new OASPipelineExecutionEmbedded();

        System.assert(pipelineExecutionEmbedded1.equals(pipelineExecutionEmbedded2));
        System.assert(pipelineExecutionEmbedded3.equals(pipelineExecutionEmbedded4));
        System.assertEquals(pipelineExecutionEmbedded1.hashCode(), pipelineExecutionEmbedded2.hashCode());
        System.assertEquals(pipelineExecutionEmbedded3.hashCode(), pipelineExecutionEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPipelineExecutionEmbedded pipelineExecutionEmbedded = new OASPipelineExecutionEmbedded();
        System.assertEquals(new List<OASPipelineExecutionStepState>(), pipelineExecutionEmbedded.stepStates);
    }
}
