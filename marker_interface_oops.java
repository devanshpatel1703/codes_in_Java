interface permission{
    
}
class print implements permission{
    void hello(){
        System.out.printf("Hello\n");
    }
}
class print2{
    void hello2(){
        System.out.printf("Hello without interface.\n");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        print obj=new print();
        if(obj instanceof permission){
            obj.hello();
        }
        else{
            System.out.printf("No permission");
        }
        print2 obj2=new print2();
        if(obj2 instanceof permission){
            obj2.hello2();
        }
        else{
            System.out.printf("No permission");
        }
    }
}
