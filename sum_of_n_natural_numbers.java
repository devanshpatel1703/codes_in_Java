import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number till you want sum : ");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("The sum is :"+sum);
    }
}
