import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0,n;
        System.out.printf("Enter the size of array :");
        n=input.nextInt();
        double[] arr=new double[n];
        for(i=0;i<n;i++){
            System.out.printf("Enter %d element :",i);
            arr[i]=input.nextDouble();
        }
        double sum=0;
        for(double element : arr){
            sum+=element;
        }
        System.out.printf("The sum of array is :%.2f",sum);
    }
}
