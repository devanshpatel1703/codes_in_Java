import java.util.Scanner;
interface cycle{
    public int brake();
    public int speedUp();
}
class avonCycle implements cycle{
    private int speed;
    public void setSpeed(int a){
        speed=a;
    }
    public int brake(){
        return (speed-5);
    }
    public int speedUp(){
        return (speed+5);
    }
}
class Main{
    public static void main(String[] args){
        avonCycle obj=new avonCycle();
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the speed of your cycle :");
        int s=input.nextInt();
        obj.setSpeed(s);
        System.out.printf("Speed after brake :%d\nSpeed after accelerate :%d",obj.brake(),obj.speedUp());
    }
}
