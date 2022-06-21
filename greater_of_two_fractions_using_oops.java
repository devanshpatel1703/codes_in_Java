import java.util.Scanner;
class checkRatio{
    double x;
    double y;
    public int check(double x,double y){
        if(x>y){
            return 1;
        }
        else if(x<y){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		checkRatio obj=new checkRatio();
		Scanner input=new Scanner(System.in);
		System.out.printf("Enter your 1st fraction :");
		obj.x=input.nextDouble();
		System.out.printf("Enter your 2nd fraction :");
		obj.y=input.nextDouble();
		int ans=obj.check(obj.x,obj.y);
		if(ans==1){
		    System.out.printf("%f is greater than %f.",obj.x,obj.y);
		}
		else if(ans==-1){
		    System.out.printf("%f is greater than %f.",obj.y,obj.x);
		}
		else{
		    System.out.printf("%f is equale to %f.",obj.x,obj.y);
		}
	}
}
