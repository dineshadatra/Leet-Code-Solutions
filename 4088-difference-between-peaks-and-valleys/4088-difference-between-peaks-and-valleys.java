class Solution {
    public int peakValleyDifference(int[] nums) {
        int peak_sum = 0;
        int valley_sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if((0<i&&i<n-1) && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                peak_sum += nums[i];
            }
            else if((0<i&&i<n-1) && nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                valley_sum += nums[i];
            }
        }
        return peak_sum-valley_sum;
    }
}