import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter the number :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        prime(n,1,1);
    }
    public static void prime(int n,int i,int c){
        if(i==n+1){
            return;
        }
        else{
            System.out.printf("Factorial of %d is %d\n",i,c);
            prime(n,i+1,c*i);
        }
    }
}
