import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] a={1,3,5,7};
		System.out.printf("%d",fun(a,0));;
	}
	public static int fun(int[] a,int i){
	    if(i==a.length){
	        return 0;
	    }
	    if(callBeck(a[i])==1){
	        return 1;
	    }
	    return 0+fun(a,i+1);
	}
	public static int callBeck(int n){
	    if(n%2==0){
	        return 1;
	    }
	    return 0;
	}
}
