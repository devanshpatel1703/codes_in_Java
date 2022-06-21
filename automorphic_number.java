import java.util.Scanner;
class countNum
{
    public int num(int x){
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        return count;
    }    
}
class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        countNum obj=new countNum();
        System.out.printf("Enter the number :");
        int n=input.nextInt();
        int digits=obj.num(n);
        int new_num=0,square=n*n;
        for(int i=1;i<=digits;i++){
            new_num=new_num*10+(square%10);
            square/=10;
        }
        int check=0;
        while(new_num>0){
            check=check*10+(new_num%10);
            new_num/=10;
        }
        if(check==n){
            System.out.printf("Yes its automorphic number.\nAs %d is same as the last digit of its square %d.",n,n*n);
        }
        else{
            System.out.printf("Not an automorphic number.");
        }
    }
}
