import java.util.Scanner;
interface shapes{
    public void square();
    public void circle();
    public void rectange();
    public void triange();
}
class calArea implements shapes{
    Scanner input=new Scanner(System.in);
    public void square(){
        System.out.printf("Enter the length of side of square :");
        int side=input.nextInt();
        System.out.printf("The area is :%d\n",side*side);
    }
    public void circle(){
        System.out.printf("Enter the radius :");
        double r=input.nextDouble();
        System.out.printf("The area is :%.2f\n",Math.PI*r*r);
    }
    public void rectange(){
        System.out.printf("Enter the length of rectange :");
        int l=input.nextInt();
        System.out.printf("Enter the breath of ractange :");
        int b=input.nextInt();
        System.out.printf("The area of rectange is :%d\n",l*b);
    }
    public void triange(){
        System.out.printf("Enter the base of triange :");
        int base=input.nextInt();
        System.out.printf("Enter the height of triange :");
        int h=input.nextInt();
        System.out.printf("The area of triangle is :%.2f",0.5*base*h);
    }
}
class Main{
    public static void main(String[] args){
        calArea obj=new calArea();
        obj.square();
        obj.circle();
        obj.rectange();
        obj.triange();
        
    }
}
