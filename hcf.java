import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,max,min,r;
		System.out.println("Enter 1st number :");
		a=input.nextInt();
		System.out.println("Enter 2nd number :");
		b=input.nextInt();
		max=(a>b)?a:b;
		min=(a>b)?b:a;
		while(max%min!=0){
		    r=max%min;
		    max=min;
		    min=r;
		}
		System.out.println("The HCF is : "+min);
	}
}
