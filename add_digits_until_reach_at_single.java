import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int ans=0;
        while(num>0){
            ans=sum(num);
            if(ans<10){
                System.out.printf("Sum is :%d",ans);
                break;
            }
        }
    }
    public static int sum(int n){
        int a=0;
        while(n!=0){
            a=a+n%10;
            n/=10;
        }
        return (a);
    }
}
