class Solution {
    //      int ans;
    // public int minDistance(String word1, String word2) {
    //     return solve(word1,word2,0,0);

    // }

    // public int solve(String w1,String w2,int i,int j){
    //     if(i==w1.length()) return w2.length()-j;

    //     if(j==w2.length()) return w1.length()-i;

    //     if(w1.charAt(i)==w2.charAt(j)){
    //        return solve(w1,w2,i+1,j+1);
    //     }

    //     else{
    //         int insertAns=1+solve(w1,w2,i,j+1);
    //         int deleteAns=1+solve(w1,w2,i+1,j);
    //         int replaceAns=1+solve(w1,w2,i+1,j+1);
    //       ans =Math.min(insertAns,Math.min(deleteAns,replaceAns));
    //     }

    //     return ans;

    // this is memo soltuion


    // public int minDistance(String word1, String word2) {
    //     int n = word1.length();
    //    int m = word2.length();
    //    int[][] dp = new int[n][m];
    //    for(int[] row:dp){
    //        Arrays.fill(row,-1);
    //    } 
    //     return distance(word1,word2,0,0,dp);
    // }

    // public int distance(String w1,String w2,int i,int j,int dp[][]){
    //     // base condition 
    //     if(i==w1.length()){
    //         return w2.length()-j;
    //     }

    //     if(j==w2.length()){
    //         return w1.length()-i;
    //     }

    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     int findans=0;
     
    //  if(w1.charAt(i)==w2.charAt(j)){
    //         return distance(w1,w2,i+1,j+1,dp);

    //     }
    //     else{
    //         //insert
    //         int insert=1+distance(w1,w2,i,j+1,dp);

    //         // delete
    //         int delete=1+distance(w1,w2,i+1,j,dp);
    //         //replace
    //         int replace=1+distance(w1,w2,i+1,j+1,dp);

    //      findans=Math.min(insert,Math.min(delete,replace));

    //     }
     
    //     return dp[i][j]=findans;


    // this is tabulation

     public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0){
                    dp[0][j] = j;
                    continue;
                }
                if(j==0){
                    dp[i][0] = i;
                    continue;
                }
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1+Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}