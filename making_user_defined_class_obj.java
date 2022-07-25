class A{
    int a=5;
}
class B{
    A obj=new A();
    public int fun(){
        return obj.a;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        B o=new B();
        System.out.printf("res :%d",o.fun());
    }
}
