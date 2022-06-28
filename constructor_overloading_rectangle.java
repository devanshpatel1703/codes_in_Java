import java.util.Scanner;
class myRectangle{
    private double length;
    private double breath;
    public myRectangle(double l,double b){
        length=l;
        breath=b;
    }
    public myRectangle(){
        length=4;
        breath=5;
    }
    public double area(){
        return (length*breath);
    }
    public double perimeter(){
        return(2*(length+breath));
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.printf("Enter the length of rectangle :");
        double l=input.nextDouble();
        System.out.printf("Enter the breath of rectangle :");
        double b=input.nextDouble();
        myRectangle obj1=new myRectangle(l,b);
        myRectangle obj2=new myRectangle();
        System.out.printf("By user defined length and breath :\nAREA :%.2f\nPERIMETER :%.2f\n",obj1.area(),obj1.perimeter());
        System.out.printf("By pre defined length=4 and breath=5 :\nAREA :%.2f\nPERIMETER :%.2f\n",obj2.area(),obj2.perimeter());
    }
}
