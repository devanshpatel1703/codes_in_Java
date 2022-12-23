import java.util.*;
class Main{
    public static void main(String[] args){
      String str="";
      Scanner input=new Scanner(System.in);
      System.out.printf("Enter the string :");
      str=input.next();
      Stack<Character> stk=new Stack<>();
      for(int i=0;i<str.length();i++){
        stk.push(str.charAt(i));
      }
      int i=0;
      String ans="";
      while(!stk.isEmpty()){
        ans=ans+stk.pop();
      }
      System.out.printf("The reversed String is : %s",ans);
    }
}
