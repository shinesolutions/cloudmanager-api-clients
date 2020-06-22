@isTest
private class OASProgramListTest {
    @isTest
    private static void equalsSameInstance() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = programList1;
        OASProgramList programList3 = new OASProgramList();
        OASProgramList programList4 = programList3;

        System.assert(programList1.equals(programList2));
        System.assert(programList2.equals(programList1));
        System.assert(programList1.equals(programList1));
        System.assert(programList3.equals(programList4));
        System.assert(programList4.equals(programList3));
        System.assert(programList3.equals(programList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = OASProgramList.getExample();
        OASProgramList programList3 = new OASProgramList();
        OASProgramList programList4 = new OASProgramList();

        System.assert(programList1.equals(programList2));
        System.assert(programList2.equals(programList1));
        System.assert(programList3.equals(programList4));
        System.assert(programList4.equals(programList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = new OASProgramList();

        System.assertEquals(false, programList1.equals('foo'));
        System.assertEquals(false, programList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = new OASProgramList();
        OASProgramList programList3;

        System.assertEquals(false, programList1.equals(programList3));
        System.assertEquals(false, programList2.equals(programList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = new OASProgramList();

        System.assertEquals(programList1.hashCode(), programList1.hashCode());
        System.assertEquals(programList2.hashCode(), programList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProgramList programList1 = OASProgramList.getExample();
        OASProgramList programList2 = OASProgramList.getExample();
        OASProgramList programList3 = new OASProgramList();
        OASProgramList programList4 = new OASProgramList();

        System.assert(programList1.equals(programList2));
        System.assert(programList3.equals(programList4));
        System.assertEquals(programList1.hashCode(), programList2.hashCode());
        System.assertEquals(programList3.hashCode(), programList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProgramList programList = new OASProgramList();
        Map<String, String> propertyMappings = programList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
