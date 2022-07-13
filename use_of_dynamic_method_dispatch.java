class parent{
    int x=10;
    void f1(){
        System.out.printf("In parent class...\n");
    }
    void f2(){
        System.out.printf("In parent class in F2.\n");
    }
}
class child extends parent{
    int x=5;
    void f1(){
        System.out.printf("In child class...\n");
    }
}
class child2 extends parent{
    int x=2;
    void f1(){
        System.out.printf("In child-2 class...\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        parent obj=new child();
        obj.f1();
        System.out.printf("Value of x is :%d\n",obj.x);
        obj.f2();
        obj=new child2();
        obj.f1();
        System.out.printf("Value of x is :%d\n",obj.x);
        obj.f2();
    }
}
