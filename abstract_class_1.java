abstract class parent{
    abstract void message();
}
class child1 extends parent{
    void message(){
        System.out.printf("You are in class child 1.\n");
    }
}
class child2 extends parent{
    void message(){
        System.out.printf("You are in class child 2.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        child1 obj1=new child1();
        child2 obj2=new child2();
        obj1.message();
        obj2.message();
    }
}
