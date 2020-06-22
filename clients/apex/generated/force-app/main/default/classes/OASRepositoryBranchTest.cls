@isTest
private class OASRepositoryBranchTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = repositoryBranch1;
        OASRepositoryBranch repositoryBranch3 = new OASRepositoryBranch();
        OASRepositoryBranch repositoryBranch4 = repositoryBranch3;

        System.assert(repositoryBranch1.equals(repositoryBranch2));
        System.assert(repositoryBranch2.equals(repositoryBranch1));
        System.assert(repositoryBranch1.equals(repositoryBranch1));
        System.assert(repositoryBranch3.equals(repositoryBranch4));
        System.assert(repositoryBranch4.equals(repositoryBranch3));
        System.assert(repositoryBranch3.equals(repositoryBranch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch3 = new OASRepositoryBranch();
        OASRepositoryBranch repositoryBranch4 = new OASRepositoryBranch();

        System.assert(repositoryBranch1.equals(repositoryBranch2));
        System.assert(repositoryBranch2.equals(repositoryBranch1));
        System.assert(repositoryBranch3.equals(repositoryBranch4));
        System.assert(repositoryBranch4.equals(repositoryBranch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = new OASRepositoryBranch();

        System.assertEquals(false, repositoryBranch1.equals('foo'));
        System.assertEquals(false, repositoryBranch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = new OASRepositoryBranch();
        OASRepositoryBranch repositoryBranch3;

        System.assertEquals(false, repositoryBranch1.equals(repositoryBranch3));
        System.assertEquals(false, repositoryBranch2.equals(repositoryBranch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = new OASRepositoryBranch();

        System.assertEquals(repositoryBranch1.hashCode(), repositoryBranch1.hashCode());
        System.assertEquals(repositoryBranch2.hashCode(), repositoryBranch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepositoryBranch repositoryBranch1 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch2 = OASRepositoryBranch.getExample();
        OASRepositoryBranch repositoryBranch3 = new OASRepositoryBranch();
        OASRepositoryBranch repositoryBranch4 = new OASRepositoryBranch();

        System.assert(repositoryBranch1.equals(repositoryBranch2));
        System.assert(repositoryBranch3.equals(repositoryBranch4));
        System.assertEquals(repositoryBranch1.hashCode(), repositoryBranch2.hashCode());
        System.assertEquals(repositoryBranch3.hashCode(), repositoryBranch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRepositoryBranch repositoryBranch = new OASRepositoryBranch();
        Map<String, String> propertyMappings = repositoryBranch.getPropertyMappings();
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
