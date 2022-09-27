class Solution {
    public int sumOfUnique(int[] a) {
        Arrays.sort(a);
        int max=a[a.length-1];
        int [] c = new int [max+1];
        for(int i=0;i<a.length;i++){
            c[a[i]]++;
        }
        int sum=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==1){
                sum=sum+i;
            }
        }
        return (sum);
    }
}
