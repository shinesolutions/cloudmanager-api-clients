@isTest
private class OASHalLinkTest {
    @isTest
    private static void equalsSameInstance() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = halLink1;
        OASHalLink halLink3 = new OASHalLink();
        OASHalLink halLink4 = halLink3;

        System.assert(halLink1.equals(halLink2));
        System.assert(halLink2.equals(halLink1));
        System.assert(halLink1.equals(halLink1));
        System.assert(halLink3.equals(halLink4));
        System.assert(halLink4.equals(halLink3));
        System.assert(halLink3.equals(halLink3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = OASHalLink.getExample();
        OASHalLink halLink3 = new OASHalLink();
        OASHalLink halLink4 = new OASHalLink();

        System.assert(halLink1.equals(halLink2));
        System.assert(halLink2.equals(halLink1));
        System.assert(halLink3.equals(halLink4));
        System.assert(halLink4.equals(halLink3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = new OASHalLink();

        System.assertEquals(false, halLink1.equals('foo'));
        System.assertEquals(false, halLink2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = new OASHalLink();
        OASHalLink halLink3;

        System.assertEquals(false, halLink1.equals(halLink3));
        System.assertEquals(false, halLink2.equals(halLink3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = new OASHalLink();

        System.assertEquals(halLink1.hashCode(), halLink1.hashCode());
        System.assertEquals(halLink2.hashCode(), halLink2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHalLink halLink1 = OASHalLink.getExample();
        OASHalLink halLink2 = OASHalLink.getExample();
        OASHalLink halLink3 = new OASHalLink();
        OASHalLink halLink4 = new OASHalLink();

        System.assert(halLink1.equals(halLink2));
        System.assert(halLink3.equals(halLink4));
        System.assertEquals(halLink1.hashCode(), halLink2.hashCode());
        System.assertEquals(halLink3.hashCode(), halLink4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASHalLink halLink = new OASHalLink();
        Map<String, String> propertyMappings = halLink.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHalLink halLink = new OASHalLink();
        System.assertEquals(false, halLink.templated);
        System.assertEquals(null, halLink.href);
        System.assertEquals(null, halLink.r_type);
        System.assertEquals(null, halLink.deprecation);
        System.assertEquals(null, halLink.profile);
        System.assertEquals(null, halLink.title);
        System.assertEquals(null, halLink.hreflang);
        System.assertEquals(null, halLink.name);
    }
}
