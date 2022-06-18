import java.util.Scanner;
class Main {
    static int square(int n){
        return(n*n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter any number to sq. it :");
        int num=input.nextInt();
        System.out.printf("The sq. is :%d",square(num));
    }
}
