class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int sumOdd = n*n;
        int sumEven = n*(n+1);

        int max = Integer.MIN_VALUE;
        for(int i = 1;i<=n;i++){
            if(sumOdd%i==0 && sumEven%i==0){
                max = Math.max(max,i);
            }
        }
        return max;
    }
}