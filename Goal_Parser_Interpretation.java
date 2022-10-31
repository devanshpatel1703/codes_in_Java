class Solution {
    public String interpret(String c) {
        String ans="";
        for(int i=0;i<c.length();){
            if(c.charAt(i)=='G'){
                ans=ans+'G';
                i++;
            }
            else{
                if(c.charAt(i+1)==')'){
                    ans=ans+'o';
                    i=i+2;
                }
                else{
                    ans=ans+"al";
                    i=i+4;
                }
            }
        }
        return (ans);
    }
}
