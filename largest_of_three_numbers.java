import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st number :");
		a=input.nextInt();
		System.out.println("Enter 2nd number :");
		b=input.nextInt();
		System.out.println("Enter 3rd number :");
		c=input.nextInt();
		if(a>b){
		    if(a>c){
		        System.out.println(a+" is largest.");
		    }
		    else{
		        System.out.println(c+" is largest.");
		    }
		}
		else if(b>a){
		    if(b>c){
		        System.out.println(b+" is largest.");
		    }
		    else{
		        System.out.println(c+" is largest.");
		    }
		}
		else{
		    System.out.println("Any two of the values are equale.");
		}
	}
}
