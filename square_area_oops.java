import java.util.Scanner;
class area
{
    int side;
    public int sqArea(int x){
        return (x*x);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		area obj=new area();
		System.out.printf("Enter the side of square :");
		obj.side=input.nextInt();
		System.out.printf("Area of sq. with side %d is = %d",obj.side,obj.sqArea(obj.side));
	}
}
