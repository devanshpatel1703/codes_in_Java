import java.util.Scanner;
import java.util.Random;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter your name :");
        String name=input.next();
        System.out.printf("%s, You are going to play number guessing game with computer.Computer maharaj has chosen a number you have to guess it by entering your guess so start.\n",name);
        int n=random.nextInt(101);
        int check=-1,count=0;
        while(check!=n){
            System.out.printf("\nYour guess :");
            check=input.nextInt();
            if(check>n){
                System.out.printf("\nYour guess is higher.");
            }
            else if(check<n){
                System.out.printf("\nYour guess is lower.");
            }
            else{
                System.out.printf("\nCongratulations you guessed it %s.\nIt took you %d tries.",name,count);
            }
            count++;
        }
    }
}
