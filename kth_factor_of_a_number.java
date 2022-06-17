import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,i=0,n,temp=0,count=1,factor=0;
        System.out.print("Enter the number : ");
        num=input.nextInt();
        System.out.print("Enter the factor you want : ");
        n=input.nextInt();
        for(i=1;i<=num/2;i++){
            if(num%i==0){
                if(count<=n){
                    factor=i;
                }
                else if(count>n){
                    break;
                }
                count++;
            }
        }
        System.out.print("The "+n+"th factor is : "+factor);
    }
}
