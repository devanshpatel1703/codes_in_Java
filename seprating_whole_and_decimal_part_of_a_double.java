import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("Enter a float number :");
        double num=input.nextDouble();
        double w=num-(num%1);
        num%=1;
        System.out.printf("Whole part :%.0f\nDecimal part :%f",w,num);
    }
}
