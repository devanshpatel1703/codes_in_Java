class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
        int ans=0;
        int len=0;
        if(s.length()>g.length()){
            len=s.length()-g.length();
            String g_new="";
            for(int i=1;i<=len;i++){
                g_new=g_new+'0';
            }
            for(int i=0;i<g.length();i++){
                g_new=g_new+g.charAt(i);
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=g_new.charAt(i)){
                    ans++;
                }
            }
        }
        else if(s.length()<g.length()){
            len=g.length()-s.length(); 
            String s_new="";
            for(int i=1;i<=len;i++){
                s_new=s_new+'0';
            }
            for(int i=0;i<s.length();i++){
                s_new=s_new+s.charAt(i);
            }
            for(int i=0;i<g.length();i++){
                if(g.charAt(i)!=s_new.charAt(i)){
                    ans++;
                }
            }
        }
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=g.charAt(i)){
                    ans++;
                }
            }
        }
        return (ans);
    }
}
