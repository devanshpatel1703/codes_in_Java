interface GPS{
    public void gps();
}
interface CAMERA{
    public void camera();
}
interface MUSICPLAYER{
    public void musicPlayer();
}
abstract class smartPhone{
    int a=5000;
    abstract public void smartPhone();
}
class Phone extends smartPhone implements GPS,CAMERA,MUSICPLAYER{
    public void gps(){
        System.out.printf("I have GPS.\n");
    }
    public void camera(){
        System.out.printf("I have camera.\n");
    }
    public void musicPlayer(){
        System.out.printf("I have music player.\n");
    }
    public void smartPhone(){
        System.out.printf("I am a smartphone.\nCost :%d",a);
    }
}
class Main {
    public static void main(String[] args) {
        Phone obj=new Phone();
        obj.gps();obj.camera();obj.musicPlayer();obj.smartPhone();
    }
}
