abstract class a{
    public abstract int sub();
    public int method(){
        System.out.printf("You are in abstract class.\n");
        return 0;
    }
}
abstract class b extends a{
    abstract public int sub1();
}
class c extends b{
    public int sub(){
        System.out.printf("You are in extended class c sub.\n");
        return 0;
    }
    public int sub1(){
        System.out.printf("You are in extended class c sub1.\n");
        return 0;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        c obj=new c();
        obj.sub();
        obj.sub1();
        obj.method();
    }
}
