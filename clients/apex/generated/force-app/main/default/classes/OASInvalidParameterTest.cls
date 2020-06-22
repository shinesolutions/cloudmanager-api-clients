@isTest
private class OASInvalidParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = invalidParameter1;
        OASInvalidParameter invalidParameter3 = new OASInvalidParameter();
        OASInvalidParameter invalidParameter4 = invalidParameter3;

        System.assert(invalidParameter1.equals(invalidParameter2));
        System.assert(invalidParameter2.equals(invalidParameter1));
        System.assert(invalidParameter1.equals(invalidParameter1));
        System.assert(invalidParameter3.equals(invalidParameter4));
        System.assert(invalidParameter4.equals(invalidParameter3));
        System.assert(invalidParameter3.equals(invalidParameter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter3 = new OASInvalidParameter();
        OASInvalidParameter invalidParameter4 = new OASInvalidParameter();

        System.assert(invalidParameter1.equals(invalidParameter2));
        System.assert(invalidParameter2.equals(invalidParameter1));
        System.assert(invalidParameter3.equals(invalidParameter4));
        System.assert(invalidParameter4.equals(invalidParameter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = new OASInvalidParameter();

        System.assertEquals(false, invalidParameter1.equals('foo'));
        System.assertEquals(false, invalidParameter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = new OASInvalidParameter();
        OASInvalidParameter invalidParameter3;

        System.assertEquals(false, invalidParameter1.equals(invalidParameter3));
        System.assertEquals(false, invalidParameter2.equals(invalidParameter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = new OASInvalidParameter();

        System.assertEquals(invalidParameter1.hashCode(), invalidParameter1.hashCode());
        System.assertEquals(invalidParameter2.hashCode(), invalidParameter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInvalidParameter invalidParameter1 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter2 = OASInvalidParameter.getExample();
        OASInvalidParameter invalidParameter3 = new OASInvalidParameter();
        OASInvalidParameter invalidParameter4 = new OASInvalidParameter();

        System.assert(invalidParameter1.equals(invalidParameter2));
        System.assert(invalidParameter3.equals(invalidParameter4));
        System.assertEquals(invalidParameter1.hashCode(), invalidParameter2.hashCode());
        System.assertEquals(invalidParameter3.hashCode(), invalidParameter4.hashCode());
    }
}
