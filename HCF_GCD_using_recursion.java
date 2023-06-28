import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        System.out.printf("Enter two numbers to find HCF :");
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int b=input.nextInt();
        if(s>b){
            s=s+b;
            b=s-b;
            s=s-b;
        }
		gcd(s,b);
	}
    public static void gcd(int s,int b){
        if(b%s==0){
            System.out.printf("GCD :%d",s);
            return;
        }
        gcd(b%s,s);
    }
}
