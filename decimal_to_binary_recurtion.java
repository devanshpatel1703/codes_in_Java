import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number to find its binary :");
        int num=input.nextInt();
        System.out.printf("The binary in reverse order is :\n");
        bin(num);
    }
    public static int bin(int n){
        if(n!=0){
            if(n==2){
                System.out.printf("%d %d ",0,1);
                return 0;
            }
            else{
                System.out.printf("%d ",n%2);
                bin(n/2);
            }
        }
        return 0;
    }
}
