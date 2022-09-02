public class Main
{
	public static void main(String[] args) {
	    int [][] a = new int [2][];//Array has 2 rows and those elements in rows are further arrays.
	    a[0]=new int[2];//Here we are saying that 0th row element of array is another array of size 2.
	    a[1]=new int[3];//Here we are saying that 1th row element of array is another array of size 2.
	    a[0][0]=1;
	    a[0][1]=2;
	    a[1][0]=3;
	    a[1][1]=4;
	    a[1][2]=5;
	}
}
