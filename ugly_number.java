import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter a number :");
        int n=input.nextInt();
        int temp=0;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                temp=1;
                break;
            }
        }
        if(temp==1){
            System.out.printf("Not ugly.");
        }
        else{
            System.out.printf("Yes its ugly.");
        }
    }
}
