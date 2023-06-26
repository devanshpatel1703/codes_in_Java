import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the value of k which tells how many times each element comes except 1 : ");
        int k = input.nextInt();
        int bitmask=1;
        int n=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j : arr){
                if((bitmask&j)!=0){
                    count++;
                }
            }
            if(count%k!=0){
                n=n|bitmask;
            }
            bitmask=bitmask<<1;
        }
        System.out.printf("The unique element in the array : %d",n);
    }
}
