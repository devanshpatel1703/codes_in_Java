import java.util.Scanner;
abstract class parent{
    int a;
    void setA(int b){
        a=b;
    }
    abstract int increase();
}
class child extends parent{
    int increase(){
        System.out.printf("After increment :%d\n",++a);
        return 0;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter A :"); 
        int d=input.nextInt();
        child obj=new child();
        obj.setA(d);
        obj.increase();
    }
}
