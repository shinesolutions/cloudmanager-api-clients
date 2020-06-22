@isTest
private class OASVariableTest {
    @isTest
    private static void equalsSameInstance() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = variable1;
        OASVariable variable3 = new OASVariable();
        OASVariable variable4 = variable3;

        System.assert(variable1.equals(variable2));
        System.assert(variable2.equals(variable1));
        System.assert(variable1.equals(variable1));
        System.assert(variable3.equals(variable4));
        System.assert(variable4.equals(variable3));
        System.assert(variable3.equals(variable3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = OASVariable.getExample();
        OASVariable variable3 = new OASVariable();
        OASVariable variable4 = new OASVariable();

        System.assert(variable1.equals(variable2));
        System.assert(variable2.equals(variable1));
        System.assert(variable3.equals(variable4));
        System.assert(variable4.equals(variable3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = new OASVariable();

        System.assertEquals(false, variable1.equals('foo'));
        System.assertEquals(false, variable2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = new OASVariable();
        OASVariable variable3;

        System.assertEquals(false, variable1.equals(variable3));
        System.assertEquals(false, variable2.equals(variable3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = new OASVariable();

        System.assertEquals(variable1.hashCode(), variable1.hashCode());
        System.assertEquals(variable2.hashCode(), variable2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVariable variable1 = OASVariable.getExample();
        OASVariable variable2 = OASVariable.getExample();
        OASVariable variable3 = new OASVariable();
        OASVariable variable4 = new OASVariable();

        System.assert(variable1.equals(variable2));
        System.assert(variable3.equals(variable4));
        System.assertEquals(variable1.hashCode(), variable2.hashCode());
        System.assertEquals(variable3.hashCode(), variable4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVariable variable = new OASVariable();
        Map<String, String> propertyMappings = variable.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
