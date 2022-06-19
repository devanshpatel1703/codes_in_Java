import  java.util.Scanner;
class Main {
    static int nMethod(int x){
        int i=1;
        int sum=0;
        for(i=1;i<=x/2;i++){
            if(x%i==0){
                sum=sum+i;
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
        System.out.printf("Enter a number :");
        int n=input.nextInt();
        System.out.printf("Enter which number you want to check.\n");
        System.out.printf("1. Abundant number.\n2. Deficient number.\n3. Perfect number.\n");
        int ks=input.nextInt();
        switch (ks)
        {
            case 1:
                int ans=nMethod(n);
                if(ans==1){
                    System.out.printf("Yes its Abundant number.");
                }
                else{
                    System.out.printf("No its not Abundant number.");
                }
                break;
            case 2:
                ans=nMethod(n);
                if(ans==-1){
                    System.out.printf("Yes its Deficient.");
                }
                else{
                    System.out.printf("Not Deficient.");
                }
                break;
            case 3:
                ans=nMethod(n);
                if(ans==0){
                    System.out.printf("Yes its Perfect.");
                }
                else{
                    System.out.printf("Not Perfect.");;
                }
                break;
        }
    }
}
