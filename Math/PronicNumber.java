//Problem
    
    /*A pronic number is a number which is the product of two consecutive integers. Find all Pronic Numbers less than  or equal to the given integer N.
    The first few Pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132 and so on.
    
    
    Example 1:
    
    Input:
    N = 6
    Output:
    0 2 6
    Explanation:
    0 is the product of 0 and 1.
    2 is the product of 1 and 2.
    6 is the product of 2 and 3.
    
    Example 2:
    
    Input:
    N = 56
    Output:
    0 2 6 12 20 30 42 56
    Explanation:
    0 is the product of 0 and 1.
    2 is the product of 1 and 2.
    6 is the product of 2 and 3.
    12 is the product of 3 and 4.
    and so on.
    Constraints: 
    1 <= N <= 105*/

//Solution

class Solution {
    static ArrayList<Integer> pronicNumbers(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 1; ; i++){
            int val = i * (i - 1);
            if(val > N){
                break;
            }
            ans.add(val);
        }
        
        return ans;
    }
}
