import java.util.Scanner;
class HelloWorld {
    public static boolean checkDigit(int num,int c){
        int r=0;
        while(num>0){
            r=num%10;
            if(r==c){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the limit :");
        int n=input.nextInt();
        System.out.printf("Enter excluding digit :");
        int digit=input.nextInt();
        for(int i=1;i<=n;i++){
            boolean check=checkDigit(i,digit);
            if(check==true){
                System.out.printf("%d\n",i);
            }
        }
    }
}
