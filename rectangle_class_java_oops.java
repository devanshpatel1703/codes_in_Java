import java.util.Scanner;
class rec{
    private double l;
    private double b;
    public void setl(double l){
        this.l=l;
    }
    public double getl(){
        return l;
    }
    public void setb(double b){
        this.b=b;
    }
    public double getb(){
        return b;
    }
    public double area(){
        return (l*b);
    }
    public double peri(){
        return (2*(l+b));
    }
}
class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter value of length :");
        double a=input.nextDouble();
        System.out.printf("Enter value of breath :");
        double b=input.nextDouble();
        rec obj=new rec();
        obj.setl(a);
        obj.setb(b);
        System.out.printf("You entred length :%.2f\n",obj.getl());
        System.out.printf("You entred breath :%.2f\n",obj.getb());
        System.out.printf("Area of rectange is :%.2f\n",obj.area());
        System.out.printf("Perimeter of rectange is :%.2f\n",obj.peri());
    }
}
