abstract class Marks{
    abstract double getPercentage();
}
class studentA extends Marks{
    int s1,s2,s3;
    studentA(int x,int y,int z){
        s1=x;
        s2=y;
        s3=z;
    }
    double getPercentage(){
        return ((s1+s2+s3)/3);
    }
}
class studentB extends Marks{
    int s1,s2,s3,s4;
    studentB(int w,int x,int y,int z){
        s1=w;
        s2=x;
        s3=y;
        s4=z;
    }
    double getPercentage(){
        return ((s1+s2+s3+s4)/4);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Marks objA=new studentA(95,95,95);
        Marks objB=new studentB(96,96,96,96);
        System.out.printf("The percentage of student A :%.2f\n",objA.getPercentage());
        System.out.printf("The percentage of student B :%.2f\n",objB.getPercentage());
    }
}
