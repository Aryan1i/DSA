//Problem
    
    /*Given a number n, print a sequence of numbers starting from n. Each next number in the sequence is n - 5, and this continues recursively until the number becomes less than or equal to 0. After that, print the sequence in reverse order, adding 5 each time, until it reaches back to the original number n.
    Note: You must not use loops.
    
    Examples:
    
    Input: n = -16
    Output: [-16]
    Explanation: Since -16 is less than zero so it will remain same.
    Input: n = 10
    Output: [10, 5, 0, 5, 10]
    Explanation: The value decreases until it is greater or equal to 0. After that it increases and stops when it becomes 10 again.
    Constraints:
    -105 ≤ n ≤ 105*/

//Solution

class Solution {
    
    public ArrayList<Integer> pattern(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        solve(list, n);
        return list;
    }
    
    public void solve(ArrayList<Integer> list, int n){
        if(n > 0){
            list.add(n);
            solve(list, n - 5);
        }
        
        list.add(n);
        
    }
}
