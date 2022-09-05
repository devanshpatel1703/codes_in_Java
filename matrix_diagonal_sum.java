class Solution {
    public int diagonalSum(int[][] mat){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
            int r=mat.length-i-1;
            int c=i;
            sum=sum+mat[r][c];
        }
        if(mat.length%2==0){
            return (sum);
        }
        int r=mat.length/2;
        return (sum-mat[r][r]);
    }
}
