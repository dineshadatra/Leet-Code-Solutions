class Solution {
    public int numIdenticalPairs(int[] nums) {
        int gp = 0;
        int[] count = new int[101];
        for(int n:nums){
            count[n]++;
        }
        for(int m:count){
            gp += (m*(m-1))/2;
        }
        return gp;
    }
}