//Problem
    
    /*You are given an array of strings arr[] representing a prefix expression. Your task is to evaluate the expression and return an integer representing its value.
    
    Note: A prefix expression is of the form "operator operand1 operand2" (e.g., + a b).
    And the division operation between two integers always computes the floor value, i.e floor(5 / 3) = 1 and floor(-5 / 3) = -2.
    It is guaranteed that the result of the expression and all intermediate calculations will fit in a 32-bit signed integer.
    
    Examples:
    
    Input: arr[] = ["+", "*", "/", "+", "100", "200", "2", "5", "7"]
    Output: 757
    Explanation: If the expression is converted into an infix expression, it will be ((100 + 200) / 2) * 5 + 7  = 150 * 5 + 7 = 757.
    Input: arr[] = ["^", "+", "2", "3", "2"]
    Output: 25
    Explanation: If the expression is converted into an infix expression, it will be (2 + 3) ^ 2 = 25.
    Constraints:
    3 ≤ arr.size() ≤ 103
    arr[i] is either an operator: "+", "-", "*", "/" or "^", or an integer in the range [-104, 104]*/

//Solution

class Solution {
    public int evaluatePrefix(String[] arr) {
        Stack<Integer> oprnd = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            String st= arr[i];
            if(st.length()==1 && (st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/") || st.equals("^"))){
                int v1=oprnd.pop();
                int v2=oprnd.pop();
                int val=opration(v1,v2,st.charAt(0));
                oprnd.push(val);
            }else{
                oprnd.push(Integer.parseInt(st));
            }
        }
        return oprnd.peek();
    }
    
    public int opration(int v1,int v2,char ch){
        if(ch=='+') return v1+v2;
        else if(ch=='-')return v1-v2;
        else if(ch=='*')return v1*v2;
        else if(ch=='/'){
            int res = v1 / v2;
            if ((v1 ^ v2) < 0 && v1 % v2 != 0) {
                res--;   // adjust toward floor
            }
            return res;
        }
        else return (int)Math.pow(v1,v2);
    }
}
