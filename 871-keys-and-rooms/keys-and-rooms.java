class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        vis[0] = true;
        dfs(0, rooms, vis);
        for (int i = 0; i < rooms.size(); i++) {
            if (!vis[i]) {
                return false;
            }
        }
        return true;
    }

    public void dfs(int node, List<List<Integer>> rooms, boolean[] vis) {
        vis[node] = true;
        for (int it : rooms.get(node)) {
            if (vis[it] == false) {
                vis[it] = true;
                dfs(it, rooms, vis);

            }
        }
    }
}