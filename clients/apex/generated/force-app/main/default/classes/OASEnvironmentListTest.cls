@isTest
private class OASEnvironmentListTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = environmentList1;
        OASEnvironmentList environmentList3 = new OASEnvironmentList();
        OASEnvironmentList environmentList4 = environmentList3;

        System.assert(environmentList1.equals(environmentList2));
        System.assert(environmentList2.equals(environmentList1));
        System.assert(environmentList1.equals(environmentList1));
        System.assert(environmentList3.equals(environmentList4));
        System.assert(environmentList4.equals(environmentList3));
        System.assert(environmentList3.equals(environmentList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList3 = new OASEnvironmentList();
        OASEnvironmentList environmentList4 = new OASEnvironmentList();

        System.assert(environmentList1.equals(environmentList2));
        System.assert(environmentList2.equals(environmentList1));
        System.assert(environmentList3.equals(environmentList4));
        System.assert(environmentList4.equals(environmentList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = new OASEnvironmentList();

        System.assertEquals(false, environmentList1.equals('foo'));
        System.assertEquals(false, environmentList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = new OASEnvironmentList();
        OASEnvironmentList environmentList3;

        System.assertEquals(false, environmentList1.equals(environmentList3));
        System.assertEquals(false, environmentList2.equals(environmentList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = new OASEnvironmentList();

        System.assertEquals(environmentList1.hashCode(), environmentList1.hashCode());
        System.assertEquals(environmentList2.hashCode(), environmentList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentList environmentList1 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList2 = OASEnvironmentList.getExample();
        OASEnvironmentList environmentList3 = new OASEnvironmentList();
        OASEnvironmentList environmentList4 = new OASEnvironmentList();

        System.assert(environmentList1.equals(environmentList2));
        System.assert(environmentList3.equals(environmentList4));
        System.assertEquals(environmentList1.hashCode(), environmentList2.hashCode());
        System.assertEquals(environmentList3.hashCode(), environmentList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentList environmentList = new OASEnvironmentList();
        Map<String, String> propertyMappings = environmentList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
