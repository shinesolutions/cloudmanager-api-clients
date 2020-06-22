@isTest
private class OASPipelineExecutionStepStateLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = pipelineExecutionStepStateLinks1;
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks3 = new OASPipelineExecutionStepStateLinks();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks4 = pipelineExecutionStepStateLinks3;

        System.assert(pipelineExecutionStepStateLinks1.equals(pipelineExecutionStepStateLinks2));
        System.assert(pipelineExecutionStepStateLinks2.equals(pipelineExecutionStepStateLinks1));
        System.assert(pipelineExecutionStepStateLinks1.equals(pipelineExecutionStepStateLinks1));
        System.assert(pipelineExecutionStepStateLinks3.equals(pipelineExecutionStepStateLinks4));
        System.assert(pipelineExecutionStepStateLinks4.equals(pipelineExecutionStepStateLinks3));
        System.assert(pipelineExecutionStepStateLinks3.equals(pipelineExecutionStepStateLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks3 = new OASPipelineExecutionStepStateLinks();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks4 = new OASPipelineExecutionStepStateLinks();

        System.assert(pipelineExecutionStepStateLinks1.equals(pipelineExecutionStepStateLinks2));
        System.assert(pipelineExecutionStepStateLinks2.equals(pipelineExecutionStepStateLinks1));
        System.assert(pipelineExecutionStepStateLinks3.equals(pipelineExecutionStepStateLinks4));
        System.assert(pipelineExecutionStepStateLinks4.equals(pipelineExecutionStepStateLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = new OASPipelineExecutionStepStateLinks();

        System.assertEquals(false, pipelineExecutionStepStateLinks1.equals('foo'));
        System.assertEquals(false, pipelineExecutionStepStateLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = new OASPipelineExecutionStepStateLinks();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks3;

        System.assertEquals(false, pipelineExecutionStepStateLinks1.equals(pipelineExecutionStepStateLinks3));
        System.assertEquals(false, pipelineExecutionStepStateLinks2.equals(pipelineExecutionStepStateLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = new OASPipelineExecutionStepStateLinks();

        System.assertEquals(pipelineExecutionStepStateLinks1.hashCode(), pipelineExecutionStepStateLinks1.hashCode());
        System.assertEquals(pipelineExecutionStepStateLinks2.hashCode(), pipelineExecutionStepStateLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks1 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks2 = OASPipelineExecutionStepStateLinks.getExample();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks3 = new OASPipelineExecutionStepStateLinks();
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks4 = new OASPipelineExecutionStepStateLinks();

        System.assert(pipelineExecutionStepStateLinks1.equals(pipelineExecutionStepStateLinks2));
        System.assert(pipelineExecutionStepStateLinks3.equals(pipelineExecutionStepStateLinks4));
        System.assertEquals(pipelineExecutionStepStateLinks1.hashCode(), pipelineExecutionStepStateLinks2.hashCode());
        System.assertEquals(pipelineExecutionStepStateLinks3.hashCode(), pipelineExecutionStepStateLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPipelineExecutionStepStateLinks pipelineExecutionStepStateLinks = new OASPipelineExecutionStepStateLinks();
        Map<String, String> propertyMappings = pipelineExecutionStepStateLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelExecution', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/execution'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipeline', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipelineLogs', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline/logs'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipelineMetrics', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline/metrics'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipelineAdvance', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline/advance'));
        System.assertEquals('httpNsAdobeComAdobecloudRelPipelineCancel', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/pipeline/cancel'));
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
    }
}
