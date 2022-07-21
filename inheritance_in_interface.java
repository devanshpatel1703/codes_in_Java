interface A{
    public void fun1();
}
interface B extends A{
    public void fun2();
}
class myClass implements B{
    public void fun1(){
        System.out.printf("You are in fun 1.\n");
    }
    public void fun2(){
        System.out.printf("You are in fun 2.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        myClass obj=new myClass();
        obj.fun1();
        obj.fun2();
    }
}
