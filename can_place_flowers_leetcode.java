class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        if(a.length==1){
            if(a[0]==1){
                if(n>0){
                    return false;
                }
                else{
                    return true;
                }
            }
            else{
                if(n>1){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        int count=0,j=a.length-1;
        for(int i=0;i<a.length-1;i++){
            if(i==0){
                if(a[i]==0&&a[i+1]==0){
                    a[i]=1;
                    count++;
                }
            }
            else if(a[i]==0&&a[i-1]==0&&a[i+1]==0){
                a[i]=1;
                count++;
            }
        }
        if(a[j-1]==0&&a[j]==0){
            count++;
        }
        if(n<=count){
            return true;
        }
        return false;
    }
}
