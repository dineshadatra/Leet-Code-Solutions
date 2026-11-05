class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for(int j:arr1){
            if(isValid(j,arr2,d)){
                c++;
            }
        }
        return c;
    }
    public boolean isValid(int n, int[] arr, int d){
        for(int i:arr){
            if(Math.abs(n-i)<=d){
                return false;
            }
        }
        return true;
    }
}