class Solution {
    public int countGoodRectangles(int[][] r) {
        int[] a=new int[r.length];
        for(int i=0;i<r.length;i++){
            if(r[i][0]>r[i][1]){
                a[i]=r[i][1];
            }
            else{
                a[i]=r[i][0];
            }
        }
        Arrays.sort(a);
        for(int i=a.length-1;i>=1;i--){
            if(a[i]!=a[i-1]){
                return (a.length-i);
            }
        }
        return a.length;
    }
}
