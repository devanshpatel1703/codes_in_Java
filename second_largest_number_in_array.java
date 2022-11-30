import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        System.out.printf("Enter the array :");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int max1=a[0];
        int max2=a[1];
        for(int i=2;i<n;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]<max1){
                max2=a[i];
            }
        }
        System.out.printf("Largest :%d\nSecond largest :%d",max1,max2);
    }
}
