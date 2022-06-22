import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter string :");
        String str=input.nextLine();
        int spc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spc++;
            }
        }
        System.out.printf("The words are :%d",spc+1);
    }
}
