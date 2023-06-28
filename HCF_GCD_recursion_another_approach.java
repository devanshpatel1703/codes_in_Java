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
		System.out.printf("%d",gcd(s,b));
	}
    public static int gcd(int s,int b){
        if(b%s==0){
            return s;
        }
        return 0+gcd(b%s,s);
    }
}
