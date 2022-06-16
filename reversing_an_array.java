import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n,i,temp;
        n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++){
            System.out.print("Enter element "+i+" : ");
            arr[i]=input.nextInt();
        }
        System.out.print("You entred array is : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.print("\nThe reversed array is : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
