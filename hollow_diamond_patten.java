import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("* ");
        }
        System.out.printf("\n");
        int star=n/2;
        int space=1;
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=star;j++){
                System.out.printf("* ");
            }
            for(int j=1;j<=space+1;j++){
                System.out.printf(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
            star-=1;
            space+=4;
        }
        space-=8;
        star+=2;
        for(int i=1;i<n/2;i++){
            for(int j=1;j<=star;j++){
                System.out.printf("* ");
            }
            for(int j=1;j<=space+1;j++){
                System.out.printf(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
            star+=1;
            space-=4;
        }
        for(int i=1;i<=n;i++){
            System.out.printf("* ");
        }
	}
}
