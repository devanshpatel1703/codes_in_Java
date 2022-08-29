import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.printf("Enter initial seed :");
        int s=input.nextInt();
        System.out.printf("Enter the  number of elements you want to print : :");
        int n=input.nextInt();
        System.out.printf("The hailstorm sequence is :\n");
        for(int i=1;i<=n;i++){
            System.out.printf("%d ",s);
            if(s%2==0){
                s/=2;
            }
            else{
                s*=3;
                s+=1;
            }
        }
    }
}
