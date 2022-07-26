import java.util.Random;
import java.util.Scanner;
class HelloWorld {
    public static boolean toss(){
        Random random=new Random();
        int toss=random.nextInt(2);
        if(toss==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int ch=1;
        int count_head=0,count_tail=0;
        while(ch==1){
            System.out.printf("Enter 1 for toss and 0 for exit :");
            ch=input.nextInt();
            boolean check=toss();
            if(check==true){
                count_head++;
            }
            else if(check==false){
                count_tail++;
            }
        }
        System.out.printf("Head :%d times\nTails :%d times",count_head,count_tail);
    }
}
