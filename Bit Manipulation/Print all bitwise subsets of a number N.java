//Problem
    
    /*Given a number N, print all the numbers which are a bitwise subset of the binary representation of N. Bitwise subset of a number N will be the numbers i in the range 0 ≤ i ≤ N which satisfy the below condition:
    N & i == i
    
    Example 1:
    
    Input:
    N = 5
    Output: 5 4 1 0
    Explanation:
       0 & 5 = 0
       1 & 5 = 1
       2 & 5 = 0
       3 & 5 = 1
       4 & 5 = 4
       5 & 5 = 5
      
    Example 2:
    
    Input:
    N = 9
    Output: 9 8 1 0
    
    Your Task:  
    You don't need to read input or print anything. Your task is to complete the function printSubsets() which takes the integer N as input parameters and returns the array of integers that satisfy the above condition.
    
    Expected Time Complexity:  O(K), where K is the number of bitwise subsets of N.
    Expected Auxiliary Space: O(1)
    
    */

//Solution

class Solution {

    ArrayList<Integer> printSubsets(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = N;
        while(i > 0){
            if((N & i) == i){
                ans.add(i);
            }
            i--;
        }
        
        if((N & 0) == 0) ans.add(0);
        
        return ans;
    }
}
