import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter the number of minutes :");
        int min=input.nextInt();
        int year=0;
        if(min/525600>0){
            year=min/525600;
            min=min-(year*525600);
        }
        int days=0;
        if(min/1440>0){
            days=min/1440;
            min=min-(days*1440);
        }
        if(min>0){
            min=min/60;
        }
        System.out.printf("That will be equale to %d years %d days(approximatly).\nLeft hours :%d",year,days,min);
    }
}
