public class Main{
	public static void main(String[] args) {
	    int n=12345;
	    System.out.printf("%d",sum(n));;
	}
	public static int sum(int n){
	    if(n==0){
	        return 0;
	    }
	    return n%10 + sum(n/10);
	}
}
