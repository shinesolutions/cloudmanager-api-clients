@isTest
private class OASPipelineExecutionLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = pipelineExecutionLinks1;
        OASPipelineExecutionLinks pipelineExecutionLinks3 = new OASPipelineExecutionLinks();
        OASPipelineExecutionLinks pipelineExecutionLinks4 = pipelineExecutionLinks3;

        System.assert(pipelineExecutionLinks1.equals(pipelineExecutionLinks2));
        System.assert(pipelineExecutionLinks2.equals(pipelineExecutionLinks1));
        System.assert(pipelineExecutionLinks1.equals(pipelineExecutionLinks1));
        System.assert(pipelineExecutionLinks3.equals(pipelineExecutionLinks4));
        System.assert(pipelineExecutionLinks4.equals(pipelineExecutionLinks3));
        System.assert(pipelineExecutionLinks3.equals(pipelineExecutionLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks3 = new OASPipelineExecutionLinks();
        OASPipelineExecutionLinks pipelineExecutionLinks4 = new OASPipelineExecutionLinks();

        System.assert(pipelineExecutionLinks1.equals(pipelineExecutionLinks2));
        System.assert(pipelineExecutionLinks2.equals(pipelineExecutionLinks1));
        System.assert(pipelineExecutionLinks3.equals(pipelineExecutionLinks4));
        System.assert(pipelineExecutionLinks4.equals(pipelineExecutionLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = new OASPipelineExecutionLinks();

        System.assertEquals(false, pipelineExecutionLinks1.equals('foo'));
        System.assertEquals(false, pipelineExecutionLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = new OASPipelineExecutionLinks();
        OASPipelineExecutionLinks pipelineExecutionLinks3;

        System.assertEquals(false, pipelineExecutionLinks1.equals(pipelineExecutionLinks3));
        System.assertEquals(false, pipelineExecutionLinks2.equals(pipelineExecutionLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = new OASPipelineExecutionLinks();

        System.assertEquals(pipelineExecutionLinks1.hashCode(), pipelineExecutionLinks1.hashCode());
        System.assertEquals(pipelineExecutionLinks2.hashCode(), pipelineExecutionLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecutionLinks pipelineExecutionLinks1 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks2 = OASPipelineExecutionLinks.getExample();
        OASPipelineExecutionLinks pipelineExecutionLinks3 = new OASPipelineExecutionLinks();
        OASPipelineExecutionLinks pipelineExecutionLinks4 = new OASPipelineExecutionLinks();

        System.assert(pipelineExecutionLinks1.equals(pipelineExecutionLinks2));
        System.assert(pipelineExecutionLinks3.equals(pipelineExecutionLinks4));
        System.assertEquals(pipelineExecutionLinks1.hashCode(), pipelineExecutionLinks2.hashCode());
        System.assertEquals(pipelineExecutionLinks3.hashCode(), pipelineExecutionLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineExecutionLinks pipelineExecutionLinks = new OASPipelineExecutionLinks();
        Map<String, String> propertyMappings = pipelineExecutionLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipeline', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline'));
    }
}
