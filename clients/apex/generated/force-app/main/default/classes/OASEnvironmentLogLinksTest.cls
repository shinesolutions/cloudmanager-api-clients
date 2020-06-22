@isTest
private class OASEnvironmentLogLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = environmentLogLinks1;
        OASEnvironmentLogLinks environmentLogLinks3 = new OASEnvironmentLogLinks();
        OASEnvironmentLogLinks environmentLogLinks4 = environmentLogLinks3;

        System.assert(environmentLogLinks1.equals(environmentLogLinks2));
        System.assert(environmentLogLinks2.equals(environmentLogLinks1));
        System.assert(environmentLogLinks1.equals(environmentLogLinks1));
        System.assert(environmentLogLinks3.equals(environmentLogLinks4));
        System.assert(environmentLogLinks4.equals(environmentLogLinks3));
        System.assert(environmentLogLinks3.equals(environmentLogLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks3 = new OASEnvironmentLogLinks();
        OASEnvironmentLogLinks environmentLogLinks4 = new OASEnvironmentLogLinks();

        System.assert(environmentLogLinks1.equals(environmentLogLinks2));
        System.assert(environmentLogLinks2.equals(environmentLogLinks1));
        System.assert(environmentLogLinks3.equals(environmentLogLinks4));
        System.assert(environmentLogLinks4.equals(environmentLogLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = new OASEnvironmentLogLinks();

        System.assertEquals(false, environmentLogLinks1.equals('foo'));
        System.assertEquals(false, environmentLogLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = new OASEnvironmentLogLinks();
        OASEnvironmentLogLinks environmentLogLinks3;

        System.assertEquals(false, environmentLogLinks1.equals(environmentLogLinks3));
        System.assertEquals(false, environmentLogLinks2.equals(environmentLogLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = new OASEnvironmentLogLinks();

        System.assertEquals(environmentLogLinks1.hashCode(), environmentLogLinks1.hashCode());
        System.assertEquals(environmentLogLinks2.hashCode(), environmentLogLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLogLinks environmentLogLinks1 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks2 = OASEnvironmentLogLinks.getExample();
        OASEnvironmentLogLinks environmentLogLinks3 = new OASEnvironmentLogLinks();
        OASEnvironmentLogLinks environmentLogLinks4 = new OASEnvironmentLogLinks();

        System.assert(environmentLogLinks1.equals(environmentLogLinks2));
        System.assert(environmentLogLinks3.equals(environmentLogLinks4));
        System.assertEquals(environmentLogLinks1.hashCode(), environmentLogLinks2.hashCode());
        System.assertEquals(environmentLogLinks3.hashCode(), environmentLogLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentLogLinks environmentLogLinks = new OASEnvironmentLogLinks();
        Map<String, String> propertyMappings = environmentLogLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelLogsDownload', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/logs/download'));
        System.assertEquals('httpNsAdobeComAdobecloudRelLogsTail', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/logs/tail'));
    }
}
