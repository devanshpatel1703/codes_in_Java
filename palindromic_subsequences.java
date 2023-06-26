import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.printf("%d",odd(s)+even(s));
	}
    public static int odd(String s){
        int c=s.length();
        for(int i=1;i<s.length()-1;i++){
            int l=i-1;
            int r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                c++;
                l--;
                r++;
            }
        }
        return c;
    }
    public static int even(String s){
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
                int l=i-1;
                int r=i+2;
                while((l>=0 && r<s.length()) && s.charAt(l)==s.charAt(r)){
                    c++;
                    l--;
                    r++;
                }
            }
        }
        return c;
    }
}
