 class Solution {
    public int solveRec(char[][]matrix,int i,int j,int[] max){
        if(i>=matrix.length || j>=matrix[0].length){
            return 0;
        }
        int rightans=solveRec(matrix,i,j+1,max);
        int leftans=solveRec(matrix,i+1,j,max);
        int diagans=solveRec(matrix,i+1,j+1,max);
        if(matrix[i][j]=='1'){
            int ans=1+Math.min(Math.min(rightans,leftans),diagans);
            max[0]=Math.max(ans,max[0]);
            return ans;
        }else{
            return 0;
        }
    }
    public int solveMem(char[][]matrix,int i,int j,int[] max,int dp[][]){
        if(i>=matrix.length || j>=matrix[0].length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int rightans=solveMem(matrix,i,j+1,max,dp);
        int leftans=solveMem(matrix,i+1,j,max,dp);
        int diagans=solveMem(matrix,i+1,j+1,max,dp);
        if(matrix[i][j]=='1'){
            dp[i][j]=1+Math.min(Math.min(rightans,leftans),diagans);
            max[0]=Math.max(dp[i][j],max[0]);
            return dp[i][j];
        }else{
            return dp[i][j]= 0;
        }
    }
    public int maximalSquare(char[][] matrix) {
        int max[]=new int[1];
        max[0]=0;
        //int ans=solveRec(matrix,0,0,max);
        //return max[0]*max[0];

        int dp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int a=solveMem(matrix,0,0,max,dp);
        return max[0]*max[0];
    }
}