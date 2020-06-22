@isTest
private class OASRepositoryTest {
    @isTest
    private static void equalsSameInstance() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = repository1;
        OASRepository repository3 = new OASRepository();
        OASRepository repository4 = repository3;

        System.assert(repository1.equals(repository2));
        System.assert(repository2.equals(repository1));
        System.assert(repository1.equals(repository1));
        System.assert(repository3.equals(repository4));
        System.assert(repository4.equals(repository3));
        System.assert(repository3.equals(repository3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = OASRepository.getExample();
        OASRepository repository3 = new OASRepository();
        OASRepository repository4 = new OASRepository();

        System.assert(repository1.equals(repository2));
        System.assert(repository2.equals(repository1));
        System.assert(repository3.equals(repository4));
        System.assert(repository4.equals(repository3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = new OASRepository();

        System.assertEquals(false, repository1.equals('foo'));
        System.assertEquals(false, repository2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = new OASRepository();
        OASRepository repository3;

        System.assertEquals(false, repository1.equals(repository3));
        System.assertEquals(false, repository2.equals(repository3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = new OASRepository();

        System.assertEquals(repository1.hashCode(), repository1.hashCode());
        System.assertEquals(repository2.hashCode(), repository2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRepository repository1 = OASRepository.getExample();
        OASRepository repository2 = OASRepository.getExample();
        OASRepository repository3 = new OASRepository();
        OASRepository repository4 = new OASRepository();

        System.assert(repository1.equals(repository2));
        System.assert(repository3.equals(repository4));
        System.assertEquals(repository1.hashCode(), repository2.hashCode());
        System.assertEquals(repository3.hashCode(), repository4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRepository repository = new OASRepository();
        Map<String, String> propertyMappings = repository.getPropertyMappings();
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
