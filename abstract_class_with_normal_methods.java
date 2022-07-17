abstract class a{
    public abstract int sub();
    public int method(){
        System.out.printf("You are in abstract class.\n");
        return 0;
    }
}
class b extends a{
    public int sub(){
        System.out.printf("You are in extended class.\n");
        return 0;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        a obj=new b();
        obj.sub();
        obj.method();
    }
}
