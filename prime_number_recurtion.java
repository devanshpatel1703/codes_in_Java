import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number :");
        int num=input.nextInt();
        if(prime(num,2,0)==0){
             System.out.printf("Yes its prime.");
        }
        else{
            System.out.printf("Not prime.");
        }
    }
    public static int prime(int num,int check,int temp){
        if(check==num){
            return 0;
        }
        if(num%check==0){
            temp=1;
        }
        return temp+prime(num,check+1,0);
    }
}
