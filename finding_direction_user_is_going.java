import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("You are at the origin now move along a specfic direction.\n");
        System.out.printf("1. North\n2. East\n3. South\n4. West.\n");
        System.out.printf("Enter your choice :");
        int initial=input.nextInt();
        int turn=1;
        while(turn!=0){
            System.out.printf("Enter the turn you took.\n1. Right\n2. Left\n 0.Exit Simulation.\n");
            System.out.printf("Your turn :");
            turn=input.nextInt();
            if(turn==1){
                if(initial==4){
                    initial=1;
                }
                else{
                    initial++;
                }
            }
            else if(turn==2){
                if(initial==1){
                    initial=4;
                }
                else{
                    initial--;
                }
            }
            else{
                break;
            }
        }
        if(initial==1){
            System.out.printf("You are currently at NORTH.");
        }
        else if(initial==2){
            System.out.printf("You are currently at EAST.");
        }
        else if(initial==3){
            System.out.printf("You are currently at SOUTH.");
        }
        else{
            System.out.printf("You are currently at WEST.");
        }
    }
}
