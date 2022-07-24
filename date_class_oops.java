class Date{
    private int day,month,year;
    Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int d){
        day=d;
    }
    public void setMonth(int m){
        month=m;
    }
    public void setYear(int y){
        year=y;
    }
    public void setDate(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
public class Main {
   public static void main(String[] args) {
      // Test constructor and toString()
      Date d1 = new Date(1, 2, 2014);
      System.out.println(d1);  // toString()

      // Test Setters and Getters
      d1.setMonth(12);
      d1.setDay(9);
      d1.setYear(2099);
      System.out.println(d1);  // toString()
      System.out.println("Month: " + d1.getMonth());
      System.out.println("Day: " + d1.getDay());
      System.out.println("Year: " + d1.getYear());

      // Test setDate()
      d1.setDate(3, 4, 2016);
      System.out.println(d1);  // toString()
   }
}
