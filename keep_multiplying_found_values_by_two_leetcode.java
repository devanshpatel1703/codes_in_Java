class Solution {
    public int findFinalValue(int[] a, int o) {
        Arrays.sort(a);
        for(int i=0;i<a.length;){
            if(a[i]==o){
                o*=2;
            }
            else{
                i++;
            }
        }
        return (o);
    }
}
