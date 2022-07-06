class alpha{
    public void fun(){
        System.out.printf("I am method in alpha.\n");
    }
}
class beta extends alpha{
    @Override
    public void fun(){
        System.out.printf("I am method in beta.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        beta obj_b=new beta();
        alpha obj_a=new alpha();
        obj_b.fun();
        obj_a.fun();
    }
}
