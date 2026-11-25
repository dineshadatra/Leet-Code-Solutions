class Solution {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for(int i=0;i<num.length();i++){
            int x = (int) (num.charAt(i)-'0');
            if(i%2==0){
                odd+=x;
            }
            else{
                even+=x;
            }
        }
        return odd==even;
    }
}