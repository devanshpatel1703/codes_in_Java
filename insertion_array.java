import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] a=new int[10];
        int i=0;
        System.out.printf("The old array :\n");
        for(i=0;i<a.length;i++){
            a[i]=i;
        }
        for(i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
        System.out.printf("Enter the value :");
        int v=input.nextInt();
        System.out.printf("Enter the position :");
        int p=input.nextInt();
        for(i=a.length-1;i>=p-1;i--){
            a[i]=a[i-1];
        }
        a[p-1]=v;
        System.out.printf("The new array :\n");
        for(i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
