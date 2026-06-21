//Problem

    /*You are given two square matrices mat1[][] and mat2[][], each of size n × n. You have to multiply these two matrices and return the resulting matrix.
    
    Examples:
    
    Input: mat1[][] = [[1, 1, 1], mat2[][] = [[1, 1, 1],
                     [1, 1, 1],             [1, 1, 1],
                     [1, 1, 1]]             [1, 1, 1]]
    Output: [[3, 3, 3],
            [3, 3, 3],
            [3, 3, 3]]
    Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[3, 3, 3], [3, 3, 3], [3, 3, 3]].
    Input: mat1[][] = [[1, 2], mat2[][] = [[4, 3],
                     [3, 4]]             [2, 1]]
    Output: [[8, 5],
           [20, 13]]
    Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[8, 5], [20, 13]]
    Constraints:
    1 ≤ n ≤ 100
    1 ≤ mat1[i][j], mat2[i][j] ≤ 100*/

//Solution

class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int vari = 0;
                int val = 0;
                while(vari < n){
                    val += mat1[i][vari] * mat2[vari][j];
                    vari++;
                }
                ans.get(i).add(val);
            }
        }
        
        return ans;
    }
}
