import java.util.Scanner;
class tAverage{
    static float average(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st number :");
        float a=input.nextFloat();
        System.out.print("Enter the 2nd number :");
        float b=input.nextFloat();
        System.out.print("Enter the 3rd number :");
        float c=input.nextFloat();
        float ans=a+b+c;
        ans/=3;
        return (ans);
    }
}
class Main {
    public static void main(String[] args) {
        tAverage obj=new tAverage();
        float ans=obj.average();
        System.out.printf("The average is :%f",ans);
    }
}
