@isTest
private class OASPipelineTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = pipeline1;
        OASPipeline pipeline3 = new OASPipeline();
        OASPipeline pipeline4 = pipeline3;

        System.assert(pipeline1.equals(pipeline2));
        System.assert(pipeline2.equals(pipeline1));
        System.assert(pipeline1.equals(pipeline1));
        System.assert(pipeline3.equals(pipeline4));
        System.assert(pipeline4.equals(pipeline3));
        System.assert(pipeline3.equals(pipeline3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = OASPipeline.getExample();
        OASPipeline pipeline3 = new OASPipeline();
        OASPipeline pipeline4 = new OASPipeline();

        System.assert(pipeline1.equals(pipeline2));
        System.assert(pipeline2.equals(pipeline1));
        System.assert(pipeline3.equals(pipeline4));
        System.assert(pipeline4.equals(pipeline3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = new OASPipeline();

        System.assertEquals(false, pipeline1.equals('foo'));
        System.assertEquals(false, pipeline2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = new OASPipeline();
        OASPipeline pipeline3;

        System.assertEquals(false, pipeline1.equals(pipeline3));
        System.assertEquals(false, pipeline2.equals(pipeline3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = new OASPipeline();

        System.assertEquals(pipeline1.hashCode(), pipeline1.hashCode());
        System.assertEquals(pipeline2.hashCode(), pipeline2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipeline pipeline1 = OASPipeline.getExample();
        OASPipeline pipeline2 = OASPipeline.getExample();
        OASPipeline pipeline3 = new OASPipeline();
        OASPipeline pipeline4 = new OASPipeline();

        System.assert(pipeline1.equals(pipeline2));
        System.assert(pipeline3.equals(pipeline4));
        System.assertEquals(pipeline1.hashCode(), pipeline2.hashCode());
        System.assertEquals(pipeline3.hashCode(), pipeline4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipeline pipeline = new OASPipeline();
        Map<String, String> propertyMappings = pipeline.getPropertyMappings();
        System.assertEquals('r_trigger', propertyMappings.get('trigger'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPipeline pipeline = new OASPipeline();
        System.assertEquals(new List<OASPipelinePhase>(), pipeline.phases);
        System.assertEquals(null, pipeline.id);
        System.assertEquals(null, pipeline.programId);
        System.assertEquals(null, pipeline.name);
        System.assertEquals(null, pipeline.r_trigger);
        System.assertEquals(null, pipeline.status);
        System.assertEquals(null, pipeline.createdAt);
        System.assertEquals(null, pipeline.updatedAt);
        System.assertEquals(null, pipeline.lastStartedAt);
        System.assertEquals(null, pipeline.lastFinishedAt);
        System.assertEquals(null, pipeline.links);
    }
}
