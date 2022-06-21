import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number :");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int num=i,zero=0,r;
            while(num>0){
                r=num%10;
                if(r==0){
                    zero++;
                    break;
                }
                num/=10;
            }
            if(zero>0){
                System.out.printf("%d\n",i);
            }
        }
    }
}
