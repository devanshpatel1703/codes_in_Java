import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number :");
        int n=input.nextInt();
        for(int i=1;i<n;i++){
            int sum=1;
            while(sum<i){
                sum=sum*2;
            }
            if(sum-1==i){
                System.out.printf("%d\n",i);
            }
        }       
    }
}
