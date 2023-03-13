import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the size of array :");
        int n=input.nextInt();
		int[] a=new int[n];
        int max=Integer.MIN_VALUE;
        System.out.printf("The enter array :\n");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        int[] c=new int[max+1];
        for(int i=0;i<a.length;i++){
            c[a[i]]++;
        }
        int in=0;
        int i=0;
        while(i<c.length){
            for(int j=1;j<=c[i];j++){
                a[in++]=i;
            }
            i++;
        }
        System.out.printf("The sorted array :\n");
        for(i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
	}
}
