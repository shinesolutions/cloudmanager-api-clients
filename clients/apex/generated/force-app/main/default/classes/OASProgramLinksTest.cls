@isTest
private class OASProgramLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = programLinks1;
        OASProgramLinks programLinks3 = new OASProgramLinks();
        OASProgramLinks programLinks4 = programLinks3;

        System.assert(programLinks1.equals(programLinks2));
        System.assert(programLinks2.equals(programLinks1));
        System.assert(programLinks1.equals(programLinks1));
        System.assert(programLinks3.equals(programLinks4));
        System.assert(programLinks4.equals(programLinks3));
        System.assert(programLinks3.equals(programLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = OASProgramLinks.getExample();
        OASProgramLinks programLinks3 = new OASProgramLinks();
        OASProgramLinks programLinks4 = new OASProgramLinks();

        System.assert(programLinks1.equals(programLinks2));
        System.assert(programLinks2.equals(programLinks1));
        System.assert(programLinks3.equals(programLinks4));
        System.assert(programLinks4.equals(programLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = new OASProgramLinks();

        System.assertEquals(false, programLinks1.equals('foo'));
        System.assertEquals(false, programLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = new OASProgramLinks();
        OASProgramLinks programLinks3;

        System.assertEquals(false, programLinks1.equals(programLinks3));
        System.assertEquals(false, programLinks2.equals(programLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = new OASProgramLinks();

        System.assertEquals(programLinks1.hashCode(), programLinks1.hashCode());
        System.assertEquals(programLinks2.hashCode(), programLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProgramLinks programLinks1 = OASProgramLinks.getExample();
        OASProgramLinks programLinks2 = OASProgramLinks.getExample();
        OASProgramLinks programLinks3 = new OASProgramLinks();
        OASProgramLinks programLinks4 = new OASProgramLinks();

        System.assert(programLinks1.equals(programLinks2));
        System.assert(programLinks3.equals(programLinks4));
        System.assertEquals(programLinks1.hashCode(), programLinks2.hashCode());
        System.assertEquals(programLinks3.hashCode(), programLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProgramLinks programLinks = new OASProgramLinks();
        Map<String, String> propertyMappings = programLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelPipelines', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipelines'));
        System.assertEquals('httpNsAdobeComAdobecloudRelEnvironments', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/environments'));
        System.assertEquals('httpNsAdobeComAdobecloudRelRepositories', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/repositories'));
    }
}
