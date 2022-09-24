class Solution {
    public String generateTheString(int n) {
        String str="";
        if(n%2==0){
            for(int i=1;i<n;i++){
                str=str+'a';
            }
            str=str+'b';
        }
        else{
            for(int i=1;i<=n;i++){
                str=str+'z';
            }
        }
        return (str);
    }
}
