class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] res = new int[101];
        for(int i:nums){
            res[i]++;
        }
        for(int j=0;j<res.length;j++){
            if(res[j]==1){
                sum+=j;
            }
        }
        return sum;
    }
}