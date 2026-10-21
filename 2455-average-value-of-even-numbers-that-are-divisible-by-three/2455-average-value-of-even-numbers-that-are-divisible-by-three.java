class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int num:nums){
            if(num%2==0 && num%3==0){
                count += 1;
                sum += num;
            }
        }
        if(count>0){
            return (int)sum/count;
        }
        else{
            return 0;
        }
    }
}