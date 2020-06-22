@isTest
private class OASEnvironmentLogTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = environmentLog1;
        OASEnvironmentLog environmentLog3 = new OASEnvironmentLog();
        OASEnvironmentLog environmentLog4 = environmentLog3;

        System.assert(environmentLog1.equals(environmentLog2));
        System.assert(environmentLog2.equals(environmentLog1));
        System.assert(environmentLog1.equals(environmentLog1));
        System.assert(environmentLog3.equals(environmentLog4));
        System.assert(environmentLog4.equals(environmentLog3));
        System.assert(environmentLog3.equals(environmentLog3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog3 = new OASEnvironmentLog();
        OASEnvironmentLog environmentLog4 = new OASEnvironmentLog();

        System.assert(environmentLog1.equals(environmentLog2));
        System.assert(environmentLog2.equals(environmentLog1));
        System.assert(environmentLog3.equals(environmentLog4));
        System.assert(environmentLog4.equals(environmentLog3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = new OASEnvironmentLog();

        System.assertEquals(false, environmentLog1.equals('foo'));
        System.assertEquals(false, environmentLog2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = new OASEnvironmentLog();
        OASEnvironmentLog environmentLog3;

        System.assertEquals(false, environmentLog1.equals(environmentLog3));
        System.assertEquals(false, environmentLog2.equals(environmentLog3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = new OASEnvironmentLog();

        System.assertEquals(environmentLog1.hashCode(), environmentLog1.hashCode());
        System.assertEquals(environmentLog2.hashCode(), environmentLog2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLog environmentLog1 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog2 = OASEnvironmentLog.getExample();
        OASEnvironmentLog environmentLog3 = new OASEnvironmentLog();
        OASEnvironmentLog environmentLog4 = new OASEnvironmentLog();

        System.assert(environmentLog1.equals(environmentLog2));
        System.assert(environmentLog3.equals(environmentLog4));
        System.assertEquals(environmentLog1.hashCode(), environmentLog2.hashCode());
        System.assertEquals(environmentLog3.hashCode(), environmentLog4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentLog environmentLog = new OASEnvironmentLog();
        Map<String, String> propertyMappings = environmentLog.getPropertyMappings();
        System.assertEquals('r_date', propertyMappings.get('date'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
