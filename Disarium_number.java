import java.util.Scanner;
public class Main
{
    static int countDigits(int x){
	        int counter=0;
	        while(x>0){
	            x/=10;
	            counter++;
	        }
	        return (counter);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a number to check if Disarium :");
		int n=sc.nextInt();
		int check=n,i=1;
		int digits=countDigits(n);
		double sum=0;
		for(i=1;i<=digits;i++){
		    sum=sum+Math.pow(n%10,(digits-i+1));
		    n/=10;
		}
		if(sum==check){
		    System.out.printf("Yes, its a Disarium number.");
		}
		else{
		    System.out.printf("No, its not a Disarium number.");
		}
	}
}
