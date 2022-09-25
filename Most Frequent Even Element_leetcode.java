class Solution {
    public int mostFrequentEven(int[] a) {
        Arrays.sort(a);
        int max=a[a.length-1];
        int[] c=new int[max+1];
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                c[a[i]]++;
            }
        }
        int index=-1;
        int ans=-1;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]>=index && c[i]!=0){
                index=c[i];
                ans=i;
            }
        }
        
        return (ans);
    }
}
