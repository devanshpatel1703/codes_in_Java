class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
            if(n==2){
                return(sum+1);
            }
            if(n%2==0){
                sum=sum+n/2;
            }
            else{
                sum=sum+(n/2)+1;
            }
            n/=2;
        }
        
        return(sum);
    }
}
