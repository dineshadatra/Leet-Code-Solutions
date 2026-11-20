class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int transfers = Math.min(additionalTank,(mainTank-1)/4);
        return (mainTank+transfers)*10;
    }
}