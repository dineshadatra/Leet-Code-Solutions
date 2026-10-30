class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int res = 0;
        for(int i=0;i<requests.length-1;i++){
            if(requests[i]<n){
                res += Math.abs(requests[i]-requests[i+1]);
            }
        }
        return res+requests[0];
    }
}