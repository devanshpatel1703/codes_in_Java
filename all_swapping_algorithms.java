import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A :");
        int a=input.nextInt();
        System.out.print("Enter B :");
        int b=input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping : \n"+"A = "+a);
        System.out.println("B = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After re-swapping by Algo 2 : \n"+"A = "+a);
        System.out.println("B = "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After re-swapping by Algo 3 : \n"+"A = "+a);
        System.out.println("B = "+b);
    }
}
