import java.util.Scanner;
class employee{
    private String first_name,last_name;
    private int monthly_pay;
    employee(String  fname,String lname,int pay){
        first_name=fname;
        last_name=lname;
        monthly_pay=pay;
    }
    public String getFirstName(){
        return first_name;
    }
    public String getLastName(){
        return last_name;
    }
    public int getAnnualPay(){
        return (monthly_pay*12);
    }
    public double getRaisedCelery(){
        double amount=getAnnualPay()*0.1;
        return (getAnnualPay()+amount);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the first name :");
        String f=input.next();
        System.out.printf("Enter the last name :");
        String l=input.next();
        System.out.printf("Enter the monthly celery :");
        int c=input.nextInt();
        employee obj=new employee(f,l,c);
        System.out.printf("The annual celery of %s %s is :%d\n",obj.getFirstName(),obj.getLastName(),obj.getAnnualPay());
        System.out.printf("The celery after raise is %.2f",obj.getRaisedCelery());
    }
}
