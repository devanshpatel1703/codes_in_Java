class A{
    static int b=1;
    public static void print(){
        System.out.print("You are in static function inside A.\n");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.printf("%d\n",A.b);
		A.print();
	}
}
