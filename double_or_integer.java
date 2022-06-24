import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.printf("Enter a float number :");
        double num=input.nextDouble();
        double d=(num%1);
        if(d>0.0){
            System.out.printf("Its a double.");
        }
        else{
            System.out.printf("Its a integer.");
        }
    }
}
