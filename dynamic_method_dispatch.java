class parent{
    int x=10;
    void f1(){
        System.out.printf("In parent class...");
    }
}
class child extends parent{
    int x=5;
    void f1(){
        System.out.printf("In child class...");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        parent obj=new child();
        obj.f1();
        System.out.printf("\nValue of x is :%d",obj.x);
    }
}
