import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("Enter 1st sting :"); 
        Scanner input = new Scanner (System.in);
        String str1=input.next();
        System.out.printf("Enter 2nd sting :"); 
        String str2=input.next();
        String ans="";
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                ans=ans+str1.charAt(i);
                ans=ans+str2.charAt(i);
            }
        }
        else if(str1.length()>str2.length()){
            for(int i=0;i<str1.length();i++){
                if(i<str2.length()){
                    ans=ans+str1.charAt(i);
                    ans=ans+str2.charAt(i);
                }
                else{
                    ans=ans+str1.charAt(i);
                }
            }
        }
        else{
            for(int i=0;i<str2.length();i++){
                if(i<str1.length()){
                    ans=ans+str1.charAt(i);
                    ans=ans+str2.charAt(i);
                }
                else{
                    ans=ans+str1.charAt(i);
                }
            }
        }
        System.out.printf("The resultant string is :%s",ans);
    }
}
