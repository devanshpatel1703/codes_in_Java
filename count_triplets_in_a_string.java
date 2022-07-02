import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the string :");
        String str=input.nextLine();
        int count=0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
                count++;
            }
        }
        System.out.printf("The number of triplets are :%d",count);
    }
}
