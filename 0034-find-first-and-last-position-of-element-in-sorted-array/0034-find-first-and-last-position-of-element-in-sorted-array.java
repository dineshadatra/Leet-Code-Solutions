class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<1){
            return new int[]{-1,-1};
        }
        int ind1 = BS(nums,target,true);
        int ind2 = BS(nums,target,false);
        return new int[]{ind1,ind2};
    }
    public int BS(int[] nums, int target, boolean isFirstValue){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isFirstValue){
                if(nums[mid]<target){
                    start = mid+1;
                }
                else if(nums[mid]>target){
                    end = mid-1;
                }
                else{
                    end = mid-1;
                    index = mid;
                }
            }
            else{
                if(nums[mid]<target){
                    start = mid+1;
                }
                else if(nums[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                    index = mid;
                }
            }
        }
        return index;
    }
}