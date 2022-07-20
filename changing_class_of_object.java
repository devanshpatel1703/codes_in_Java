class parent{
    public void fun1(){
        System.out.printf("You are in parent class.\n");;
    }
}
class child extends parent{
    public void fun1(){
        System.out.printf("You are in child class\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.fun1();
        obj=new child();
        obj.fun1();
    }
}
