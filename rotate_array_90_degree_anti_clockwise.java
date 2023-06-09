import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        int[][] ans=new int[n][n];
        int c=0;;
        for(int i=0;i<n;i++){
            int r=0;
            for(int j=n-1;j>=0;j--){
                ans[r++][c]=a[i][j];
            }
            c++;
        }
        for(int[] i : ans){
            for(int j : i){
                System.out.printf("%d ",j);
            }
            System.out.printf("\n");
        }
	}
}
