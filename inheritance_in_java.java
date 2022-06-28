import java.util.Scanner;
class area{
    public double areaOfCircle(double x){
        System.out.printf("You are inside main class.\n");
        return (Math.PI*x*x);
    }
}
class rectangle extends area{
    public double areaOfSquare(double x){
        System.out.printf("You are inside Inherited class.\n");
        return (x*x);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("You want area of circle or square ?\n1 for circle.\n2 for Square.\nEnter your choice :");
        int shape=input.nextInt();
        rectangle obj=new rectangle();
        if(shape==1){
            System.out.printf("Enter the radius :");
            double r=input.nextDouble();
            System.out.printf("The area is %.2f",obj.areaOfCircle(r));
        }
        else if(shape==2){
            System.out.printf("Enter the side :");
            double s=input.nextDouble();
            System.out.printf("The area is %.2f",obj.areaOfSquare(s));
        }
        else{
            System.out.printf("Error");
        }
    }
}
