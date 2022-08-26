import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the number you want sum of digits :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ans=sum(n);
        System.out.printf("Sum of digits is :%d",ans);
    }
    public static int sum(int num){
        if(num==0){
            return 0;
        }
        return num%10+(sum(num/10));
    }
}
