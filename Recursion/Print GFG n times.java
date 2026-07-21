//Problem
    
    /*Given a positive number n, print the string "GFG" exactly n times separated by a single space.
    
    Examples:
    
    Input: n = 5
    Output:
    GFG GFG GFG GFG GFG
    Input: 3
    Output:
    GFG GFG GFG
    Constraint:
    1 ≤ n ≤ 103*/

//Solution

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }
    
    public static void print(int n){
        if(n == 0) return ;
        System.out.print("GFG ");
        print(n - 1);
    }
}
