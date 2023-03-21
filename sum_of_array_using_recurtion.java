import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
        System.out.printf("Sum of array :%d",sum(0,arr));;
	}
	public static int sum(int i,int[] arr){
	    if(i==arr.length){
	        return 0;
	    }
	    return arr[i]+sum(i+1,arr);
	}
}
