import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i,max,min,p_max=0,p_min=0;
        System.out.print("Enter the size of array :");
        n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter "+i+" Element :");
            arr[i]=input.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                p_max=i;
            }
            if(arr[i]<min){
                min=arr[i];
                p_min=i;
            }
        }
        System.out.println("The maximum Element is : "+max+"\nPosition : "+p_max);
        System.out.println("The minimum Element is : "+min+"\nPosition : "+p_min);
    }
}
