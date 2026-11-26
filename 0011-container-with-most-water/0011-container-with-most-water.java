class Solution {
    public int maxArea(int[] height) {
        int best = 0;
        int left = 0;
        int right = height.length-1;

        for(int i=0;i<height.length;i++){
            int cap = (right-left) * Math.min(height[left],height[right]);
            if(cap>best){
                best = cap;
            }
            if(height[left]<height[right]){
                left++;
            }
            else if(height[left]>=height[right]){
                right--;
            }
        }
        return best;
    }
}