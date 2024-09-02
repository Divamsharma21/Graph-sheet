class Solution {
    public int findCircleNum(int[][] city) {
        int n = city.length;
        int[] vis = new int[n];
        int count = 0;
        for (int i = 0; i < city.length; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, vis, city);
            }
        }
        return count;
    }

    public void dfs(int node, int[] vis, int[][] city) {
        vis[node] = 1;

        for (int i = 0; i < city[node].length; i++) {
            if (city[node][i] == 1 && vis[i] == 0) {

                dfs(i, vis, city);

            }
        }
    }
}