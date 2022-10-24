class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=s.lastIndexOf(ch);
            if((index!=i) && (index-i-1)>ans){
                ans=index-i-1;
            }
        }
        return (ans);
    }
}
