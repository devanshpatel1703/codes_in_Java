import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the number till you want the sum :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.printf("0\n1\n");
        int ans=sum(n-2,0,1);
    }
    public static int sum(int count,int f_term,int s_term){
        if(count==0){
            return 0;
        }
        System.out.printf("%d\n",f_term+s_term);
        sum(count-1,s_term,f_term+s_term);
        return 0;
    }
}
