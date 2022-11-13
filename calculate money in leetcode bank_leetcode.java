class Solution {
    public int totalMoney(int n) {
        int start=1,count=0;
        int sum=0;
        for(int i=1;i<=n;i+=7){
            for(int j=1;j<=7;j++){
                if(count==n){
                    return (sum);
                }
                sum=sum+(start+j-1);
                count++;
            }
            start++;
        }
        return sum;
    }
}
