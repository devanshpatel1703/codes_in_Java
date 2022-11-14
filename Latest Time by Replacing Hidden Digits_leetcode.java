class Solution {
    public String maximumTime(String t) {
        String ans="";
        if(t.charAt(0)=='?'){
            if(t.charAt(1)>='4' && t.charAt(1)!='?'){
                ans=ans+'1';
            }
            else{
                ans=ans+'2';
            }
        }
        else{
            ans=ans+t.charAt(0);
        }
        if(t.charAt(1)=='?'){
            if(t.charAt(0)=='0' ||t.charAt(0)=='1'){
                ans=ans+'9';
            }
            else{
                ans=ans+'3';
            }
        }
        else{
            ans=ans+t.charAt(1);
        }
        ans=ans+':';
        if(t.charAt(3)=='?'){
            ans=ans+'5';
        }
        else{
            ans=ans+t.charAt(3);
        }
        if(t.charAt(4)=='?'){
            ans=ans+'9';
        }
        else{
            ans=ans+t.charAt(4);
        }
        return (ans);
    }
}
