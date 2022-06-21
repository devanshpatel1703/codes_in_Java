import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the limit :");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            int x=1;
            while(x*(x+1)<=i){
                if(x*(x+1)==i){
                    System.out.printf("%d\n",i);
                }
                x++;
            }
        }
    }
}
