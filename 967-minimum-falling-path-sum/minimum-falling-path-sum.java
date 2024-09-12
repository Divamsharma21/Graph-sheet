 class Solution {
    public int minFallingPathSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] dp = new int[n];
        
        for(int i = 0; i < n; i++)
            dp[i] = mat[0][i];

        for(int i = 1; i < n; i++){
            int[] temp = new int[n];
            for(int j = 0; j < n; j++){
                int left = (j == 0) ? Integer.MAX_VALUE : dp[j - 1];
                int mid = dp[j];
                int right = (j == n - 1) ? Integer.MAX_VALUE : dp[j + 1];
                
                temp[j] = Math.min(mid, Math.min(left, right)) + mat[i][j];
            }
            dp = temp;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
            min = Math.min(min, dp[i]);
        
        return min;
    }
}