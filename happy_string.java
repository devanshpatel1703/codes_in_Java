import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        System.out.printf("Enter the character you want check happy :");
        String ch=input.next();
        int temp=0;
        System.out.printf("%d\n",str.length());
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                temp=1;
                break;
            }
        }
        if(temp==1){
            System.out.printf("Yes it is happy.");
        }
        else{
            System.out.printf("No it is not happy.");
        }
    }
}
