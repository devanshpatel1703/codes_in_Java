import java.util.Scanner;
class test{
    static int a=10;
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        test obj=new test();
        System.out.printf("%d\n",obj.a);
        obj.a=20;
        System.out.printf("%d\n",obj.a);
        System.out.printf("%d\n",test.a);
    }
}
