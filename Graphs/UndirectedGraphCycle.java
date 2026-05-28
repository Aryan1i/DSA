//Problem
    
    /*Given an undirected graph with V vertices and E edges, represented as a 2D vector edges[][], where each entry edges[i] = [u, v] denotes an edge between vertices u and v, determine whether the graph contains a cycle or not.
    
    Note: The graph can have multiple component.
    
    Examples:
    
    Input: V = 4, E = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]
    Output: true
    Explanation: 
     
    1 -> 2 -> 0 -> 1 is a cycle.
    Input: V = 4, E = 3, edges[][] = [[0, 1], [1, 2], [2, 3]]
    Output: false
    Explanation: 
     
    No cycle in the graph.
    Constraints:
    1 ≤ V, E ≤ 105
    0 ≤ edges[i][0], edges[i][1] < V
    
    */

//Solution

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(visited[i] == false) queue.add(i);
            while(queue.size() > 0){
                int v = queue.remove();
                
                if(visited[v] == true){
                    return true;
                }
                
                visited[v] = true;
                
                for(int val : graph.get(v)){
                    if(visited[val] == false){
                        queue.add(val);
                    }
                }
            }
        }
        
        
        return false;
    }
}
