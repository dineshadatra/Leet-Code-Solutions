class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        if(start==0 || target<nums[0]){
            return Binary_Search(nums,start,nums.length-1,target);
        }
        else{
            return Binary_Search(nums,0,start-1,target);
        }
    }
    public int Binary_Search(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}