class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int res = 0;
        while(mainTank>=5){
            mainTank -= 5;
            if(additionalTank>0){
                mainTank+=1;
                additionalTank--;
            }
            res+=5*10;
        }
        return res + (mainTank*10);
    }
}