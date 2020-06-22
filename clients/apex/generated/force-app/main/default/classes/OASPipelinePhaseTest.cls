@isTest
private class OASPipelinePhaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = pipelinePhase1;
        OASPipelinePhase pipelinePhase3 = new OASPipelinePhase();
        OASPipelinePhase pipelinePhase4 = pipelinePhase3;

        System.assert(pipelinePhase1.equals(pipelinePhase2));
        System.assert(pipelinePhase2.equals(pipelinePhase1));
        System.assert(pipelinePhase1.equals(pipelinePhase1));
        System.assert(pipelinePhase3.equals(pipelinePhase4));
        System.assert(pipelinePhase4.equals(pipelinePhase3));
        System.assert(pipelinePhase3.equals(pipelinePhase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase3 = new OASPipelinePhase();
        OASPipelinePhase pipelinePhase4 = new OASPipelinePhase();

        System.assert(pipelinePhase1.equals(pipelinePhase2));
        System.assert(pipelinePhase2.equals(pipelinePhase1));
        System.assert(pipelinePhase3.equals(pipelinePhase4));
        System.assert(pipelinePhase4.equals(pipelinePhase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = new OASPipelinePhase();

        System.assertEquals(false, pipelinePhase1.equals('foo'));
        System.assertEquals(false, pipelinePhase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = new OASPipelinePhase();
        OASPipelinePhase pipelinePhase3;

        System.assertEquals(false, pipelinePhase1.equals(pipelinePhase3));
        System.assertEquals(false, pipelinePhase2.equals(pipelinePhase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = new OASPipelinePhase();

        System.assertEquals(pipelinePhase1.hashCode(), pipelinePhase1.hashCode());
        System.assertEquals(pipelinePhase2.hashCode(), pipelinePhase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelinePhase pipelinePhase1 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase2 = OASPipelinePhase.getExample();
        OASPipelinePhase pipelinePhase3 = new OASPipelinePhase();
        OASPipelinePhase pipelinePhase4 = new OASPipelinePhase();

        System.assert(pipelinePhase1.equals(pipelinePhase2));
        System.assert(pipelinePhase3.equals(pipelinePhase4));
        System.assertEquals(pipelinePhase1.hashCode(), pipelinePhase2.hashCode());
        System.assertEquals(pipelinePhase3.hashCode(), pipelinePhase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelinePhase pipelinePhase = new OASPipelinePhase();
        Map<String, String> propertyMappings = pipelinePhase.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
