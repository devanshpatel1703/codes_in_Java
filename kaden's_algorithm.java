public class Program{
    public static void main(String[] args) {
		int[] a={1,2,-1,2,1};
        int ans=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<a.length;i++){
            curr+=a[i];
            if(curr>ans){
                ans=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        System.out.println(ans);
	}
}
