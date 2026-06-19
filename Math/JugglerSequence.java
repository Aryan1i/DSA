//Problem

    /*Juggler Sequence is a series of integers in which the first term starts with a positive integer number a and the remaining terms are generated from the immediate previous term using the below recurrence relation:
    
    Juggler Formula
    
    Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.
    
    Examples:
    
    Input: n = 9
    Output: 9 27 140 11 36 6 2 1
    Explaination: We start with 9 and use 
    above formula to get next terms.
    Input: n = 6
    Output: 6 2 1
    Explaination: 
    [61/2] = 2. 
    [21/2] = 1.
    Constraints:
    1 ≤ n ≤ 100
    
    */

//Solution

class Solution {
    static List<Long> jugglerSequence(long n) {
        
        List<Long> list = new ArrayList<>();
        list.add(n);
        while(n != 1){
            if(n % 2 == 0){
                n = (long)Math.pow(n, 0.5);
                list.add(n);
            } else {
                n = (long)Math.pow(n, 1.5);
                list.add(n);
            }
        }
        
        return list;
    }
}
