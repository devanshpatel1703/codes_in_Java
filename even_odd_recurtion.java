import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the range in which you want even odd numbers :");
        int num=input.nextInt();
        System.out.printf("Even numbers :\n");
        even(num,1);
        System.out.printf("Odd numbers :\n");
        odd(num,1);
    }
    public static int even(int n,int r){
        if(r!=n){
            if(r%2==0){
                System.out.printf("%d ",r);
            }
            even(n,r+1);
        }
        return 0;
    }
    public static int odd(int n,int r){
        if(r!=n){
            if(r%2!=0){
                System.out.printf("%d ",r);
            }
            odd(n,r+1);
        }
        return 0;
    }
}
