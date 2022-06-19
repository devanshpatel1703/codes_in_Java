import  java.util.Scanner;
class Main {
    static int nMethod(int x){
        int j=1;
        int sum=0;
        for(j=1;j<=x/2;j++){
            if(x%j==0){
                sum=sum+j;
            }
        }
        if(sum>x){
            return 1;
        }
        else if(sum<x){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.printf("Abundant numbers  from 1 to 1000.\n");
        int check=0;
        for(int i=1;i<=1000;i++){
            check=nMethod(i);
            if(check==-1){
                System.out.printf("%d ",i);
            }
        }
        System.out.printf("Deficient numbers  from 1 to 1000.\n");
        for(int i=1;i<=1000;i++){
            check=nMethod(i);
            if(check==1){
                System.out.printf("%d ",i);
            }
        }
        System.out.printf("Perfect numbers  from 1 to 1000.\n");
        for(int i=1;i<=1000;i++){
            check=nMethod(i);
            if(check==0){
                System.out.printf("%d ",i);
            }
        }
    }
}
