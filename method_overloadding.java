import java.util.Scanner;
class sec{
    public int sum(int x,int y){
        return (x+y);
    }
    public int sum(int x){
        return (x*x);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        int a=4,b=5;
        sec obj=new sec();
        System.out.printf("with arg :%d\n",obj.sum(a,b));
        System.out.printf("without arg :%d",obj.sum(a));
    }
}
