@isTest
private class OASRepositoryListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = repositoryListEmbedded1;
        OASRepositoryListEmbedded repositoryListEmbedded3 = new OASRepositoryListEmbedded();
        OASRepositoryListEmbedded repositoryListEmbedded4 = repositoryListEmbedded3;

        System.assert(repositoryListEmbedded1.equals(repositoryListEmbedded2));
        System.assert(repositoryListEmbedded2.equals(repositoryListEmbedded1));
        System.assert(repositoryListEmbedded1.equals(repositoryListEmbedded1));
        System.assert(repositoryListEmbedded3.equals(repositoryListEmbedded4));
        System.assert(repositoryListEmbedded4.equals(repositoryListEmbedded3));
        System.assert(repositoryListEmbedded3.equals(repositoryListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded3 = new OASRepositoryListEmbedded();
        OASRepositoryListEmbedded repositoryListEmbedded4 = new OASRepositoryListEmbedded();

        System.assert(repositoryListEmbedded1.equals(repositoryListEmbedded2));
        System.assert(repositoryListEmbedded2.equals(repositoryListEmbedded1));
        System.assert(repositoryListEmbedded3.equals(repositoryListEmbedded4));
        System.assert(repositoryListEmbedded4.equals(repositoryListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = new OASRepositoryListEmbedded();

        System.assertEquals(false, repositoryListEmbedded1.equals('foo'));
        System.assertEquals(false, repositoryListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = new OASRepositoryListEmbedded();
        OASRepositoryListEmbedded repositoryListEmbedded3;

        System.assertEquals(false, repositoryListEmbedded1.equals(repositoryListEmbedded3));
        System.assertEquals(false, repositoryListEmbedded2.equals(repositoryListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = new OASRepositoryListEmbedded();

        System.assertEquals(repositoryListEmbedded1.hashCode(), repositoryListEmbedded1.hashCode());
        System.assertEquals(repositoryListEmbedded2.hashCode(), repositoryListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepositoryListEmbedded repositoryListEmbedded1 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded2 = OASRepositoryListEmbedded.getExample();
        OASRepositoryListEmbedded repositoryListEmbedded3 = new OASRepositoryListEmbedded();
        OASRepositoryListEmbedded repositoryListEmbedded4 = new OASRepositoryListEmbedded();

        System.assert(repositoryListEmbedded1.equals(repositoryListEmbedded2));
        System.assert(repositoryListEmbedded3.equals(repositoryListEmbedded4));
        System.assertEquals(repositoryListEmbedded1.hashCode(), repositoryListEmbedded2.hashCode());
        System.assertEquals(repositoryListEmbedded3.hashCode(), repositoryListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRepositoryListEmbedded repositoryListEmbedded = new OASRepositoryListEmbedded();
        System.assertEquals(new List<OASRepository>(), repositoryListEmbedded.repositories);
    }
}
