import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("red");
        list.add("orange");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        for(String a:list){
            System.out.printf("%s\n",a);
        }
        System.out.printf("The new array list is :\n");
        list.set(0,"black");
        for(String a:list){
            System.out.printf("%s\n",a);
        }
    }
}
