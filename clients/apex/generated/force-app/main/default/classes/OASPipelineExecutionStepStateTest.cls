@isTest
private class OASPipelineExecutionStepStateTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = pipelineExecutionStepState1;
        OASPipelineExecutionStepState pipelineExecutionStepState3 = new OASPipelineExecutionStepState();
        OASPipelineExecutionStepState pipelineExecutionStepState4 = pipelineExecutionStepState3;

        System.assert(pipelineExecutionStepState1.equals(pipelineExecutionStepState2));
        System.assert(pipelineExecutionStepState2.equals(pipelineExecutionStepState1));
        System.assert(pipelineExecutionStepState1.equals(pipelineExecutionStepState1));
        System.assert(pipelineExecutionStepState3.equals(pipelineExecutionStepState4));
        System.assert(pipelineExecutionStepState4.equals(pipelineExecutionStepState3));
        System.assert(pipelineExecutionStepState3.equals(pipelineExecutionStepState3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState3 = new OASPipelineExecutionStepState();
        OASPipelineExecutionStepState pipelineExecutionStepState4 = new OASPipelineExecutionStepState();

        System.assert(pipelineExecutionStepState1.equals(pipelineExecutionStepState2));
        System.assert(pipelineExecutionStepState2.equals(pipelineExecutionStepState1));
        System.assert(pipelineExecutionStepState3.equals(pipelineExecutionStepState4));
        System.assert(pipelineExecutionStepState4.equals(pipelineExecutionStepState3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = new OASPipelineExecutionStepState();

        System.assertEquals(false, pipelineExecutionStepState1.equals('foo'));
        System.assertEquals(false, pipelineExecutionStepState2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = new OASPipelineExecutionStepState();
        OASPipelineExecutionStepState pipelineExecutionStepState3;

        System.assertEquals(false, pipelineExecutionStepState1.equals(pipelineExecutionStepState3));
        System.assertEquals(false, pipelineExecutionStepState2.equals(pipelineExecutionStepState3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = new OASPipelineExecutionStepState();

        System.assertEquals(pipelineExecutionStepState1.hashCode(), pipelineExecutionStepState1.hashCode());
        System.assertEquals(pipelineExecutionStepState2.hashCode(), pipelineExecutionStepState2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecutionStepState pipelineExecutionStepState1 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState2 = OASPipelineExecutionStepState.getExample();
        OASPipelineExecutionStepState pipelineExecutionStepState3 = new OASPipelineExecutionStepState();
        OASPipelineExecutionStepState pipelineExecutionStepState4 = new OASPipelineExecutionStepState();

        System.assert(pipelineExecutionStepState1.equals(pipelineExecutionStepState2));
        System.assert(pipelineExecutionStepState3.equals(pipelineExecutionStepState4));
        System.assertEquals(pipelineExecutionStepState1.hashCode(), pipelineExecutionStepState2.hashCode());
        System.assertEquals(pipelineExecutionStepState3.hashCode(), pipelineExecutionStepState4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineExecutionStepState pipelineExecutionStepState = new OASPipelineExecutionStepState();
        Map<String, String> propertyMappings = pipelineExecutionStepState.getPropertyMappings();
        System.assertEquals('links', propertyMappings.get('_links'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPipelineExecutionStepState pipelineExecutionStepState = new OASPipelineExecutionStepState();
        System.assertEquals(new Map<String, Object>(), pipelineExecutionStepState.details);
        System.assertEquals(null, pipelineExecutionStepState.id);
        System.assertEquals(null, pipelineExecutionStepState.stepId);
        System.assertEquals(null, pipelineExecutionStepState.phaseId);
        System.assertEquals(null, pipelineExecutionStepState.action);
        System.assertEquals(null, pipelineExecutionStepState.repository);
        System.assertEquals(null, pipelineExecutionStepState.branch);
        System.assertEquals(null, pipelineExecutionStepState.environment);
        System.assertEquals(null, pipelineExecutionStepState.environmentType);
        System.assertEquals(null, pipelineExecutionStepState.startedAt);
        System.assertEquals(null, pipelineExecutionStepState.finishedAt);
        System.assertEquals(null, pipelineExecutionStepState.status);
        System.assertEquals(null, pipelineExecutionStepState.links);
    }
}
