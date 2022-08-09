import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input= new Scanner (System.in);
		System.out.printf("Enter thre string :");
		String str=input.nextLine();
		System.out.printf("Enter the size of array :");
		int n=input.nextInt();
		int i=0,j=0;
		int a[] = new int[n];
		for(i=0;i<n;i++){
		    System.out.printf("Enter %d element of array :", i);
		    a[i]=input.nextInt();
		}
		for(i=0;i<n;i++){
		    String strn="";
		    for(j=a[i]-1;j>=0;j--){
		        strn=strn+str.charAt(j);
		    }
		    for(j=a[i];j<str.length();j++){
		        strn=strn+str.charAt(j);
		    }
		    str=strn;
		}
		System.out.printf("The resultant string is :%s",str);
	}
}
