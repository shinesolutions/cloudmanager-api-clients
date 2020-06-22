@isTest
private class OASEnvironmentLogsEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = environmentLogsEmbedded1;
        OASEnvironmentLogsEmbedded environmentLogsEmbedded3 = new OASEnvironmentLogsEmbedded();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded4 = environmentLogsEmbedded3;

        System.assert(environmentLogsEmbedded1.equals(environmentLogsEmbedded2));
        System.assert(environmentLogsEmbedded2.equals(environmentLogsEmbedded1));
        System.assert(environmentLogsEmbedded1.equals(environmentLogsEmbedded1));
        System.assert(environmentLogsEmbedded3.equals(environmentLogsEmbedded4));
        System.assert(environmentLogsEmbedded4.equals(environmentLogsEmbedded3));
        System.assert(environmentLogsEmbedded3.equals(environmentLogsEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded3 = new OASEnvironmentLogsEmbedded();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded4 = new OASEnvironmentLogsEmbedded();

        System.assert(environmentLogsEmbedded1.equals(environmentLogsEmbedded2));
        System.assert(environmentLogsEmbedded2.equals(environmentLogsEmbedded1));
        System.assert(environmentLogsEmbedded3.equals(environmentLogsEmbedded4));
        System.assert(environmentLogsEmbedded4.equals(environmentLogsEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = new OASEnvironmentLogsEmbedded();

        System.assertEquals(false, environmentLogsEmbedded1.equals('foo'));
        System.assertEquals(false, environmentLogsEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = new OASEnvironmentLogsEmbedded();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded3;

        System.assertEquals(false, environmentLogsEmbedded1.equals(environmentLogsEmbedded3));
        System.assertEquals(false, environmentLogsEmbedded2.equals(environmentLogsEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = new OASEnvironmentLogsEmbedded();

        System.assertEquals(environmentLogsEmbedded1.hashCode(), environmentLogsEmbedded1.hashCode());
        System.assertEquals(environmentLogsEmbedded2.hashCode(), environmentLogsEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded1 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded2 = OASEnvironmentLogsEmbedded.getExample();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded3 = new OASEnvironmentLogsEmbedded();
        OASEnvironmentLogsEmbedded environmentLogsEmbedded4 = new OASEnvironmentLogsEmbedded();

        System.assert(environmentLogsEmbedded1.equals(environmentLogsEmbedded2));
        System.assert(environmentLogsEmbedded3.equals(environmentLogsEmbedded4));
        System.assertEquals(environmentLogsEmbedded1.hashCode(), environmentLogsEmbedded2.hashCode());
        System.assertEquals(environmentLogsEmbedded3.hashCode(), environmentLogsEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnvironmentLogsEmbedded environmentLogsEmbedded = new OASEnvironmentLogsEmbedded();
        System.assertEquals(new List<OASEnvironmentLog>(), environmentLogsEmbedded.downloads);
    }
}
