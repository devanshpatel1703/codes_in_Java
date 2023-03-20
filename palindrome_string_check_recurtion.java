public class Main
{
	public static void main(String[] args) {
	    String str="MADAM";
		check(0,str,str.length()-1);
	}
	public static void check(int start,String str,int end){
	    if(start>=end){
	        System.out.printf("Yes.");
	        return;
	    }
	    if(str.charAt(start)!=str.charAt(end)){
	        System.out.printf("No.");
	        return;
	    }
	    check(start+1,str,end-1);
	}
}
