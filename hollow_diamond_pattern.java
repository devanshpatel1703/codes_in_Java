import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("* ");
        }
        System.out.printf("\n");
        int s=2;
        int an=1;
        for(int i=n/2;i>=1;i--){
            //strat star
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            //mid space
            for(int j=1;j<=s*(an);j++){
                System.out.printf(" ");
            }
            an=an+2;
            //end star
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        s=2;
        an--;
        for(int i=1;i<=n/2;i++){
            //strat star
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            //mid space
            for(int j=1;j<s*(an)-1;j++){
                System.out.printf(" ");
            }
            an=an-2;
            //end star
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        for(int i=1;i<=n;i++){
            System.out.printf("* ");
        }

	}
}
