@isTest
private class OASProgramListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = programListEmbedded1;
        OASProgramListEmbedded programListEmbedded3 = new OASProgramListEmbedded();
        OASProgramListEmbedded programListEmbedded4 = programListEmbedded3;

        System.assert(programListEmbedded1.equals(programListEmbedded2));
        System.assert(programListEmbedded2.equals(programListEmbedded1));
        System.assert(programListEmbedded1.equals(programListEmbedded1));
        System.assert(programListEmbedded3.equals(programListEmbedded4));
        System.assert(programListEmbedded4.equals(programListEmbedded3));
        System.assert(programListEmbedded3.equals(programListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded3 = new OASProgramListEmbedded();
        OASProgramListEmbedded programListEmbedded4 = new OASProgramListEmbedded();

        System.assert(programListEmbedded1.equals(programListEmbedded2));
        System.assert(programListEmbedded2.equals(programListEmbedded1));
        System.assert(programListEmbedded3.equals(programListEmbedded4));
        System.assert(programListEmbedded4.equals(programListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = new OASProgramListEmbedded();

        System.assertEquals(false, programListEmbedded1.equals('foo'));
        System.assertEquals(false, programListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = new OASProgramListEmbedded();
        OASProgramListEmbedded programListEmbedded3;

        System.assertEquals(false, programListEmbedded1.equals(programListEmbedded3));
        System.assertEquals(false, programListEmbedded2.equals(programListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = new OASProgramListEmbedded();

        System.assertEquals(programListEmbedded1.hashCode(), programListEmbedded1.hashCode());
        System.assertEquals(programListEmbedded2.hashCode(), programListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProgramListEmbedded programListEmbedded1 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded2 = OASProgramListEmbedded.getExample();
        OASProgramListEmbedded programListEmbedded3 = new OASProgramListEmbedded();
        OASProgramListEmbedded programListEmbedded4 = new OASProgramListEmbedded();

        System.assert(programListEmbedded1.equals(programListEmbedded2));
        System.assert(programListEmbedded3.equals(programListEmbedded4));
        System.assertEquals(programListEmbedded1.hashCode(), programListEmbedded2.hashCode());
        System.assertEquals(programListEmbedded3.hashCode(), programListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProgramListEmbedded programListEmbedded = new OASProgramListEmbedded();
        System.assertEquals(new List<OASEmbeddedProgram>(), programListEmbedded.programs);
    }
}
