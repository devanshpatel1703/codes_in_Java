import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.printf("Enter the number (in base 10) you want to convert :");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.printf("Enter the base in which you want to convert :");
		int base=input.nextInt();
		convert(num,base);
	}
	public static void convert(int num,int base){
	    if(num==0){
	        return;
	    }
	    convert(num/base,base);
	    System.out.printf("%d ",num%base);
	}
}
