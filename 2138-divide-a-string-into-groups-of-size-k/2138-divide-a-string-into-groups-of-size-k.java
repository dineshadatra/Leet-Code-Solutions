class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i));

            if(str.length()==k){
                ans.add(str.toString());
                str.setLength(0);
            }
        }
        if(str.length()>0){
            while(str.length()<k){
                str.append(fill);
            }
            ans.add(str.toString());
        }

        return ans.toArray(new String[0]);
    }
}