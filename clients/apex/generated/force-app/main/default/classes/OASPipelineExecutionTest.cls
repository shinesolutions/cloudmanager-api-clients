@isTest
private class OASPipelineExecutionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = pipelineExecution1;
        OASPipelineExecution pipelineExecution3 = new OASPipelineExecution();
        OASPipelineExecution pipelineExecution4 = pipelineExecution3;

        System.assert(pipelineExecution1.equals(pipelineExecution2));
        System.assert(pipelineExecution2.equals(pipelineExecution1));
        System.assert(pipelineExecution1.equals(pipelineExecution1));
        System.assert(pipelineExecution3.equals(pipelineExecution4));
        System.assert(pipelineExecution4.equals(pipelineExecution3));
        System.assert(pipelineExecution3.equals(pipelineExecution3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution3 = new OASPipelineExecution();
        OASPipelineExecution pipelineExecution4 = new OASPipelineExecution();

        System.assert(pipelineExecution1.equals(pipelineExecution2));
        System.assert(pipelineExecution2.equals(pipelineExecution1));
        System.assert(pipelineExecution3.equals(pipelineExecution4));
        System.assert(pipelineExecution4.equals(pipelineExecution3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = new OASPipelineExecution();

        System.assertEquals(false, pipelineExecution1.equals('foo'));
        System.assertEquals(false, pipelineExecution2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = new OASPipelineExecution();
        OASPipelineExecution pipelineExecution3;

        System.assertEquals(false, pipelineExecution1.equals(pipelineExecution3));
        System.assertEquals(false, pipelineExecution2.equals(pipelineExecution3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = new OASPipelineExecution();

        System.assertEquals(pipelineExecution1.hashCode(), pipelineExecution1.hashCode());
        System.assertEquals(pipelineExecution2.hashCode(), pipelineExecution2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecution pipelineExecution1 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution2 = OASPipelineExecution.getExample();
        OASPipelineExecution pipelineExecution3 = new OASPipelineExecution();
        OASPipelineExecution pipelineExecution4 = new OASPipelineExecution();

        System.assert(pipelineExecution1.equals(pipelineExecution2));
        System.assert(pipelineExecution3.equals(pipelineExecution4));
        System.assertEquals(pipelineExecution1.hashCode(), pipelineExecution2.hashCode());
        System.assertEquals(pipelineExecution3.hashCode(), pipelineExecution4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineExecution pipelineExecution = new OASPipelineExecution();
        Map<String, String> propertyMappings = pipelineExecution.getPropertyMappings();
        System.assertEquals('r_trigger', propertyMappings.get('trigger'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
