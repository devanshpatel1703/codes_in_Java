import java.util.Scanner;
class sumDivisors{
    public int sum(int x){
        int sum=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }
        return (sum);
    }
}
class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        sumDivisors obj=new sumDivisors();
        System.out.printf("Enter 1st number :");
        int n1=input.nextInt();
        System.out.printf("Enter 2nd number :");
        int n2=input.nextInt();
        int sum_n1=obj.sum(n1);
        int sum_n2=obj.sum(n2);
        if(sum_n1==n2&&sum_n2==n1){
            System.out.printf("Yes %d ans %d are Amicable number Pair.",n1,n2);
        }
        else{
            System.out.printf("No they are not Amicable numbers.");
        }
    }
}
