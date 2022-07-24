class Time{
    private int hour,minute,second;
    Time(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    public void setHour(int h){
        hour=h;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int m){
        minute=m;
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int s){
        second=s;
    }
    public int getSecond(){
        return second;
    }
    public void setTime(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    public String toString(){
        return hour+":"+minute+":"+second;
    }
    public String nextSecond(){
        hour+=1;
        minute+=1;
        second+=1;
        return hour+":"+minute+":"+second;
    }
    public String previousSecond(){
        hour-=1;
        minute-=1;
        second-=1;
        return hour+":"+minute+":"+second;
    }
}
public class Main {
   public static void main(String[] args) {
      // Test constructors and toString()
      Time t1 = new Time(1, 2, 3);
      System.out.println(t1);  // toString()

      // Test Setters and Getters
      t1.setHour(4);
      t1.setMinute(5);
      t1.setSecond(6);
      System.out.println(t1);  // toString()
      System.out.println("Hour: " + t1.getHour());
      System.out.println("Minute: " + t1.getMinute());
      System.out.println("Second: " + t1.getSecond());

      // Test setTime()
      t1.setTime(23, 59, 58);
      System.out.println(t1);  // toString()

      // Test nextSecond();
      System.out.println(t1.nextSecond());
      

      // Test previousSecond()
      System.out.println(t1.previousSecond());
      
   }
}
