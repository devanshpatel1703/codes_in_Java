import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
		int[] a=new int[n];
		System.out.printf("Enter the array :\n");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    System.out.printf("Swapping %d and %d\n",a[j],a[j+1]);
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.printf("\nThe sorted array :\n");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
	}
}
