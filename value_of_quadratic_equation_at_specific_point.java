import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Quadratic equation is in form :-\nAx^2+Bx+C.\n");
        System.out.printf("Enter the value of a :");
        int a=input.nextInt();
        System.out.printf("Enter the value of b :");
        int b=input.nextInt();
        System.out.printf("Enter the value of c :");
        int c=input.nextInt();
        System.out.printf("Enter the value of parameter x :");
        int x=input.nextInt();
        System.out.printf("You entred eqn. %dx^2+%dx+%d and asked value at x= %d.\n",a,b,c,x);
        int ans=a*x*x+b*x+c;
        System.out.printf("Answer :%d",ans);
    }
}
