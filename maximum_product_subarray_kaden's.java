public class Program{
    public static void main(String[] args) {
		int[] a={2,3,-1,4,1,1,-1};
        int ans=Integer.MIN_VALUE;
        int curr=1;
        for(int i=0;i<a.length;i++){
            curr=curr*a[i];
            System.out.println(curr);
            if(curr>ans){
                ans=curr;
            }
            if(curr==0){
                curr=1;
            }
        }
        System.out.println("ans : "+ans);
	}
}
