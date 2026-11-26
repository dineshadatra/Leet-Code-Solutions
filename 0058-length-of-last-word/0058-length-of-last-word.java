class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int x = s.lastIndexOf(" ");
        return s.length()-1-x;
    }
}