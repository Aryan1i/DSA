//Question
/*  
    1. You are given a string exp representing an expression.
    2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
    3. But, some of the pair of brackets maybe extra/needless. 
    4. You are required to print true if you detect extra brackets and false otherwise.
    
    e.g.'
    ((a + b) + (c + d)) -> false
    (a + b) + ((c + d)) -> true
    Input Format
    A string str
    Output Format
    true or false
    Constraints
    0 <= str.length <= 100
*/

//Solution

import java.util.Stack; 
import java.util.Scanner;
public class DuplicateBrackte {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String qes = scn.nextLine();

        Stack<Character> st = new Stack<>();

         System.out.println(qes.charAt(0));

        for(int i = 0;i<qes.length() ; i++){
            char ch = qes.charAt(i);
            if( ch == ')' ){
                if(st.peek() == '('){
                    System.out.println("Duplicate element found");
                    return;
                } else {
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            } 
        } 

        if(st.size()==0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    } 
}
