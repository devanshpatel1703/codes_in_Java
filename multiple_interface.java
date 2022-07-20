import java.util.Scanner;
interface fuck{
    public int pornstar1();
    public int pornstar2();
}
interface fuck2{
    public int pornstar3();
    public int pornstar4();
}
class pornstar implements fuck,fuck2{
    String n;
    pornstar(String s){
        n=s;
    }
    @Override
    public int pornstar1(){
        System.out.printf("%s wants to fuck Alanah rae.\n",n);
        return 0;
    }
    public int pornstar2(){
        System.out.printf("%s wants to fuck Alura jenson.\n",n);
        return 0;
    }
    public int pornstar3(){
        System.out.printf("%s wants to fuck Angela white.\n",n);
        return 0;
    }
    public int pornstar4(){
        System.out.printf("%s wants to fuck Sasha grey.\n",n);
        return 0;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter your name :");
        String name=input.next();
        pornstar obj=new pornstar(name);
        obj.pornstar1();
        obj.pornstar2();
        obj.pornstar3();
        obj.pornstar4();
    }
}
