@isTest
private class OASEmbeddedProgramTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = embeddedProgram1;
        OASEmbeddedProgram embeddedProgram3 = new OASEmbeddedProgram();
        OASEmbeddedProgram embeddedProgram4 = embeddedProgram3;

        System.assert(embeddedProgram1.equals(embeddedProgram2));
        System.assert(embeddedProgram2.equals(embeddedProgram1));
        System.assert(embeddedProgram1.equals(embeddedProgram1));
        System.assert(embeddedProgram3.equals(embeddedProgram4));
        System.assert(embeddedProgram4.equals(embeddedProgram3));
        System.assert(embeddedProgram3.equals(embeddedProgram3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram3 = new OASEmbeddedProgram();
        OASEmbeddedProgram embeddedProgram4 = new OASEmbeddedProgram();

        System.assert(embeddedProgram1.equals(embeddedProgram2));
        System.assert(embeddedProgram2.equals(embeddedProgram1));
        System.assert(embeddedProgram3.equals(embeddedProgram4));
        System.assert(embeddedProgram4.equals(embeddedProgram3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = new OASEmbeddedProgram();

        System.assertEquals(false, embeddedProgram1.equals('foo'));
        System.assertEquals(false, embeddedProgram2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = new OASEmbeddedProgram();
        OASEmbeddedProgram embeddedProgram3;

        System.assertEquals(false, embeddedProgram1.equals(embeddedProgram3));
        System.assertEquals(false, embeddedProgram2.equals(embeddedProgram3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = new OASEmbeddedProgram();

        System.assertEquals(embeddedProgram1.hashCode(), embeddedProgram1.hashCode());
        System.assertEquals(embeddedProgram2.hashCode(), embeddedProgram2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmbeddedProgram embeddedProgram1 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram2 = OASEmbeddedProgram.getExample();
        OASEmbeddedProgram embeddedProgram3 = new OASEmbeddedProgram();
        OASEmbeddedProgram embeddedProgram4 = new OASEmbeddedProgram();

        System.assert(embeddedProgram1.equals(embeddedProgram2));
        System.assert(embeddedProgram3.equals(embeddedProgram4));
        System.assertEquals(embeddedProgram1.hashCode(), embeddedProgram2.hashCode());
        System.assertEquals(embeddedProgram3.hashCode(), embeddedProgram4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEmbeddedProgram embeddedProgram = new OASEmbeddedProgram();
        System.assertEquals(false, embeddedProgram.enabled);
        System.assertEquals(null, embeddedProgram.id);
        System.assertEquals(null, embeddedProgram.name);
        System.assertEquals(null, embeddedProgram.tenantId);
    }
}
