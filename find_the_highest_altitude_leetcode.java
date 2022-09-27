class Solution {
    public int largestAltitude(int[] g) {
        int [] a = new int [g.length+1];
        int index=1;
        a[0]=0;
        for(int i=0;i<g.length;i++){
            a[index]=a[index-1]+g[i];
            index++;
        }
        int max=-100;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return (max);
    }
}
