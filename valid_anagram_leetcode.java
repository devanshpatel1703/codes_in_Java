class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] cs1=s.toCharArray();
        char[] cs2=t.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        for(int i=0;i<s.length();i++){
            if(cs1[i]!=cs2[i]){
                return false;
            }
        }
        return true;
    }
}
