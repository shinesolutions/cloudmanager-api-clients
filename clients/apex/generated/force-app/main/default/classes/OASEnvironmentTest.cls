@isTest
private class OASEnvironmentTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = environment1;
        OASEnvironment environment3 = new OASEnvironment();
        OASEnvironment environment4 = environment3;

        System.assert(environment1.equals(environment2));
        System.assert(environment2.equals(environment1));
        System.assert(environment1.equals(environment1));
        System.assert(environment3.equals(environment4));
        System.assert(environment4.equals(environment3));
        System.assert(environment3.equals(environment3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = OASEnvironment.getExample();
        OASEnvironment environment3 = new OASEnvironment();
        OASEnvironment environment4 = new OASEnvironment();

        System.assert(environment1.equals(environment2));
        System.assert(environment2.equals(environment1));
        System.assert(environment3.equals(environment4));
        System.assert(environment4.equals(environment3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = new OASEnvironment();

        System.assertEquals(false, environment1.equals('foo'));
        System.assertEquals(false, environment2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = new OASEnvironment();
        OASEnvironment environment3;

        System.assertEquals(false, environment1.equals(environment3));
        System.assertEquals(false, environment2.equals(environment3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = new OASEnvironment();

        System.assertEquals(environment1.hashCode(), environment1.hashCode());
        System.assertEquals(environment2.hashCode(), environment2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnvironment environment1 = OASEnvironment.getExample();
        OASEnvironment environment2 = OASEnvironment.getExample();
        OASEnvironment environment3 = new OASEnvironment();
        OASEnvironment environment4 = new OASEnvironment();

        System.assert(environment1.equals(environment2));
        System.assert(environment3.equals(environment4));
        System.assertEquals(environment1.hashCode(), environment2.hashCode());
        System.assertEquals(environment3.hashCode(), environment4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEnvironment environment = new OASEnvironment();
        Map<String, String> propertyMappings = environment.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
