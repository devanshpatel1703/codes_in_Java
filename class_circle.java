import java.util.Scanner;
class areaCircle{
    double pi=3.14,radius=10;
    public double noArgument(){
        return (radius*pi*radius);
    }
    public double twoArgument(double pi,double r){
        return(pi*r*r);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        areaCircle obj=new areaCircle();
        double ans1=obj.noArgument();
        System.out.printf("The average is :%f\n",ans1);
        System.out.printf("Enter the radius :");
        double rad=input.nextFloat();
        double ans2=obj.twoArgument(3.14,rad);
        System.out.printf("The average is by 2nd function :%f",ans2);
    }
}
