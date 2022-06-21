import java.util.Scanner;
class numSum{
    public int sum(int x){
        int sum=0;
        while(x>0){
            sum=sum+(x%10);
            x/=10;
        }
        return (sum);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.printf("Enter a limit :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        numSum obj=new numSum();
        for(int i=1;i<=n;i++){
            int checkSum=obj.sum(i);
            if(i%checkSum==0){
                System.out.printf("%d\n",i);
            }
        }
    }
}
