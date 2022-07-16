abstract class animals{
    abstract public void cats();
    abstract public void dogs();
}
class Cats extends animals{
    public void cats(){
        System.out.printf("Meow meow.\n");
    }
    public void dogs(){
        
    }
}
class Dogs extends animals{
    public void dogs(){
        System.out.printf("Woof Woof.");
    }
    public void cats(){
        
    }
}
class HelloWorld {
    public static void main(String[] args) {
        animals obj_c=new Cats();
        animals obj_d=new Dogs();
        obj_c.cats();
        obj_d.dogs();
    }
}
