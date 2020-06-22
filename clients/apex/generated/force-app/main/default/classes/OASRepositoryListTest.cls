@isTest
private class OASRepositoryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = repositoryList1;
        OASRepositoryList repositoryList3 = new OASRepositoryList();
        OASRepositoryList repositoryList4 = repositoryList3;

        System.assert(repositoryList1.equals(repositoryList2));
        System.assert(repositoryList2.equals(repositoryList1));
        System.assert(repositoryList1.equals(repositoryList1));
        System.assert(repositoryList3.equals(repositoryList4));
        System.assert(repositoryList4.equals(repositoryList3));
        System.assert(repositoryList3.equals(repositoryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList3 = new OASRepositoryList();
        OASRepositoryList repositoryList4 = new OASRepositoryList();

        System.assert(repositoryList1.equals(repositoryList2));
        System.assert(repositoryList2.equals(repositoryList1));
        System.assert(repositoryList3.equals(repositoryList4));
        System.assert(repositoryList4.equals(repositoryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = new OASRepositoryList();

        System.assertEquals(false, repositoryList1.equals('foo'));
        System.assertEquals(false, repositoryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = new OASRepositoryList();
        OASRepositoryList repositoryList3;

        System.assertEquals(false, repositoryList1.equals(repositoryList3));
        System.assertEquals(false, repositoryList2.equals(repositoryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = new OASRepositoryList();

        System.assertEquals(repositoryList1.hashCode(), repositoryList1.hashCode());
        System.assertEquals(repositoryList2.hashCode(), repositoryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepositoryList repositoryList1 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList2 = OASRepositoryList.getExample();
        OASRepositoryList repositoryList3 = new OASRepositoryList();
        OASRepositoryList repositoryList4 = new OASRepositoryList();

        System.assert(repositoryList1.equals(repositoryList2));
        System.assert(repositoryList3.equals(repositoryList4));
        System.assertEquals(repositoryList1.hashCode(), repositoryList2.hashCode());
        System.assertEquals(repositoryList3.hashCode(), repositoryList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRepositoryList repositoryList = new OASRepositoryList();
        Map<String, String> propertyMappings = repositoryList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
