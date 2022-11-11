class Solution {
    public int minOperations(int[] a) {
        int count=0;
        if(a.length==1){
            return (0);
        }
        for(int i=1;i<a.length;i++){
            if(a[i]<=a[i-1]){
                if(a[i]==a[i-1]){
                    count=count+1;
                    a[i]=a[i]+1;
                }
                else{
                    count=count+(a[i-1]-a[i]+1);
                    a[i]=a[i]+(a[i-1]-a[i]+1);
                }
            }
        }
        return(count);
    }
}
