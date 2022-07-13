import java.util.Scanner;
class circle{
    int radius;
    circle(int r){
        radius=r;
    }
}
class cylinder extends circle{
    private int height;
    cylinder(int x,int h){
        super(x);
        height=h;
    }
    double volumeCylinder(){
        return (Math.PI*radius*radius*height);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the radius of circle :");
        int r=input.nextInt();
        System.out.printf("Enter the height of cylinder :");
        int h=input.nextInt();
        cylinder obj=new cylinder(r,h);
        System.out.printf("The volume of cylinder is :%.2f cubic units.",obj.volumeCylinder());
    }
}
