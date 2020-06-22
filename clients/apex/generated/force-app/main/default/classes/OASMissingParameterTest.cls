@isTest
private class OASMissingParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = missingParameter1;
        OASMissingParameter missingParameter3 = new OASMissingParameter();
        OASMissingParameter missingParameter4 = missingParameter3;

        System.assert(missingParameter1.equals(missingParameter2));
        System.assert(missingParameter2.equals(missingParameter1));
        System.assert(missingParameter1.equals(missingParameter1));
        System.assert(missingParameter3.equals(missingParameter4));
        System.assert(missingParameter4.equals(missingParameter3));
        System.assert(missingParameter3.equals(missingParameter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter3 = new OASMissingParameter();
        OASMissingParameter missingParameter4 = new OASMissingParameter();

        System.assert(missingParameter1.equals(missingParameter2));
        System.assert(missingParameter2.equals(missingParameter1));
        System.assert(missingParameter3.equals(missingParameter4));
        System.assert(missingParameter4.equals(missingParameter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = new OASMissingParameter();

        System.assertEquals(false, missingParameter1.equals('foo'));
        System.assertEquals(false, missingParameter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = new OASMissingParameter();
        OASMissingParameter missingParameter3;

        System.assertEquals(false, missingParameter1.equals(missingParameter3));
        System.assertEquals(false, missingParameter2.equals(missingParameter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = new OASMissingParameter();

        System.assertEquals(missingParameter1.hashCode(), missingParameter1.hashCode());
        System.assertEquals(missingParameter2.hashCode(), missingParameter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMissingParameter missingParameter1 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter2 = OASMissingParameter.getExample();
        OASMissingParameter missingParameter3 = new OASMissingParameter();
        OASMissingParameter missingParameter4 = new OASMissingParameter();

        System.assert(missingParameter1.equals(missingParameter2));
        System.assert(missingParameter3.equals(missingParameter4));
        System.assertEquals(missingParameter1.hashCode(), missingParameter2.hashCode());
        System.assertEquals(missingParameter3.hashCode(), missingParameter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMissingParameter missingParameter = new OASMissingParameter();
        Map<String, String> propertyMappings = missingParameter.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
