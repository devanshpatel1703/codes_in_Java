class primeFactor{
    private int num;
    primeFactor(int x){
        num=x;
    }
    void factors(){
        int start=2;
        while(num>1){
            if(num%start==0){
                System.out.printf("%d ",start);
                num/=start;
            }
            else{
                start++;
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        primeFactor obj=new primeFactor(240);
        System.out.printf("The prime factors are :\n")
        obj.factors();
    }
}
