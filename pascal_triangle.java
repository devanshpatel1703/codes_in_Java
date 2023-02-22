import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter the rows you want :");
        int r=input.nextInt();
        int[][] triangle = new int[r][r];
        triangle[0][0]=1;
        triangle[1][0]=1;
        triangle[1][1]=1;
        for(int i=2;i<r;i++){
            triangle[i][0]=1;
            triangle[i][i]=1;
            for(int j=1;j<i;j++){
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
        }
        for(int i=0;i<triangle.length;i++){
            for(int k=1;k<=r-i-1;k++){
                    System.out.printf(" ");
                }
            for(int j=0;j<triangle[i].length;j++){
                if(triangle[i][j]==0){
                    continue;
                }
                System.out.printf("%d ",triangle[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
