import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter a number to check Fabonacci :");
        int a=input.nextInt();
        int n1=0,n2=1,sum=0;
        while(sum<a){
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        if(sum==a){
            System.out.printf("Yes its febonacci number.");
        }
        else{
            System.out.print("No its not febonacci number.");
        }
    }
}
