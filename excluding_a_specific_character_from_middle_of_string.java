import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the character which you want to exclude :");
        char ch = input.next().charAt(0);
        String result="";
        result=result+str.charAt(0);
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)==ch){
                continue;
            }
            else{
                result=result+str.charAt(i);
            }
        }
        result=result+str.charAt(str.length()-1);
        System.out.printf("Resultant string is :%s",result);
    }
}
