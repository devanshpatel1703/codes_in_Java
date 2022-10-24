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
        if (list.contains("green")) {
            System.out.println("\nFound the element");
        } 
        else
        {
        System.out.println("\nThere is no such element");
        }
    }
}
