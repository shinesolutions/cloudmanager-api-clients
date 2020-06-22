@isTest
private class OASEnvironmentLogsLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = environmentLogsLinks1;
        OASEnvironmentLogsLinks environmentLogsLinks3 = new OASEnvironmentLogsLinks();
        OASEnvironmentLogsLinks environmentLogsLinks4 = environmentLogsLinks3;

        System.assert(environmentLogsLinks1.equals(environmentLogsLinks2));
        System.assert(environmentLogsLinks2.equals(environmentLogsLinks1));
        System.assert(environmentLogsLinks1.equals(environmentLogsLinks1));
        System.assert(environmentLogsLinks3.equals(environmentLogsLinks4));
        System.assert(environmentLogsLinks4.equals(environmentLogsLinks3));
        System.assert(environmentLogsLinks3.equals(environmentLogsLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks3 = new OASEnvironmentLogsLinks();
        OASEnvironmentLogsLinks environmentLogsLinks4 = new OASEnvironmentLogsLinks();

        System.assert(environmentLogsLinks1.equals(environmentLogsLinks2));
        System.assert(environmentLogsLinks2.equals(environmentLogsLinks1));
        System.assert(environmentLogsLinks3.equals(environmentLogsLinks4));
        System.assert(environmentLogsLinks4.equals(environmentLogsLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = new OASEnvironmentLogsLinks();

        System.assertEquals(false, environmentLogsLinks1.equals('foo'));
        System.assertEquals(false, environmentLogsLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = new OASEnvironmentLogsLinks();
        OASEnvironmentLogsLinks environmentLogsLinks3;

        System.assertEquals(false, environmentLogsLinks1.equals(environmentLogsLinks3));
        System.assertEquals(false, environmentLogsLinks2.equals(environmentLogsLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = new OASEnvironmentLogsLinks();

        System.assertEquals(environmentLogsLinks1.hashCode(), environmentLogsLinks1.hashCode());
        System.assertEquals(environmentLogsLinks2.hashCode(), environmentLogsLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLogsLinks environmentLogsLinks1 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks2 = OASEnvironmentLogsLinks.getExample();
        OASEnvironmentLogsLinks environmentLogsLinks3 = new OASEnvironmentLogsLinks();
        OASEnvironmentLogsLinks environmentLogsLinks4 = new OASEnvironmentLogsLinks();

        System.assert(environmentLogsLinks1.equals(environmentLogsLinks2));
        System.assert(environmentLogsLinks3.equals(environmentLogsLinks4));
        System.assertEquals(environmentLogsLinks1.hashCode(), environmentLogsLinks2.hashCode());
        System.assertEquals(environmentLogsLinks3.hashCode(), environmentLogsLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentLogsLinks environmentLogsLinks = new OASEnvironmentLogsLinks();
        Map<String, String> propertyMappings = environmentLogsLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
    }
}
