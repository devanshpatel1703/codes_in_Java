import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        float n=0;
        int length=str.length()-1;
        while(str.charAt(length)!= '.'){
            n/=10;
            float num='0' - str.charAt(length);
            num=num/10;
            n=n+num;
            length--;
        }
        n*=(-1);
        int integer=0;
        int i=0;
        while(str.charAt(i)!='.'){
            integer=integer*10+('0'-str.charAt(i));
            i++;
        }
        integer*=(-1);
        n=n+integer;
        System.out.printf("%s in Float format is :%f",str,n);
    }
}
