import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("Enter a float number :");
        double num=input.nextDouble();
        double d=Math.round(num);
        System.out.printf("The round-off value is :%.2f",d);
    }
}
