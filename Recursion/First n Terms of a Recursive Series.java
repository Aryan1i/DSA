//Problem
    
    /*Geek made a special series that follows recurrence  Tn = (Tn-2)2 - (Tn-1). The first (or T1)  and the second term (or T2) are 0 and 1 respectively, find the first n terms of the series.
    
    Note: Print a white space (" ") after every integer and a newline character after every testcase.
    
    Examples
    
    Input: n = 3
    Output: 0 1 -1
    Explanation: First-term is given as 0 and the second term is 1. So the T3 = (T3-2)2 - (T3-1) = T12 - T2 = 02 - 1 = -1
    Input: n = 6
    Output: 0 1 -1 2 -1 5
    Explanation:
    T1 : 0
    T2 : 1
    T3 : -1
    T4 = (1)2 - (-1) = 2
    T5 = (-1)2 - (2) = 1 - 2 = -1
    T6 = (2)2 - (-1) = 4 + 1 = 5 
    Constraints:
    2 ≤ n ≤ 15*/

//Solution

class Solution {
    static void gfSeries(int n) {

        long a = 0;
        long b = 1;

        System.out.print(a + " ");
        if (n == 1) {
            System.out.println();
            return;
        }

        System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            long c = a * a - b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

        System.out.println();
    }
}
