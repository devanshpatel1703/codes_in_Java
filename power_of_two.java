import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Check if the number is power of 2.\n");
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter number :");
        int n=input.nextInt();
        int temp=0;
        while(n!=0){
            if(n==2){
                System.out.printf("Yes.");
                temp=1;
                break;
            }
            if(n%2==1){
                System.out.printf("No.");
                temp=1;
                break;
            }
            n/=2;
        }
        if(temp==0){
            System.out.printf("Yes");
        }
    }
}
