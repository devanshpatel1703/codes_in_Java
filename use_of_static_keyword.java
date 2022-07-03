// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class temp{
    static int a;
    int b;
}
class HelloWorld {
    public static void main(String[] args) {
        temp obj1=new temp();
        temp obj2=new temp();
        obj1.a=1;
        obj2.a=2;
        System.out.printf("obj1 =%d\nobj2 =%d",obj1.a,obj2.a);
        temp obj3=new temp();
        temp obj4=new temp();
        obj3.b=3;
        obj4.b=4;
        System.out.printf("\nobj3 =%d\nobj4 =%d",obj3.b,obj4.b);
    }
}
