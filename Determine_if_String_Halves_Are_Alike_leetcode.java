class Solution {
    public boolean halvesAreAlike(String s) {
        String check="aeiouAEIOU";
        int cl=0,cr=0;
        int i=0,j=s.length()-1;
        while(j!=i-1){
            if(check.indexOf(s.charAt(i))!=-1){
                cl++;
            }
            if(check.indexOf(s.charAt(j))!=-1){
                cr++;
            }
            i++;
            j--;
        }
        if(cl==cr){
            return true;
        }
        else{
            return false;
        }
    }
}
