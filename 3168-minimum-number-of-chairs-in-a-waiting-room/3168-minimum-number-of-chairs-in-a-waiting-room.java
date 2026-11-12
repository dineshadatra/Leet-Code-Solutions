class Solution {
    public int minimumChairs(String s) {
        int res = 0;
        int subres = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                subres++;
            }
            else if(s.charAt(i)=='L'){
                subres--;
            }
            res = Math.max(res,subres);
        }
        return res;
    }
}