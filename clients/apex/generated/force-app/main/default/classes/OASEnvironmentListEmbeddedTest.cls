@isTest
private class OASEnvironmentListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = environmentListEmbedded1;
        OASEnvironmentListEmbedded environmentListEmbedded3 = new OASEnvironmentListEmbedded();
        OASEnvironmentListEmbedded environmentListEmbedded4 = environmentListEmbedded3;

        System.assert(environmentListEmbedded1.equals(environmentListEmbedded2));
        System.assert(environmentListEmbedded2.equals(environmentListEmbedded1));
        System.assert(environmentListEmbedded1.equals(environmentListEmbedded1));
        System.assert(environmentListEmbedded3.equals(environmentListEmbedded4));
        System.assert(environmentListEmbedded4.equals(environmentListEmbedded3));
        System.assert(environmentListEmbedded3.equals(environmentListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded3 = new OASEnvironmentListEmbedded();
        OASEnvironmentListEmbedded environmentListEmbedded4 = new OASEnvironmentListEmbedded();

        System.assert(environmentListEmbedded1.equals(environmentListEmbedded2));
        System.assert(environmentListEmbedded2.equals(environmentListEmbedded1));
        System.assert(environmentListEmbedded3.equals(environmentListEmbedded4));
        System.assert(environmentListEmbedded4.equals(environmentListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = new OASEnvironmentListEmbedded();

        System.assertEquals(false, environmentListEmbedded1.equals('foo'));
        System.assertEquals(false, environmentListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = new OASEnvironmentListEmbedded();
        OASEnvironmentListEmbedded environmentListEmbedded3;

        System.assertEquals(false, environmentListEmbedded1.equals(environmentListEmbedded3));
        System.assertEquals(false, environmentListEmbedded2.equals(environmentListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = new OASEnvironmentListEmbedded();

        System.assertEquals(environmentListEmbedded1.hashCode(), environmentListEmbedded1.hashCode());
        System.assertEquals(environmentListEmbedded2.hashCode(), environmentListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironmentListEmbedded environmentListEmbedded1 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded2 = OASEnvironmentListEmbedded.getExample();
        OASEnvironmentListEmbedded environmentListEmbedded3 = new OASEnvironmentListEmbedded();
        OASEnvironmentListEmbedded environmentListEmbedded4 = new OASEnvironmentListEmbedded();

        System.assert(environmentListEmbedded1.equals(environmentListEmbedded2));
        System.assert(environmentListEmbedded3.equals(environmentListEmbedded4));
        System.assertEquals(environmentListEmbedded1.hashCode(), environmentListEmbedded2.hashCode());
        System.assertEquals(environmentListEmbedded3.hashCode(), environmentListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnvironmentListEmbedded environmentListEmbedded = new OASEnvironmentListEmbedded();
        System.assertEquals(new List<OASEnvironment>(), environmentListEmbedded.environments);
    }
}
