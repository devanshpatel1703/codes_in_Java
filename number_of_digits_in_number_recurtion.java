import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the number to count digits :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.printf("Digit count is :%d",sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return 1+sum(n/10);
    }
}
