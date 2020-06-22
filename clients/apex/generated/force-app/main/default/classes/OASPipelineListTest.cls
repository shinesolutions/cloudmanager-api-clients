@isTest
private class OASPipelineListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = pipelineList1;
        OASPipelineList pipelineList3 = new OASPipelineList();
        OASPipelineList pipelineList4 = pipelineList3;

        System.assert(pipelineList1.equals(pipelineList2));
        System.assert(pipelineList2.equals(pipelineList1));
        System.assert(pipelineList1.equals(pipelineList1));
        System.assert(pipelineList3.equals(pipelineList4));
        System.assert(pipelineList4.equals(pipelineList3));
        System.assert(pipelineList3.equals(pipelineList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = OASPipelineList.getExample();
        OASPipelineList pipelineList3 = new OASPipelineList();
        OASPipelineList pipelineList4 = new OASPipelineList();

        System.assert(pipelineList1.equals(pipelineList2));
        System.assert(pipelineList2.equals(pipelineList1));
        System.assert(pipelineList3.equals(pipelineList4));
        System.assert(pipelineList4.equals(pipelineList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = new OASPipelineList();

        System.assertEquals(false, pipelineList1.equals('foo'));
        System.assertEquals(false, pipelineList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = new OASPipelineList();
        OASPipelineList pipelineList3;

        System.assertEquals(false, pipelineList1.equals(pipelineList3));
        System.assertEquals(false, pipelineList2.equals(pipelineList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = new OASPipelineList();

        System.assertEquals(pipelineList1.hashCode(), pipelineList1.hashCode());
        System.assertEquals(pipelineList2.hashCode(), pipelineList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineList pipelineList1 = OASPipelineList.getExample();
        OASPipelineList pipelineList2 = OASPipelineList.getExample();
        OASPipelineList pipelineList3 = new OASPipelineList();
        OASPipelineList pipelineList4 = new OASPipelineList();

        System.assert(pipelineList1.equals(pipelineList2));
        System.assert(pipelineList3.equals(pipelineList4));
        System.assertEquals(pipelineList1.hashCode(), pipelineList2.hashCode());
        System.assertEquals(pipelineList3.hashCode(), pipelineList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineList pipelineList = new OASPipelineList();
        Map<String, String> propertyMappings = pipelineList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
