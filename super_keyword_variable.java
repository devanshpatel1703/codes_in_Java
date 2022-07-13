class parent{
    int a,b;
    parent(int x,int y){
        a=x;
        b=y;
    }
}
class child extends parent{
    int c;
    child(int z,int x,int y){
        super(x,y);
        c=z;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        child obj=new child(1,2,3);
        System.out.printf("Value of \nA=%d\nB=%d\nC=%d",obj.a,obj.b,obj.c);
    }
}
