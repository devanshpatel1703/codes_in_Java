import java.util.Scanner;
import java.util.Random;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random = new Random();
        System.out.printf("        -:WELCOME TO THE GAME:-\n");
        System.out.printf("Enter your name :");
        String name=input.next();
        System.out.printf("Choose any one of them:\n0.ROCK.\n1.PAPER\n2.SCISSORS.");
        int p=input.nextInt();
        switch (p){
            case 0:
                System.out.printf("%s choose : ROCK\n",name);
                break;
            case 1:
                System.out.printf("%s choose : PAPER\n",name);
                break;
            case 2:
                System.out.printf("%s choose : SCISSORS\n",name);
                break;
        }
        int c=random.nextInt(3);
        switch (c){
            case 0:
                System.out.printf("Computer choose : ROCK\n");
                break;
            case 1:
                System.out.printf("Computer choose : PAPER\n");
                break;
            case 2:
                System.out.printf("Computer choose : SCISSORS\n");
                break;
        }
        if((p==0&&c==1)||(p==1&&c==2)|(p==2&&c==0)){
            System.out.printf("\nAhhh shit !\nComputer WINS.\n%s LOSE.\nTHANKS FOR PLAYING.\nBETTER LUCK NEXT TIME.",name);
        }
        else if((p==0&&c==2)||(p==1&&c==0)||(p==2&&c==1)){
            System.out.printf("\nYeahhhh bitch !\n%s WIN.\nTHATS AMAZING COMPUTER LOST.\nTHANKS FOR PLAYING.",name);
        }
        else{
            System.out.printf("\nIts a draw.");
        }
    }
}
