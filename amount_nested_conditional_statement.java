import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the amount :");
        int a=input.nextInt();
        double d=0;
        if(a<20000){
            if(a>=10000){
                d=0.05;
            }
            else{
                if(a>=5000){
                    d=0.02;
                }
                else{
                    d=0;
                }
            }
        }
        else{
            d=0.1;
        }
        System.out.printf("The discount is :%.2f\n",d);
        double ans=(a-a*d);
        System.out.printf("Your payble amount is :%.2f",ans);
    }
}
