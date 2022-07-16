abstract class shape{
    abstract public int rectangeArea(int x,int y);
    abstract public int squareArea(int x);
    abstract public double circleArea(double x);
}
class area extends shape{
    public int rectangeArea(int x,int y){
        return (x*y);
    }
    public int squareArea(int x){
        return (x*x);
    }
    public double circleArea(double x){
        return (3.14*x*x);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        shape obj=new area();
        System.out.printf("Area of rectange is :%d\n",obj.rectangeArea(5,3));
        System.out.printf("Area of square is :%d\n",obj.squareArea(5));
        System.out.printf("Area of circle is :%.2f\n",obj.circleArea(10));
    }
}
