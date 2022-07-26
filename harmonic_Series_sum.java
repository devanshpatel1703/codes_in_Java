import java.util.Scanner;
class harmonicSum{
    int n;
    harmonicSum(int m){
        n=m;
    }
    public double result(){
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(1/(i*1.0));
        }
        return sum;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the number of terms in harmonic series which you want sum :");
        int a=input.nextInt();
        harmonicSum obj=new harmonicSum(a);
        System.out.printf("The sum of series is :%.3f",obj.result());
    }
}
