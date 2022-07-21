import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter %d element :",i);
            a[i]=input.nextInt();
        }
        System.out.printf("You entred array :-\n");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
        System.out.printf("Enter the position for deletion :");
        int p=input.nextInt();
        for(int i=p;i<n-1;i++){
            a[i]=a[i+1];
        }
        System.out.printf("Array after deletion :-\n");
        for(int i=0;i<n-1;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
