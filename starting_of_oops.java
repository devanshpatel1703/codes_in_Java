import java.util.Scanner;
class Triangle{
    int s1=3;
    int s2=4;
    static int multiply(int x,int y){
        return (x*y);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Triangle side=new Triangle();
        System.out.printf("The area is :%d",side.multiply(side.s1,side.s2));
    }
}
