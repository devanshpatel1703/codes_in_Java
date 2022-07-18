interface A{
    public void a();
}
class define implements A{
    public void a(){
        System.out.printf("We are in A.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        define obj = new define();
        obj.a();
    }
}
