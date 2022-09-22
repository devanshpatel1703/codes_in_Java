class Solution {
    public int[] getNoZeroIntegers(int n) {
        int [] a=new int[2];
        a[0]=0;
        a[1]=0;
        for(int i=1;i<=n;i++){
            a[0]=i;
            a[1]=n-i;
            if(zero(a[0])==true && zero(a[1])==true){
                break;
            }
        }
        return (a);
    }
    public boolean zero(int a){
        while(a>9){
            if(a%10==0){
                return false;
            }
            else{
                a/=10;
            }
        }
        return true;
    }
}
