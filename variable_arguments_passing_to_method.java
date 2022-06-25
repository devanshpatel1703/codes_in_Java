import java.util.Scanner;
class Main{
    public static int sum(int...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=1,b=1,c=1,d=1;
        System.out.printf("The sum after 4 aguments :%d",sum(a,b,c,d));
        System.out.printf("\n");
        System.out.printf("The sum after 2 aguments :%d",sum(a,b));
    }
}
