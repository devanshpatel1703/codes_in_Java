import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the number of prefix character :");
        int check=input.nextInt();
        System.out.printf("You asked for sub-string %s.\n",str.substring(0,check));
        String temp="";
        temp=str.substring(0,check);
        str=str.substring(check);
        int ans=str.indexOf(temp);
        if(ans>0){
            System.out.printf("Yes the prefix is present.");   
        }
        else{
            System.out.printf("No the prefix is not present.");
        }
    }
}
