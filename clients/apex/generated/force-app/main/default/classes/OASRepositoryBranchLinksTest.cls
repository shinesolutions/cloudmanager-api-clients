@isTest
private class OASRepositoryBranchLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = repositoryBranchLinks1;
        OASRepositoryBranchLinks repositoryBranchLinks3 = new OASRepositoryBranchLinks();
        OASRepositoryBranchLinks repositoryBranchLinks4 = repositoryBranchLinks3;

        System.assert(repositoryBranchLinks1.equals(repositoryBranchLinks2));
        System.assert(repositoryBranchLinks2.equals(repositoryBranchLinks1));
        System.assert(repositoryBranchLinks1.equals(repositoryBranchLinks1));
        System.assert(repositoryBranchLinks3.equals(repositoryBranchLinks4));
        System.assert(repositoryBranchLinks4.equals(repositoryBranchLinks3));
        System.assert(repositoryBranchLinks3.equals(repositoryBranchLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks3 = new OASRepositoryBranchLinks();
        OASRepositoryBranchLinks repositoryBranchLinks4 = new OASRepositoryBranchLinks();

        System.assert(repositoryBranchLinks1.equals(repositoryBranchLinks2));
        System.assert(repositoryBranchLinks2.equals(repositoryBranchLinks1));
        System.assert(repositoryBranchLinks3.equals(repositoryBranchLinks4));
        System.assert(repositoryBranchLinks4.equals(repositoryBranchLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = new OASRepositoryBranchLinks();

        System.assertEquals(false, repositoryBranchLinks1.equals('foo'));
        System.assertEquals(false, repositoryBranchLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = new OASRepositoryBranchLinks();
        OASRepositoryBranchLinks repositoryBranchLinks3;

        System.assertEquals(false, repositoryBranchLinks1.equals(repositoryBranchLinks3));
        System.assertEquals(false, repositoryBranchLinks2.equals(repositoryBranchLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = new OASRepositoryBranchLinks();

        System.assertEquals(repositoryBranchLinks1.hashCode(), repositoryBranchLinks1.hashCode());
        System.assertEquals(repositoryBranchLinks2.hashCode(), repositoryBranchLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepositoryBranchLinks repositoryBranchLinks1 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks2 = OASRepositoryBranchLinks.getExample();
        OASRepositoryBranchLinks repositoryBranchLinks3 = new OASRepositoryBranchLinks();
        OASRepositoryBranchLinks repositoryBranchLinks4 = new OASRepositoryBranchLinks();

        System.assert(repositoryBranchLinks1.equals(repositoryBranchLinks2));
        System.assert(repositoryBranchLinks3.equals(repositoryBranchLinks4));
        System.assertEquals(repositoryBranchLinks1.hashCode(), repositoryBranchLinks2.hashCode());
        System.assertEquals(repositoryBranchLinks3.hashCode(), repositoryBranchLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRepositoryBranchLinks repositoryBranchLinks = new OASRepositoryBranchLinks();
        Map<String, String> propertyMappings = repositoryBranchLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
        System.assertEquals('httpNsAdobeComAdobecloudRelRepository', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/repository'));
    }
}
