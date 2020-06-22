@isTest
private class OASPipelineListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = pipelineListEmbedded1;
        OASPipelineListEmbedded pipelineListEmbedded3 = new OASPipelineListEmbedded();
        OASPipelineListEmbedded pipelineListEmbedded4 = pipelineListEmbedded3;

        System.assert(pipelineListEmbedded1.equals(pipelineListEmbedded2));
        System.assert(pipelineListEmbedded2.equals(pipelineListEmbedded1));
        System.assert(pipelineListEmbedded1.equals(pipelineListEmbedded1));
        System.assert(pipelineListEmbedded3.equals(pipelineListEmbedded4));
        System.assert(pipelineListEmbedded4.equals(pipelineListEmbedded3));
        System.assert(pipelineListEmbedded3.equals(pipelineListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded3 = new OASPipelineListEmbedded();
        OASPipelineListEmbedded pipelineListEmbedded4 = new OASPipelineListEmbedded();

        System.assert(pipelineListEmbedded1.equals(pipelineListEmbedded2));
        System.assert(pipelineListEmbedded2.equals(pipelineListEmbedded1));
        System.assert(pipelineListEmbedded3.equals(pipelineListEmbedded4));
        System.assert(pipelineListEmbedded4.equals(pipelineListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = new OASPipelineListEmbedded();

        System.assertEquals(false, pipelineListEmbedded1.equals('foo'));
        System.assertEquals(false, pipelineListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = new OASPipelineListEmbedded();
        OASPipelineListEmbedded pipelineListEmbedded3;

        System.assertEquals(false, pipelineListEmbedded1.equals(pipelineListEmbedded3));
        System.assertEquals(false, pipelineListEmbedded2.equals(pipelineListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = new OASPipelineListEmbedded();

        System.assertEquals(pipelineListEmbedded1.hashCode(), pipelineListEmbedded1.hashCode());
        System.assertEquals(pipelineListEmbedded2.hashCode(), pipelineListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineListEmbedded pipelineListEmbedded1 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded2 = OASPipelineListEmbedded.getExample();
        OASPipelineListEmbedded pipelineListEmbedded3 = new OASPipelineListEmbedded();
        OASPipelineListEmbedded pipelineListEmbedded4 = new OASPipelineListEmbedded();

        System.assert(pipelineListEmbedded1.equals(pipelineListEmbedded2));
        System.assert(pipelineListEmbedded3.equals(pipelineListEmbedded4));
        System.assertEquals(pipelineListEmbedded1.hashCode(), pipelineListEmbedded2.hashCode());
        System.assertEquals(pipelineListEmbedded3.hashCode(), pipelineListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPipelineListEmbedded pipelineListEmbedded = new OASPipelineListEmbedded();
        System.assertEquals(new List<OASPipeline>(), pipelineListEmbedded.pipelines);
    }
}
