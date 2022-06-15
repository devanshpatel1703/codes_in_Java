import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st sub marks :");
        int n1=input.nextInt();
        System.out.print("Enter 2st sub marks :");
        int n2=input.nextInt();
        System.out.print("Enter 3st sub marks :");
        int n3=input.nextInt();
        System.out.print("Enter 4st sub marks :");
        int n4=input.nextInt();
        System.out.print("Enter 5st sub marks :");
        int n5=input.nextInt();
        float ans=(n1+n2+n3+n4+n5)/5f;
        System.out.print("You got :"+ans+" % Marks.");
    }
}
