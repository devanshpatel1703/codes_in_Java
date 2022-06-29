import java.util.Scanner;
class alpha{
    public static void a(){
        System.out.printf("We are in alpha class.\n");
    }
}
class beta extends alpha{
    public static void b(){
        System.out.printf("We are in beta class.\n");
    }
}
class delta extends beta{
    public static void d(){
        System.out.printf("We are in delta class.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        delta obj=new delta();
        delta.a();
        delta.b();
        delta.d();
    }
}
