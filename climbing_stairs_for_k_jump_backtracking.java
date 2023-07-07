import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		System.out.printf("Enter number of steps :");
        int n=input.nextInt();
        System.out.printf("Enter max step jump you can take :");
        int j=input.nextInt();
        System.out.printf("Number of ways to reach top :%d",jump(0,j,n));
	}
    public static int jump(int curr,int j,int n){
        if(curr==n){
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int ans=0;
        for(int i=1;i<=j;i++){
            ans=ans+jump(curr+i,j,n);
        }
        return ans;
    }
}
