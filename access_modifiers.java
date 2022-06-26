import java.util.Scanner;
class gettingStarted{
    private int integer;
    private String str;
    public void setInteger(int a){
        integer=a;
    }
    public int getInteger(){
        return (integer);
    }
    public void setString(String s){
        str=s;
    }
    public String getString(){
        return (str);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        gettingStarted obj=new gettingStarted();
        System.out.printf("Enter an integer :");
        int a=input.nextInt();
        obj.setInteger(a);
        System.out.printf("Enter a String :");
        String s=input.next();
        obj.setString(s);
        System.out.printf("The value of integer is :%d\n",obj.getInteger());
        System.out.printf("The value of String is :%s",obj.getString());
    }
}
