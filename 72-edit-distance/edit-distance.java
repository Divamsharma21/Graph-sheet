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
    public int minDistance(String word1, String word2) {
        int n = word1.length();
       int m = word2.length();
       int[][] dp = new int[n][m];
       for(int[] row:dp){
           Arrays.fill(row,-1);
       } 
        return distance(word1,word2,0,0,dp);
    }

    public int distance(String w1,String w2,int i,int j,int dp[][]){
        // base condition 
        if(i==w1.length()){
            return w2.length()-j;
        }

        if(j==w2.length()){
            return w1.length()-i;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int findans=0;
     
     if(w1.charAt(i)==w2.charAt(j)){
            return distance(w1,w2,i+1,j+1,dp);

        }
        else{
            //insert
            int insert=1+distance(w1,w2,i,j+1,dp);

            // delete
            int delete=1+distance(w1,w2,i+1,j,dp);
            //replace
            int replace=1+distance(w1,w2,i+1,j+1,dp);

         findans=Math.min(insert,Math.min(delete,replace));

        }
     
        return dp[i][j]=findans;
    }
}