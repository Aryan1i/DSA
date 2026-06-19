//Problem

    /*Given an integer n, return the first n elements of Recaman’s sequence. It starts with 0 as the first term. The (n+1)th term is calculated as previous term - n (if positive and not already in sequence); otherwise, use previous term + n.
    
    It is recursively defined as below:
    Let a(n) denote the (n+1)th term. (0 being the 1st term).
    a(0) = 0
    a(n) = a(n-1) - n, if a(n-1) - n > 0 and is not included in the sequence previously else a(n-1) + n.
    
    Examples:
    
    Input: n = 5
    Output: 0 1 3 6 2
    Explaination: 
    a(0) = 0,
    a(1) = a(0)-1 = 0-1 = -1 and -1<0, therefore a(1) = a(0)+1 = 1,
    a(2) = a(1)-2 = 1-2 = -1 and -1<0, therefore a(2) = a(1)+2 = 3,
    a(3) = a(2)-3 = 3-3 = 0 but since 0 is already present in the sequence, a(3) = a(2)+3 = 3+3 = 6,
    a(4) = a(3)-4 = 6-4 = 2.
    Therefore the first 5 elements of Recaman's sequence will be 0 1 3 6 2.
    Input: n = 3
    Output: 0 1 3
    Explaination: As seen in example 1, the first three elements will be 0 1 3.
    Constraints:
    1 ≤ n ≤ 105*/

//Solution

class Solution {
    
    static ArrayList<Integer> recamanSequence(int n) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0);
        set.add(0);

        for (int i = 1; i < n; i++) {
            int prev = ans.get(i - 1);
            int curr = prev - i;

            if (curr > 0 && !set.contains(curr)) {
                ans.add(curr);
            } else {
                curr = prev + i;
                ans.add(curr);
            }

            set.add(curr);
        }

        return ans;
    }
}
