@isTest
private class OASVariableListLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = variableListLinks1;
        OASVariableListLinks variableListLinks3 = new OASVariableListLinks();
        OASVariableListLinks variableListLinks4 = variableListLinks3;

        System.assert(variableListLinks1.equals(variableListLinks2));
        System.assert(variableListLinks2.equals(variableListLinks1));
        System.assert(variableListLinks1.equals(variableListLinks1));
        System.assert(variableListLinks3.equals(variableListLinks4));
        System.assert(variableListLinks4.equals(variableListLinks3));
        System.assert(variableListLinks3.equals(variableListLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks3 = new OASVariableListLinks();
        OASVariableListLinks variableListLinks4 = new OASVariableListLinks();

        System.assert(variableListLinks1.equals(variableListLinks2));
        System.assert(variableListLinks2.equals(variableListLinks1));
        System.assert(variableListLinks3.equals(variableListLinks4));
        System.assert(variableListLinks4.equals(variableListLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = new OASVariableListLinks();

        System.assertEquals(false, variableListLinks1.equals('foo'));
        System.assertEquals(false, variableListLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = new OASVariableListLinks();
        OASVariableListLinks variableListLinks3;

        System.assertEquals(false, variableListLinks1.equals(variableListLinks3));
        System.assertEquals(false, variableListLinks2.equals(variableListLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = new OASVariableListLinks();

        System.assertEquals(variableListLinks1.hashCode(), variableListLinks1.hashCode());
        System.assertEquals(variableListLinks2.hashCode(), variableListLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVariableListLinks variableListLinks1 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks2 = OASVariableListLinks.getExample();
        OASVariableListLinks variableListLinks3 = new OASVariableListLinks();
        OASVariableListLinks variableListLinks4 = new OASVariableListLinks();

        System.assert(variableListLinks1.equals(variableListLinks2));
        System.assert(variableListLinks3.equals(variableListLinks4));
        System.assertEquals(variableListLinks1.hashCode(), variableListLinks2.hashCode());
        System.assertEquals(variableListLinks3.hashCode(), variableListLinks4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVariableListLinks variableListLinks = new OASVariableListLinks();
        Map<String, String> propertyMappings = variableListLinks.getPropertyMappings();
        System.assertEquals('httpNsAdobeComAdobecloudRelEnvironment', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/environment'));
        System.assertEquals('httpNsAdobeComAdobecloudRelProgram', propertyMappings.get('http://ns.adobe.com/adobecloud/rel/program'));
    }
}
