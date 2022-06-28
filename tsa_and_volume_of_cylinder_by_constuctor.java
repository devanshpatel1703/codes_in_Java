import java.util.Scanner;
class myCylinder{
    private double radius;
    private double height;
    public myCylinder(double x,double y){
        radius=x;
        height=y;
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
        System.out.printf("Enter the height of cylinder :");
        double h=input.nextDouble();
        System.out.printf("Enter the radius of cylinder :");
        double r=input.nextDouble();
        myCylinder obj=new myCylinder(r,h);
        System.out.printf("TOTAL SURFACE AREA :%.2f unit sq.\n",obj.surfaceArea());
        System.out.printf("VOLUME :%.2f unit sq.",obj.volume());
    }
}
