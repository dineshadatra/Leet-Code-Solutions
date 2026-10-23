class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        for(int i=1;i<num;i++){
            if(i*i<num && (i+1)*(i+1)>num){
                return false;
            }
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}