class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<String>();
        int count=0;
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        for(String str: words){
            int check=1;
            String strc=str.toLowerCase();
            char a=strc.charAt(0);
            if(str1.indexOf(a)!=-1){
                for(int i=1;i<strc.length();i++){
                    char ele=strc.charAt(i);
                    if(str1.indexOf(ele)==-1){
                        check=0;
                        break;
                    }
                }
            }
            else if(str2.indexOf(a)!=-1){
                for(int i=1;i<strc.length();i++){
                    char ele=strc.charAt(i);
                    if(str2.indexOf(ele)==-1){
                        check=0;
                        break;
                    }
                }
            }
            else{
                for(int i=1;i<strc.length();i++){
                    char ele=strc.charAt(i);
                    if(str3.indexOf(ele)==-1){
                        check=0;
                        break;
                    }
                }
            }
            if(check==1){
                ans.add(str);
                count++;
            }
        }
        String[] sa = new String[count];
        for (int i = 0; i < ans.size(); i++){
            sa[i]=ans.get(i);
        }
        return (sa);
    }
}
