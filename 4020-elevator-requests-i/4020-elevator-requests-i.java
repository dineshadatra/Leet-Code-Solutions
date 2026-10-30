// class Solution {
//     public int elevatorRequests(int n, int[] requests) {
//         int res = requests[0];
//         for(int i=1;i<requests.length;i++){
//             res += Math.abs(requests[i-1]-requests[i]);
//         }
//         return res;
//     }
// }
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int t=0;
        int cur=0;
        for (int f:requests) {
            t+=Math.abs(f-cur);
            cur=f;
        }
        return t;
    }
}