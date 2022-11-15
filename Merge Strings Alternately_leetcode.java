class Solution {
    public String mergeAlternately(String w1, String w2) {
        if(w1.length()==w2.length()){
            String ans="";
            for(int i=0;i<w1.length();i++){
                ans=ans+w1.charAt(i);
                ans=ans+w2.charAt(i);
            }
            return (ans);
        }
        else if(w1.length()>w2.length()){
            int d=w2.length();
            String ans="";
            for(int i=0;i<d;i++){
                ans=ans+w1.charAt(i);
                ans=ans+w2.charAt(i);
            }
            for(int i=d;i<w1.length();i++){
                ans=ans+w1.charAt(i);
            }
            return (ans);
        }
        else{
            int d=w1.length();
            String ans="";
            for(int i=0;i<d;i++){
                ans=ans+w1.charAt(i);
                ans=ans+w2.charAt(i);
            }
            for(int i=d;i<w2.length();i++){
                ans=ans+w2.charAt(i);
            }
            return (ans);
        }
    }
}
