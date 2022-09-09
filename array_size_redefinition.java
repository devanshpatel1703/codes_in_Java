class HelloWorld {
    public static void main(String[] args) {
        int[] a=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        System.out.printf("Old array :\n");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=new int [5];
        a[4]=4;
        for(int i=0;i<a.length-1;i++){
            a[i]=b[i];
        }
        System.out.printf("\nNew array :\n");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
