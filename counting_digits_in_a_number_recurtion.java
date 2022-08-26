import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the number you want to count digits :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int ans=sum(n);
        System.out.printf("Number of digits are :%d",ans);
    }
    public static int sum(int num){
        if(num/10==0){
            return 1;
        }
        return (1+sum(num/10));
    }
}
