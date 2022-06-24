import java.util.Scanner;
class HelloWorld {
    public static boolean checkPrime(int x){
        int i=1;
        for(i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("Enter a number till you want primes:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            boolean check=checkPrime(i);
            if(check==true){
                System.out.printf("%d\n",i);
            }
        }
    }
}
