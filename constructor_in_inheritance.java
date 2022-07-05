class parent{
    parent(){
        System.out.printf("I am parent class constructor.\n");
    }
    parent(int a){
        System.out.printf("I am parent class constructor with value.\n");
    }
}
class child extends parent{
    child(){
        System.out.printf("I am child class consturctor.\n");
    }
    child(int a){
        super(a);
        System.out.printf("I am child class constructor with value.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        int a=6;
        parent p1=new parent(a);
        child c1=new child(a);
        parent p2=new parent();
        child c2=new child();
    }
}
