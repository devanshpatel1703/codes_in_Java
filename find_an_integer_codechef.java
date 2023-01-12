import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter 1 no. :");
        int n1=input.nextInt();
        System.out.printf("Enter 2 no. :");
        int n2=input.nextInt();
        for(int i=n2;;i++){
            if((n1+i)%n2==0 && (n2+i)%n1==0){
                System.out.printf("Ans :%d",i);
                break;
            }
        }
    }
}
