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
            int min=a[i];
            int in=-1;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    in=j;
                }
            }
            if(in!=-1){
                System.out.printf("swap %d %d\n",a[i],a[in]);
                int temp=a[in];
                a[in]=a[i];
                a[i]=temp;
            }
        }
        System.out.printf("\nThe sorted array :\n");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
	}
}
