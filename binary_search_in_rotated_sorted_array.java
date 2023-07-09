import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of rotated sorted array (e.g. [5,6,7,8,9,1,2,3]):");
        int length = scanner.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.printf("We have searched each and every element of array in itself.")
        for(int i : a)
        System.out.printf("\n%d - %d\n",i,binarySearch(a,i));
    }
    public static int binarySearch(int[] a,int t){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==t){
                return mid;
            }
            else if(a[mid]<a[j]){
                if(t>a[mid] && t<=a[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            else{
                if(t>=a[i] && t<a[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}
