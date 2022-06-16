import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n,i;
        n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++){
            System.out.print("Enter element "+i+" : ");
            arr[i]=input.nextInt();
        }
        System.out.println("The peak elements are : ");
        for(i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i+1]<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
