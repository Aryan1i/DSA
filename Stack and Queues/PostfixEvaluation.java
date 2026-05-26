//Problem
    
    /*You are given an array of strings arr[] that represents a valid arithmetic expression written in Reverse Polish Notation (Postfix Notation). Your task is to evaluate the expression and return an integer representing its value.
    
    Note: A postfix expression is of the form operand1 operand2 operator (e.g., "a b +"). 
    And the division operation between two integers always computes the floor value, i.e floor(5 / 3) = 1 and floor(-5 / 3) = -2.
    It is guaranteed that the result of the expression and all intermediate calculations will fit in a 32-bit signed integer.
    
    Examples:
    
    Input: arr[] = ["2", "3", "1", "*", "+", "9", "-"]
    Output: -4
    Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.
    Input: arr[] = ["2", "3", "^", "1", "+"]
    Output: 9
    Explanation: If the expression is converted into an infix expression, it will be 2 ^ 3 + 1 = 8 + 1 = 9.
    Constraints:
    3 ≤ arr.size() ≤ 103
    arr[i] is either an operator: "+", "-", "*", "/" or "^", or an integer in the range [-104, 104]
    
    */

//Solution

class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> oprnd = new Stack<>();
        Stack<Character> oprtr = new Stack<>();
        for(int i=0;i<arr.length;i++){
            String st = arr[i];

            if(isOprtr(st)){
                int v2=oprnd.pop();
                int v1=oprnd.pop();
                int val=evaluate(v1,v2,st);
                oprnd.push(val);
            }else {
                oprnd.push(Integer.parseInt(st));
            }
        }
        return oprnd.peek();
    }
    
    public boolean isOprtr(String st){
        if(st.equals("^") || st.equals("+") || st.equals("-") || st.equals("*") ||st.equals("/")){
            return true;
        }else{
            return false;
        }
    }
    
    public int evaluate(int v1,int v2,String st){
        if(st.equals("^")) return (int)Math.pow(v1,v2);
        else if(st.equals("+")) return v1+v2;
        else if(st.equals("-")) return v1-v2;
        else if(st.equals("*")) return v1*v2;
        else return Math.floorDiv(v1,v2);
    }
}
