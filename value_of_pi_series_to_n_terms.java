import java.util.Scanner;
class pi{
    int n;
    pi(int m){
        n=m;
    }
    public double result(){
        double sum=0,count=1,term=1;
        for(int i=1;i<=n;i++){
            if(count%2!=0){
                sum=sum+(1/(term*1.0));
            }
            else{
                sum=sum-(1/(term*1.0));
            }
            count++;
            term+=2;
        }
        return sum;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number of terms you want the value of PI :");
        int a=input.nextInt();
        pi obj=new pi(a);
        System.out.printf("The sum of series is :%.5f",4*obj.result());
    }
}
