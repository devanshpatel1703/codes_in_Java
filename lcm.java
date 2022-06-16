import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c,max,lcm=1;
		System.out.println("Enter 1st number :");
		a=input.nextInt();
		System.out.println("Enter 2nd number :");
		b=input.nextInt();
		max=(a<b)?a:b;
		int i;
		for(i=max;;i++){
		    if(i%a==0&&i%b==0){
		        lcm=i;
		        break;
		    }
		}
		System.out.println("The L.C.M. is : "+lcm);
	}
}
