//Test case to check code-->
//radius=50
//perimeter 314
//area=7850
import java.util.Scanner;
class circle{
    private int radius;
    private float peri;
    private float area;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return (radius);
    }
    public int setArea(float a){
        if(a!=3.14*radius*radius){
            System.out.printf("Entred value of area is wrong.\n");
            return 0;
        }
        area=a;
        return 1;
    }
    public float getArea(){
        return area;
    }
    public float setPeri(float p){
        if(p!=2*3.14*radius){
            System.out.printf("You have entred wromg value of perimeter.\n");
            return 0;
        }
        peri=p;
        return 1;
    }
    public float getPeri(){
        return (peri);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        circle obj=new circle();
        System.out.printf("Enter the value of radius of circle :");
        int r=input.nextInt();
        obj.setRadius(r);
        float check=0;
        while(check==0){
            System.out.printf("Enter the perimeter :");
            float p=input.nextFloat();
            check=obj.setPeri(p);
        }
        check=0;
        while(check==0){
            System.out.printf("Enter the Area :");
            float p=input.nextFloat();
            check=obj.setArea(p);
        }
        System.out.printf("Radius :%d\nPerimeter :%.2f\nArea :%.2f.",obj.getRadius(),obj.getPeri(),obj.getArea());
    }
}
