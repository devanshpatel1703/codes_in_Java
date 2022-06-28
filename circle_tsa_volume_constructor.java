import java.util.Scanner;
class circle{
    private int radius;
    public circle(int x){
        radius=x;
    }
    public double tsa(){
        return Math.PI*2*radius*radius;
    }
    public double volume(){
        return ((4/3)*Math.PI*radius*radius*radius);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the value of radius of circle :");
        int r =input.nextInt();
        circle obj=new circle(r);
        System.out.printf("The surface area of sphere is :%f\nThe volume of sphere is :%f",obj.tsa(),obj.volume());
    }
}
