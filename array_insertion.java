import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int a[];
        a=new int[n];
        for(int i=0;i<n-1;i++){
            System.out.printf("Enter %d element :",i);
            a[i]=input.nextInt();
        }
        System.out.printf("You entred array :-\n");
        for(int i=0;i<n-1;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
        System.out.printf("Enter the position for insetion :");
        int p=input.nextInt();
        for(int i=n-2;i>=p;i--){
            a[i+1]=a[i];
        }
        System.out.printf("Enter the entry you want to insert :");
        int value=input.nextInt();
        a[p]=value;
        System.out.printf("Array after insertion :-\n");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
