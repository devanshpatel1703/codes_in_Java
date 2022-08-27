import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number :");
        int num=input.nextInt();
        System.out.printf("Enter its power :");
        int pow=input.nextInt();
        System.out.printf("%d ^ %d = %d",num,pow,power(num,pow));
    }
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
}
