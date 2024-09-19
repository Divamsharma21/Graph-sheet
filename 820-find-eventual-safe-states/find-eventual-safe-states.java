 class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        if(graph == null || graph.length == 0)  return list;
        int n = graph.length;
        int[] vis = new int[n];
  
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, vis))    list.add(i);
     
        }

        return list;
    }

    public boolean dfs(int node, int[][] graph, int[] vis) {

        if (vis[node] != 0) {
            return vis[node] == 1;
        }

        vis[node] = 2;

        for (int newNode : graph[node]) {
            if (!dfs(newNode, graph, vis)) {
                return false;
            }
        }
        vis[node]=1;
        
        return true;
    }
}

 