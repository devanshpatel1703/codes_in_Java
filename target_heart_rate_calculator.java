import java.util.Scanner;
class heartRates{
    private String f,l;
    private int year;
    int maxbeat,age;
    heartRates(String fn,String ln,int y){
        f=fn;
        l=ln;
        year=y;
    }
    public String getFirstName(){
        return f;
    }
    public String getLastName(){
        return l;
    }
    public int getAge(){
        age=2022-year;
        return (age);
    }
    public int getMaxBeat(){
        maxbeat=220-age;
        return (maxbeat);
    }
    public double getLowerBeat(){
        return (maxbeat*0.5);
    }
    public double getUpperBeat(){
        return (maxbeat*0.85);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Please enter your first name :");
        String f_name=input.next();
        System.out.printf("Please enter your last name :");
        String l_name=input.next();
        System.out.printf("Please enter your birth year :");
        int year=input.nextInt();
        heartRates obj=new heartRates(f_name,l_name,year);
        System.out.printf("Hellow Mr. %s %s.\n",obj.getFirstName(),obj.getLastName());
        System.out.printf("Your age is :%d\n",obj.getAge());
        System.out.printf("Your maximum heartbeat should be :%d\n",obj.getMaxBeat());
        System.out.printf("Your heart beat should be in the range of %.0f - %.0f.",obj.getLowerBeat(),obj.getUpperBeat());
        
    }
}
