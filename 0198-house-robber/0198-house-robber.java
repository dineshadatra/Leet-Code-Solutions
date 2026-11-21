class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int cur = 0;
        int temp = 0;
        for(int i:nums){
            temp = cur;
            cur = Math.max(cur,i+prev);
            prev = temp;
        }
        return cur;
    }
}