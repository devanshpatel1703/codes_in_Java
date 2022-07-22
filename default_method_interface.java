interface A{
    public void fun();
    default public void fun1(){
        System.out.printf("I am a default method in interface A.\n");
    }
}
interface B{
    int a=9;
    default public void fun2(){
        System.out.printf("I am simple method in interface B.\n");
    }
}
class check implements A,B{
    public void fun(){
        System.out.printf("I am implement of fun1() in class.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        check obj=new check();
        obj.fun();
        obj.fun1();
        obj.fun2();
    }
}
