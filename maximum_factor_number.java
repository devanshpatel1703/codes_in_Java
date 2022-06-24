import java.util.Scanner;
class HelloWorld {
    public static int factor(int num){
        int fac=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                fac++;
            }
        }
        return (fac);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the limit :");
        int n=input.nextInt();
        int check=0,num=0;
        for(int i=1;i<=n;i++){
            int f=factor(i)+1;
            if(f>check){
                check=f;
                num=i;
            }
        }
        System.out.printf("%d has maximum factors :%d",num,check);
    }
}
