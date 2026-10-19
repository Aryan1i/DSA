    //Problem
    
    /*Given a 2D matrix mat[][] of size n x m. Each row in the matrix is sorted in non-decreasing order, merge all the rows and return a single sorted array that contains all the elements of the matrix.
    
    Examples :
    
    Input: mat[][] = [[1, 3, 5, 7], [2, 4, 6, 8], [0, 9, 10, 11]]
    
    Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    Explanation: Merging all elements from the 3 sorted arrays and sorting them results in: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11].
    Input: mat[][] = [[1, 2, 3, 4], [2, 2, 3, 4], [5, 5, 6, 6], [7, 8, 9, 9]]
    
    Output: [1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9] 
    Explanation: Merging all elements from the 4 sorted arrays and sorting them results in:[1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9]
    Constraints:
    1 ≤ n * m ≤ 105
    0 ≤ mat[i][j] ≤ 106*/

//Solution

class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {return Integer.compare(a[0], b[0]);});
        
        for(int i = 0; i < n; i++){
            pq.offer(new int[]{mat[i][0], i, 0});
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(pq.size() > 0){
            int[] temp = pq.poll();
            
            list.add(temp[0]);
            
            if(temp[2] + 1 < m) pq.offer(new int[]{mat[temp[1]][temp[2] + 1],temp[1], temp[2] + 1});
        }
        
        return list;
    }
}
