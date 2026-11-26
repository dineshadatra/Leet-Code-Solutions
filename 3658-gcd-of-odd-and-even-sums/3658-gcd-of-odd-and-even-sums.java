class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int sumOdd = n*n;
        int sumEven = n*(n+1);

        int max = 0;
        for(int i = 1;i<Math.min(sumOdd,sumEven);i++){
            if(sumOdd%i==0 && sumEven%i==0){
                max = i;
            }
        }
        return max;
    }
}