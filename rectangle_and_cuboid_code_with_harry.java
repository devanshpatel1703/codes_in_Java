import java.util.Scanner;
class rectangle{
    int length,width;
    rectangle(int l,int b){
        length=l;
        width=b;
    }
    float areaOfRec(){
        return (length*width);
    }
}
class cuboid extends rectangle{
    private int height;
    cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    double volumeCuboid(){
        return (length*width*height);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the length of rectange :");
        int l=input.nextInt();
        System.out.printf("Enter the width of cylinder :");
        int b=input.nextInt();
        System.out.printf("Enter the height of reactangle :");
        int h=input.nextInt();
        cuboid obj=new cuboid(l,b,h);
        System.out.printf("The area of rectange is :%.2f square units.\n",obj.areaOfRec());
        System.out.printf("The volume of cylinder is :%.2f cubic units.",obj.volumeCuboid());
    }
}
