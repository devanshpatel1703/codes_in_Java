public class Main{
	public static void main(String[] args) {
	    String str="aabcaa";
	    System.out.printf("%d",count(str,'a',0));;
	}
	public static int count(String str,char ch,int i){
	    if(i==str.length()){
	        return 0;
	    }
	    if(str.charAt(i)==ch){
	        return 1+count(str,ch,i+1);
	    }
	    else{
	        return count(str,ch,i+1);
	    }
	}
}
