@isTest
private class OASEnvironmentLogsTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = environmentLogs1;
        OASEnvironmentLogs environmentLogs3 = new OASEnvironmentLogs();
        OASEnvironmentLogs environmentLogs4 = environmentLogs3;

        System.assert(environmentLogs1.equals(environmentLogs2));
        System.assert(environmentLogs2.equals(environmentLogs1));
        System.assert(environmentLogs1.equals(environmentLogs1));
        System.assert(environmentLogs3.equals(environmentLogs4));
        System.assert(environmentLogs4.equals(environmentLogs3));
        System.assert(environmentLogs3.equals(environmentLogs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs3 = new OASEnvironmentLogs();
        OASEnvironmentLogs environmentLogs4 = new OASEnvironmentLogs();

        System.assert(environmentLogs1.equals(environmentLogs2));
        System.assert(environmentLogs2.equals(environmentLogs1));
        System.assert(environmentLogs3.equals(environmentLogs4));
        System.assert(environmentLogs4.equals(environmentLogs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = new OASEnvironmentLogs();

        System.assertEquals(false, environmentLogs1.equals('foo'));
        System.assertEquals(false, environmentLogs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = new OASEnvironmentLogs();
        OASEnvironmentLogs environmentLogs3;

        System.assertEquals(false, environmentLogs1.equals(environmentLogs3));
        System.assertEquals(false, environmentLogs2.equals(environmentLogs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = new OASEnvironmentLogs();

        System.assertEquals(environmentLogs1.hashCode(), environmentLogs1.hashCode());
        System.assertEquals(environmentLogs2.hashCode(), environmentLogs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLogs environmentLogs1 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs2 = OASEnvironmentLogs.getExample();
        OASEnvironmentLogs environmentLogs3 = new OASEnvironmentLogs();
        OASEnvironmentLogs environmentLogs4 = new OASEnvironmentLogs();

        System.assert(environmentLogs1.equals(environmentLogs2));
        System.assert(environmentLogs3.equals(environmentLogs4));
        System.assertEquals(environmentLogs1.hashCode(), environmentLogs2.hashCode());
        System.assertEquals(environmentLogs3.hashCode(), environmentLogs4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironmentLogs environmentLogs = new OASEnvironmentLogs();
        Map<String, String> propertyMappings = environmentLogs.getPropertyMappings();
        System.assertEquals('links', propertyMappings.get('_links'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnvironmentLogs environmentLogs = new OASEnvironmentLogs();
        System.assertEquals(new List<String>(), environmentLogs.service);
        System.assertEquals(new List<String>(), environmentLogs.name);
        System.assertEquals(null, environmentLogs.days);
        System.assertEquals(null, environmentLogs.links);
        System.assertEquals(null, environmentLogs.embedded);
    }
}
