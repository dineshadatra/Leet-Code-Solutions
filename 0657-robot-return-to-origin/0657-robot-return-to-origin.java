class Solution {
    public boolean judgeCircle(String moves) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                sum1++;
            }
            else if(moves.charAt(i)=='D'){
                sum1--;
            }
            else if(moves.charAt(i)=='L'){
                sum2--;
            }
            else if(moves.charAt(i)=='R'){
                sum2++;
            }

        }
        return sum1==0 && sum2==0;
    }
}