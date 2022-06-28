import java.util.Scanner;
class myCylinder{
    private double radius;
    private double height;
    public void setRadius(double x){
        radius=x;
    }
    public double getRadius(){
        return (radius);
    }
    public void setHeight(double y){
        height=y;
    }
    public double getHeight(){
        return (height);
    }
    public double surfaceArea(){
        return (2*3.14*radius*(radius+height));
    }
    public double volume(){
        return(3.14*radius*radius*height);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        myCylinder obj=new myCylinder();
        System.out.printf("Enter the height of cylinder :");
        double h=input.nextDouble();
        obj.setHeight(h);
        System.out.printf("Enter the radius of cylinder :");
        double r=input.nextDouble();
        obj.setRadius(r);
        System.out.printf("TOTAL SURFACE AREA :%f\n",obj.surfaceArea());
        System.out.printf("VOLUME :%f",obj.volume());
    }
}
