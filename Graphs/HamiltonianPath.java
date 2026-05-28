//Problem
    
    /*Given an undirected graph with n vertices and m edges, Determine if a Hamiltonian path exists in the graph.
    
    A Hamiltonian path is a path in an undirected graph that visits each vertex exactly once.
    
    You are provided the following:
    
    
    n: The number of vertices in the graph.
    m: The number of edges in the graph.
    edges[][]: A 2D list where each element edges[i] represents an edge between two vertices edges[i][0] and edges[i][1]. 
    Examples:
    
    Input: n = 4, m = 4, edges[][]= [[1,2], [2,3], [3,4], [2,4]]
    Output: true 
    Explanation: There is a hamiltonian path: 1 -> 2 -> 3 -> 4 
    
    Input: n = 4, m = 3, edges[][] = [[1,2], [2,3], [2,4]] 
    Output: false 
    Explanation: There is no hamiltonian path in the given graph.
     
    Constraints:
    1 ≤ n ≤ 10
    1 ≤ m ≤ 15
    Size of edges[i] is 2
    1 ≤ edges[i][0],edges[i][1] ≤ n*/

//Solution

// User function Template for Java
class Solution {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    
    public boolean check(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[n + 1];
        
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (ArrayList<Integer> e : edges) {
            int u = e.get(0);
            int v = e.get(1);

            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u)); 
        }
        
        for (int i = 1; i <= n; i++) {
            boolean[] visited = new boolean[n + 1];
            visited[i] = true;

            if (dfs(graph, visited, i, 1, n))
                return true;
        }
        return false;
    }
    
    public static boolean dfs(ArrayList<Edge>[] graph ,boolean[] visited,int source, int count, int n){
        if(count == n) return true;
        for(Edge edge : graph[source]){
            if(visited[edge.nbr] == false){
                visited[edge.nbr] = true;
               boolean temp = dfs(graph, visited, edge.nbr, count + 1, n);
               visited[edge.nbr] = false;
               if(temp == true) return true;
            }
        }
        return false;
    }
}
