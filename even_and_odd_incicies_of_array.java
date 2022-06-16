import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i,even=0,odd=0,even_sum=0,odd_sum=0;
        System.out.print("Enter the size of array :");
        n=input.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter "+i+" Element :");
            arr[i]=input.nextInt();
            if(arr[i]%2==0){
                even++;
                even_sum+=arr[i];
            }
            else{
                odd++;
                odd_sum+=arr[i];
            }
        }
        System.out.print("\n\nEven element count : "+even+"\nOdd element count : "+odd+"\n\nEven elements sum : "+even_sum+"\nOdd Element sum : "+odd_sum);
        
    }
}
