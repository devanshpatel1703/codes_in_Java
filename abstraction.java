abstract class shape{
    public int length,breath;
    shape(int l,int b){
        length=l;
        breath=b;
    }
    abstract public int area();
    abstract public int perimeter();
}
class cal extends shape{
    cal(int x,int y){
        super(x,y);
    }
    public int area(){
        return (length*breath);
    }
    public int perimeter(){
        return (2*(length+breath));
    }
}
class HelloWorld {
    public static void main(String[] args) {
        cal obj=new cal(10,5);
        System.out.printf("The area is :%d\n",obj.area());
        System.out.printf("The perimeter is :%d\n",obj.perimeter());
    }
}
