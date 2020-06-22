@isTest
private class OASPipelineExecutionListRepresentatiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = pipelineExecutionListRepresentationLinks1;
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks3 = new OASPipelineExecutionListRepresentati();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks4 = pipelineExecutionListRepresentationLinks3;

        System.assert(pipelineExecutionListRepresentationLinks1.equals(pipelineExecutionListRepresentationLinks2));
        System.assert(pipelineExecutionListRepresentationLinks2.equals(pipelineExecutionListRepresentationLinks1));
        System.assert(pipelineExecutionListRepresentationLinks1.equals(pipelineExecutionListRepresentationLinks1));
        System.assert(pipelineExecutionListRepresentationLinks3.equals(pipelineExecutionListRepresentationLinks4));
        System.assert(pipelineExecutionListRepresentationLinks4.equals(pipelineExecutionListRepresentationLinks3));
        System.assert(pipelineExecutionListRepresentationLinks3.equals(pipelineExecutionListRepresentationLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks3 = new OASPipelineExecutionListRepresentati();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks4 = new OASPipelineExecutionListRepresentati();

        System.assert(pipelineExecutionListRepresentationLinks1.equals(pipelineExecutionListRepresentationLinks2));
        System.assert(pipelineExecutionListRepresentationLinks2.equals(pipelineExecutionListRepresentationLinks1));
        System.assert(pipelineExecutionListRepresentationLinks3.equals(pipelineExecutionListRepresentationLinks4));
        System.assert(pipelineExecutionListRepresentationLinks4.equals(pipelineExecutionListRepresentationLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = new OASPipelineExecutionListRepresentati();

        System.assertEquals(false, pipelineExecutionListRepresentationLinks1.equals('foo'));
        System.assertEquals(false, pipelineExecutionListRepresentationLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = new OASPipelineExecutionListRepresentati();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks3;

        System.assertEquals(false, pipelineExecutionListRepresentationLinks1.equals(pipelineExecutionListRepresentationLinks3));
        System.assertEquals(false, pipelineExecutionListRepresentationLinks2.equals(pipelineExecutionListRepresentationLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = new OASPipelineExecutionListRepresentati();

        System.assertEquals(pipelineExecutionListRepresentationLinks1.hashCode(), pipelineExecutionListRepresentationLinks1.hashCode());
        System.assertEquals(pipelineExecutionListRepresentationLinks2.hashCode(), pipelineExecutionListRepresentationLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks1 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks2 = OASPipelineExecutionListRepresentati.getExample();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks3 = new OASPipelineExecutionListRepresentati();
        OASPipelineExecutionListRepresentati pipelineExecutionListRepresentationLinks4 = new OASPipelineExecutionListRepresentati();

        System.assert(pipelineExecutionListRepresentationLinks1.equals(pipelineExecutionListRepresentationLinks2));
        System.assert(pipelineExecutionListRepresentationLinks3.equals(pipelineExecutionListRepresentationLinks4));
        System.assertEquals(pipelineExecutionListRepresentationLinks1.hashCode(), pipelineExecutionListRepresentationLinks2.hashCode());
        System.assertEquals(pipelineExecutionListRepresentationLinks3.hashCode(), pipelineExecutionListRepresentationLinks4.hashCode());
    }
}
