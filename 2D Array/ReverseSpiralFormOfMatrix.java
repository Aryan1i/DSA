//Problem

    /*Given an n × m matrix, return its elements in reverse spiral order.
    
    Note: Reverse spiral order starts from the center of the matrix (or the closest valid center for even dimensions) and moves outward in a spiral.
    
    Examples :
    
    Input: n = 3, m = 3 
     
    Output: [5, 6, 3, 2, 1, 4, 7, 8, 9]
    Explanation: Spiral form of the matrix in reverse order starts from the centre and goes outward.
    
    Input: n = 4, m = 4
     
    Output: [10, 11, 7, 6, 5, 9, 13, 14, 15, 16, 12, 8, 4, 3, 2, 1]
    Explanation: 
      
    Constraints:
    1 ≤ n, m ≤ 500
    1 ≤ mat[i][j] ≤ 500
    
    */

//Solution

class Solution {
    public List<Integer> reverseSpiral(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                list.add(mat[top][i]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                list.add(mat[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = list.size() - 1; i >= 0; i--){
            ans.add(list.get(i));
        }
        
        return ans;
    }
}
