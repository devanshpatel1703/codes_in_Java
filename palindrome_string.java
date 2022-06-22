import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter the string :");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int check=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                check=0;
                break;
            }
        }
        if(check==1){
            System.out.printf("Yes its palindrome.");
        }
        else{
            System.out.printf("Not palindrome.");
        }
    }
}
