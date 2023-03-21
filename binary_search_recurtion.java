import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		binarySearch(0,arr,arr.length,10);
	}
	public static void binarySearch(int left,int[] arr,int right,int target){
	    int mid=(left+right)/2;
	    if(left>right){
	        System.out.printf("-1");
	        return;
	    }
	    if(arr[mid]>target){
            binarySearch(left,arr,mid-1,target);	        
	    }
	    if(arr[mid]<target){
            binarySearch(mid+1,arr,right,target);	        
	    }
	    if(arr[mid]==target){
            System.out.printf("Present at index :%d",mid);
            return;
	    }
	    return;
	}
}
