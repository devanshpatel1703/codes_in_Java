import java.util.Scanner;
class HelloWorld {
    static int plusOne(int[] arr){
        int i=0;
        for(i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element :",i);
            arr[i]=input.nextInt();
        }
        System.out.printf("Array at starting :");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        plusOne(arr);
        System.out.printf("\n");
        System.out.printf("\nArray after changing from function :\n");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
