@isTest
private class OASProgramListLinksTest {
    @isTest
    private static void equalsSameInstance() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = programListLinks1;
        OASProgramListLinks programListLinks3 = new OASProgramListLinks();
        OASProgramListLinks programListLinks4 = programListLinks3;

        System.assert(programListLinks1.equals(programListLinks2));
        System.assert(programListLinks2.equals(programListLinks1));
        System.assert(programListLinks1.equals(programListLinks1));
        System.assert(programListLinks3.equals(programListLinks4));
        System.assert(programListLinks4.equals(programListLinks3));
        System.assert(programListLinks3.equals(programListLinks3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks3 = new OASProgramListLinks();
        OASProgramListLinks programListLinks4 = new OASProgramListLinks();

        System.assert(programListLinks1.equals(programListLinks2));
        System.assert(programListLinks2.equals(programListLinks1));
        System.assert(programListLinks3.equals(programListLinks4));
        System.assert(programListLinks4.equals(programListLinks3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = new OASProgramListLinks();

        System.assertEquals(false, programListLinks1.equals('foo'));
        System.assertEquals(false, programListLinks2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = new OASProgramListLinks();
        OASProgramListLinks programListLinks3;

        System.assertEquals(false, programListLinks1.equals(programListLinks3));
        System.assertEquals(false, programListLinks2.equals(programListLinks3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = new OASProgramListLinks();

        System.assertEquals(programListLinks1.hashCode(), programListLinks1.hashCode());
        System.assertEquals(programListLinks2.hashCode(), programListLinks2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProgramListLinks programListLinks1 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks2 = OASProgramListLinks.getExample();
        OASProgramListLinks programListLinks3 = new OASProgramListLinks();
        OASProgramListLinks programListLinks4 = new OASProgramListLinks();

        System.assert(programListLinks1.equals(programListLinks2));
        System.assert(programListLinks3.equals(programListLinks4));
        System.assertEquals(programListLinks1.hashCode(), programListLinks2.hashCode());
        System.assertEquals(programListLinks3.hashCode(), programListLinks4.hashCode());
    }
}
