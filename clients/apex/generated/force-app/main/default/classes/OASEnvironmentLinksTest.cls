@isTest
private class OASEnvironmentLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = environmentLinks1;
        OASEnvironmentLinks environmentLinks3 = new OASEnvironmentLinks();
        OASEnvironmentLinks environmentLinks4 = environmentLinks3;

        System.assert(environmentLinks1.equals(environmentLinks2));
        System.assert(environmentLinks2.equals(environmentLinks1));
        System.assert(environmentLinks1.equals(environmentLinks1));
        System.assert(environmentLinks3.equals(environmentLinks4));
        System.assert(environmentLinks4.equals(environmentLinks3));
        System.assert(environmentLinks3.equals(environmentLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks3 = new OASEnvironmentLinks();
        OASEnvironmentLinks environmentLinks4 = new OASEnvironmentLinks();

        System.assert(environmentLinks1.equals(environmentLinks2));
        System.assert(environmentLinks2.equals(environmentLinks1));
        System.assert(environmentLinks3.equals(environmentLinks4));
        System.assert(environmentLinks4.equals(environmentLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = new OASEnvironmentLinks();

        System.assertEquals(false, environmentLinks1.equals('foo'));
        System.assertEquals(false, environmentLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = new OASEnvironmentLinks();
        OASEnvironmentLinks environmentLinks3;

        System.assertEquals(false, environmentLinks1.equals(environmentLinks3));
        System.assertEquals(false, environmentLinks2.equals(environmentLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = new OASEnvironmentLinks();

        System.assertEquals(environmentLinks1.hashCode(), environmentLinks1.hashCode());
        System.assertEquals(environmentLinks2.hashCode(), environmentLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLinks environmentLinks1 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks2 = OASEnvironmentLinks.getExample();
        OASEnvironmentLinks environmentLinks3 = new OASEnvironmentLinks();
        OASEnvironmentLinks environmentLinks4 = new OASEnvironmentLinks();

        System.assert(environmentLinks1.equals(environmentLinks2));
        System.assert(environmentLinks3.equals(environmentLinks4));
        System.assertEquals(environmentLinks1.hashCode(), environmentLinks2.hashCode());
        System.assertEquals(environmentLinks3.hashCode(), environmentLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentLinks environmentLinks = new OASEnvironmentLinks();
        Map<String, String> propertyMappings = environmentLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipeline', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline'));
        System.assertEquals('httpNsAdobeComAdobecloudRelAuthor', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/author'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPublish', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/publish'));
        System.assertEquals('httpNsAdobeComAdobecloudRelDeveloperConsole', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/developerConsole'));
        System.assertEquals('httpNsAdobeComAdobecloudRelLogs', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/logs'));
        System.assertEquals('httpNsAdobeComAdobecloudRelVariables', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/variables'));
    }
}
