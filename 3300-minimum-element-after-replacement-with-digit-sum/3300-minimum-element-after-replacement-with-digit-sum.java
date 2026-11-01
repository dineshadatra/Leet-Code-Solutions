class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = DigitSum(nums[i]);
        }
        int res = nums[0];
        for(int j=0;j<nums.length;j++){
            if(res > nums[j]){
                res = nums[j];
            }
        }
        return res;
    }
    public int DigitSum(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
}