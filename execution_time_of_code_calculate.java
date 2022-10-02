class HelloWorld {
    public static void main(String[] args) {
        long t1=System.currentTimeMillis();
        System.out.printf("Current time :%d\n",t1);
        String s="";
        for(int i=0;i<20000;i++){
            s=s+'a';
        }
        System.out.printf("%d ms\n",System.currentTimeMillis()-t1);
        System.out.printf("Current time :%d",System.currentTimeMillis());
    }
}
