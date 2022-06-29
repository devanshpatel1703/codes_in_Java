import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the distance of journey in kms :");
        double dis=input.nextDouble();
        System.out.printf("Enter hours :");
        double hour=input.nextDouble();
        double temp=hour;
        System.out.printf("Enter minutes :");
        double min=input.nextDouble();
        hour=hour+(min/60);
        System.out.printf("Enter seconds :");
        double sec=input.nextDouble();
        System.out.printf("You entered time of journey %.0f:%.0f:%.0f.\n",temp,min,sec);
        hour=hour+sec/3600;
        sec=hour*3600+min*60+sec;
        double mile=hour*0.62;
        System.out.printf("Your speed is :-\nIn Km/h = %.2f\nIn M/sec = %.2f\nIn Miles/h = %.2f",(dis/hour),(dis*1000)/sec,mile/hour);
    }
}
