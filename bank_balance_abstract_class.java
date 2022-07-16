abstract class Bank{
    abstract int getBalance();
}
class BankA extends Bank{
    int a=100;
    public int getBalance(){
        return (a);
    }
}
class BankB extends Bank{
    int b=150;
    public int getBalance(){
        return (b);
    }
}
class BankC extends Bank{
    int c=200;
    public int getBalance(){
        return (c);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Bank a=new BankA();
        Bank b=new BankB();
        Bank c=new BankC();
        System.out.printf("Bank A balance =%d.\n",a.getBalance());
        System.out.printf("Bank B balance =%d.\n",b.getBalance());
        System.out.printf("Bank C balance =%d.\n",c.getBalance());
    }
}
