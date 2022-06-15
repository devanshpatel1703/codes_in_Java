import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter N1 :");
        int n1=input.nextInt();
        System.out.print("Enter N2 :");
        int n2=input.nextInt();
        int m=n1*n2;
        System.out.println("Multiplication : "+m);
        int n=n1+n2;
        System.out.println("Addition : "+n);
        int s=n1-n2;
        System.out.println("Subtraction : "+s);
        double f=n1*1.0/n2;
        System.out.println("Division : "+f);
        int r=n1%n2;
        System.out.println("Remainder of N1 dividing with N2 is : "+r);
    }
}
