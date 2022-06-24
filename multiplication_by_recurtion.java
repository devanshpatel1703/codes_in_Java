import java.util.Scanner;
class HelloWorld {
    public static int product(int a,int b,int m){
        if(b==0){
            return 0;
        }
        return(a+product(a,b-1,m));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter 1st number :");
        int n1=input.nextInt();
        System.out.printf("Enter 2nd number :");
        int n2=input.nextInt();
        int ans=product(n1,n2,0);
        System.out.printf("The product is :%d",ans);
    }
}
