@isTest
private class OASBranchListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = branchListEmbedded1;
        OASBranchListEmbedded branchListEmbedded3 = new OASBranchListEmbedded();
        OASBranchListEmbedded branchListEmbedded4 = branchListEmbedded3;

        System.assert(branchListEmbedded1.equals(branchListEmbedded2));
        System.assert(branchListEmbedded2.equals(branchListEmbedded1));
        System.assert(branchListEmbedded1.equals(branchListEmbedded1));
        System.assert(branchListEmbedded3.equals(branchListEmbedded4));
        System.assert(branchListEmbedded4.equals(branchListEmbedded3));
        System.assert(branchListEmbedded3.equals(branchListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded3 = new OASBranchListEmbedded();
        OASBranchListEmbedded branchListEmbedded4 = new OASBranchListEmbedded();

        System.assert(branchListEmbedded1.equals(branchListEmbedded2));
        System.assert(branchListEmbedded2.equals(branchListEmbedded1));
        System.assert(branchListEmbedded3.equals(branchListEmbedded4));
        System.assert(branchListEmbedded4.equals(branchListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = new OASBranchListEmbedded();

        System.assertEquals(false, branchListEmbedded1.equals('foo'));
        System.assertEquals(false, branchListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = new OASBranchListEmbedded();
        OASBranchListEmbedded branchListEmbedded3;

        System.assertEquals(false, branchListEmbedded1.equals(branchListEmbedded3));
        System.assertEquals(false, branchListEmbedded2.equals(branchListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = new OASBranchListEmbedded();

        System.assertEquals(branchListEmbedded1.hashCode(), branchListEmbedded1.hashCode());
        System.assertEquals(branchListEmbedded2.hashCode(), branchListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBranchListEmbedded branchListEmbedded1 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded2 = OASBranchListEmbedded.getExample();
        OASBranchListEmbedded branchListEmbedded3 = new OASBranchListEmbedded();
        OASBranchListEmbedded branchListEmbedded4 = new OASBranchListEmbedded();

        System.assert(branchListEmbedded1.equals(branchListEmbedded2));
        System.assert(branchListEmbedded3.equals(branchListEmbedded4));
        System.assertEquals(branchListEmbedded1.hashCode(), branchListEmbedded2.hashCode());
        System.assertEquals(branchListEmbedded3.hashCode(), branchListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBranchListEmbedded branchListEmbedded = new OASBranchListEmbedded();
        System.assertEquals(new List<OASRepositoryBranch>(), branchListEmbedded.branches);
    }
}
