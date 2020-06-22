@isTest
private class OASRepositoryLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = repositoryLinks1;
        OASRepositoryLinks repositoryLinks3 = new OASRepositoryLinks();
        OASRepositoryLinks repositoryLinks4 = repositoryLinks3;

        System.assert(repositoryLinks1.equals(repositoryLinks2));
        System.assert(repositoryLinks2.equals(repositoryLinks1));
        System.assert(repositoryLinks1.equals(repositoryLinks1));
        System.assert(repositoryLinks3.equals(repositoryLinks4));
        System.assert(repositoryLinks4.equals(repositoryLinks3));
        System.assert(repositoryLinks3.equals(repositoryLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks3 = new OASRepositoryLinks();
        OASRepositoryLinks repositoryLinks4 = new OASRepositoryLinks();

        System.assert(repositoryLinks1.equals(repositoryLinks2));
        System.assert(repositoryLinks2.equals(repositoryLinks1));
        System.assert(repositoryLinks3.equals(repositoryLinks4));
        System.assert(repositoryLinks4.equals(repositoryLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = new OASRepositoryLinks();

        System.assertEquals(false, repositoryLinks1.equals('foo'));
        System.assertEquals(false, repositoryLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = new OASRepositoryLinks();
        OASRepositoryLinks repositoryLinks3;

        System.assertEquals(false, repositoryLinks1.equals(repositoryLinks3));
        System.assertEquals(false, repositoryLinks2.equals(repositoryLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = new OASRepositoryLinks();

        System.assertEquals(repositoryLinks1.hashCode(), repositoryLinks1.hashCode());
        System.assertEquals(repositoryLinks2.hashCode(), repositoryLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepositoryLinks repositoryLinks1 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks2 = OASRepositoryLinks.getExample();
        OASRepositoryLinks repositoryLinks3 = new OASRepositoryLinks();
        OASRepositoryLinks repositoryLinks4 = new OASRepositoryLinks();

        System.assert(repositoryLinks1.equals(repositoryLinks2));
        System.assert(repositoryLinks3.equals(repositoryLinks4));
        System.assertEquals(repositoryLinks1.hashCode(), repositoryLinks2.hashCode());
        System.assertEquals(repositoryLinks3.hashCode(), repositoryLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRepositoryLinks repositoryLinks = new OASRepositoryLinks();
        Map<String, String> propertyMappings = repositoryLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
        System.assertEquals('httpNsAdobeComAdobecloudRelBranches', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/branches'));
    }
}
