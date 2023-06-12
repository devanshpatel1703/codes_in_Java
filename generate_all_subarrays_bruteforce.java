public class Program
{
    public static void main(String[] args) {
		int[] a={1,2,3,4};
        int n=a.length;
        for(int i=0;i<n;i++){
            int v=i;
            while(v<n){
                for(int j=i;j<=v;j++){
                    System.out.printf("%d ",a[j]);
                }
                System.out.printf("\n");
                v++;
            }
        }
	}
}
