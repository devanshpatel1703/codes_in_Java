class Solution {
    public int[] nextGreaterElement(int[] ss, int[] m) {
        int[] ans=new int[ss.length];
        int in=0;
        for(int i=0;i<ss.length;i++){
            int num=ss[i];
            int index=-1;
            for(int j=0;j<m.length;j++){
                if(m[j]==num){
                    index=j;
                    break;
                }
            }
            int an=-1;
            for(int j=index;j<m.length;j++){
                if(m[j]>num){
                    an=m[j];
                    break;
                }
            }
            ans[in++]=an;
        }
        return (ans);
    }
}
