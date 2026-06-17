//Problem

    /*Given two integers l and r, find the count of numbers x such that:
    
    l ≤ x ≤ r
    The binary representation of x contains exactly 3 set bits.
    Return the total count of such numbers in the given range.
    
    Examples:
    
    Input: l = 11, r = 19 
    Output: 4
    Explanation:
    There are 4 such numbers with 3 set bits in range 11 to 19.
    11 -> 1011, 13 -> 1101, 14 -> 1110, 19 -> 10011. So answer for this test case is 4.
    Input: l = 25, r = 29
    Output: 3
    Explanation: There are 3 such numbers with 3 set bits in range 25 to 29. 
    25 -> 11001, 26 -> 11010, 28 -> 11100. So answer for this test case is 3
    Constraints:
    1 ≤ l ≤ r ≤ 109
    
    */

//Solution

class Solution {
    static List<Integer> v = new ArrayList<>();

    public void precompute() {
        // code here
        
    }

    public int solve(int l, int r) {
        int count = 0;

        for (int i = 0; i < 31; i++) {

            for (int j = i + 1; j < 31; j++) {

                for (int k = j + 1; k < 31; k++) {

                    int num = (1 << i) | (1 << j) | (1 << k);

                    if (num >= l && num <= r) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    
}
