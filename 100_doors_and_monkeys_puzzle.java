public class Program
{
    public static void main(String[] args) {
		boolean[] a=new boolean[100];
        for(int i=1;i<=100;i++){
            for(int j=0;j<100;j++){
                if((j+1)%i==0){
                    a[j]= (a[j]==true) ? false : true;
                }
            }
        }
        int c=0;
        for(boolean b : a){
            if(b==true){
                c++;
            }
        }
        System.out.printf("%d",c);
	}
}
