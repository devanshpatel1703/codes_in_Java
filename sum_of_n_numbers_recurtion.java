import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number till you want the sum :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ans=sum(n);
        System.out.printf("Sum :%d",ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
