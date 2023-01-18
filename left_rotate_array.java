import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter how many times you want to rotate the array to left :");
        int n=input.nextInt();
        System.out.printf("Enter the size of array :");
        int size=input.nextInt();
        int[] a=new int[size];
        System.out.printf("Enter array (space seprated) :");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        for(int i=1;i<=n;i++){
            int end=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=end;
        }
        for(int i: a){
            System.out.printf("%d ",i);
        }
    }
}
