@isTest
private class OASPipelineLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = pipelineLinks1;
        OASPipelineLinks pipelineLinks3 = new OASPipelineLinks();
        OASPipelineLinks pipelineLinks4 = pipelineLinks3;

        System.assert(pipelineLinks1.equals(pipelineLinks2));
        System.assert(pipelineLinks2.equals(pipelineLinks1));
        System.assert(pipelineLinks1.equals(pipelineLinks1));
        System.assert(pipelineLinks3.equals(pipelineLinks4));
        System.assert(pipelineLinks4.equals(pipelineLinks3));
        System.assert(pipelineLinks3.equals(pipelineLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks3 = new OASPipelineLinks();
        OASPipelineLinks pipelineLinks4 = new OASPipelineLinks();

        System.assert(pipelineLinks1.equals(pipelineLinks2));
        System.assert(pipelineLinks2.equals(pipelineLinks1));
        System.assert(pipelineLinks3.equals(pipelineLinks4));
        System.assert(pipelineLinks4.equals(pipelineLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = new OASPipelineLinks();

        System.assertEquals(false, pipelineLinks1.equals('foo'));
        System.assertEquals(false, pipelineLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = new OASPipelineLinks();
        OASPipelineLinks pipelineLinks3;

        System.assertEquals(false, pipelineLinks1.equals(pipelineLinks3));
        System.assertEquals(false, pipelineLinks2.equals(pipelineLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = new OASPipelineLinks();

        System.assertEquals(pipelineLinks1.hashCode(), pipelineLinks1.hashCode());
        System.assertEquals(pipelineLinks2.hashCode(), pipelineLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineLinks pipelineLinks1 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks2 = OASPipelineLinks.getExample();
        OASPipelineLinks pipelineLinks3 = new OASPipelineLinks();
        OASPipelineLinks pipelineLinks4 = new OASPipelineLinks();

        System.assert(pipelineLinks1.equals(pipelineLinks2));
        System.assert(pipelineLinks3.equals(pipelineLinks4));
        System.assertEquals(pipelineLinks1.hashCode(), pipelineLinks2.hashCode());
        System.assertEquals(pipelineLinks3.hashCode(), pipelineLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineLinks pipelineLinks = new OASPipelineLinks();
        Map<String, String> propertyMappings = pipelineLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
        System.assertEquals('httpNsAdobeComAdobecloudRelExecution', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/execution'));
        System.assertEquals('httpNsAdobeComAdobecloudRelExecutions', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/executions'));
        System.assertEquals('httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution'));
    }
}
