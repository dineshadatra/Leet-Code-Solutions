class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s = "aeiou";
        int count = 0;
        for(int i=left;i<=right;i++){
            char ch1 = words[i].charAt(0);
            char ch2 = words[i].charAt(words[i].length()-1);
            if(s.indexOf(ch1)!=-1 && s.indexOf(ch2)!=-1){
                count++;
            }
        }
        return count;
    }
}