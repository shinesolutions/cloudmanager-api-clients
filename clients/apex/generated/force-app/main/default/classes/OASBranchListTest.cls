@isTest
private class OASBranchListTest {
    @isTest
    private static void equalsSameInstance() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = branchList1;
        OASBranchList branchList3 = new OASBranchList();
        OASBranchList branchList4 = branchList3;

        System.assert(branchList1.equals(branchList2));
        System.assert(branchList2.equals(branchList1));
        System.assert(branchList1.equals(branchList1));
        System.assert(branchList3.equals(branchList4));
        System.assert(branchList4.equals(branchList3));
        System.assert(branchList3.equals(branchList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = OASBranchList.getExample();
        OASBranchList branchList3 = new OASBranchList();
        OASBranchList branchList4 = new OASBranchList();

        System.assert(branchList1.equals(branchList2));
        System.assert(branchList2.equals(branchList1));
        System.assert(branchList3.equals(branchList4));
        System.assert(branchList4.equals(branchList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = new OASBranchList();

        System.assertEquals(false, branchList1.equals('foo'));
        System.assertEquals(false, branchList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = new OASBranchList();
        OASBranchList branchList3;

        System.assertEquals(false, branchList1.equals(branchList3));
        System.assertEquals(false, branchList2.equals(branchList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = new OASBranchList();

        System.assertEquals(branchList1.hashCode(), branchList1.hashCode());
        System.assertEquals(branchList2.hashCode(), branchList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBranchList branchList1 = OASBranchList.getExample();
        OASBranchList branchList2 = OASBranchList.getExample();
        OASBranchList branchList3 = new OASBranchList();
        OASBranchList branchList4 = new OASBranchList();

        System.assert(branchList1.equals(branchList2));
        System.assert(branchList3.equals(branchList4));
        System.assertEquals(branchList1.hashCode(), branchList2.hashCode());
        System.assertEquals(branchList3.hashCode(), branchList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBranchList branchList = new OASBranchList();
        Map<String, String> propertyMappings = branchList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
