//Problem

    /*You are given a string s representing an infix expression. Convert this infix expression to a postfix expression.
    
    Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
    Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
    Note: The precedence order is as follows: (^) has the highest precedence and is evaluated from right to left, (* and /) come next with left to right associativity, and (+ and -) have the lowest precedence with left to right associativity.
    
    Examples :
    
    Input: s = "a*(b+c)/d"
    Output: abc+*d/
    Explanation: The expression is a*(b+c)/d. First, inside the brackets, b+c becomes bc+. Now the expression looks like a*(bc+)/d. Next, multiply a with (bc+), so it becomes abc+* . Finally, divide this result by d, so it becomes abc+*d/.
    Input: s = "a+b*c+d"
    Output: abc*+d+
    Explanation: The expression a+b*c+d is converted by first doing b*c -> bc*, then adding a -> abc*+, and finally adding d -> abc*+d+.
    Input: s = "(a+b)*(c+d)"
    Output: ab+cd+*
    Explanation: The expression (a+b)*(c+d) is converted by first doing (a+b) -> ab+, then doing (c+d) -> cd+, and finally the expression ab+*cd+ becomes ab+cd+*. 
    Constraints:
    1 ≤ s.length ≤ 5*103
    s[i] can be an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((, ))
    
    */

//Solution

class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('-', 1);
        map.put('+', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);
        
        for(char ch : s.toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') ){
                sb.append(ch);
            } else if (ch == '('){
                st.push(ch);
            } else if (ch == ')'){
                while(st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
            } else {
                while(!st.isEmpty() && st.peek() != '(' && (map.get(st.peek()) > map.get(ch) || (map.get(st.peek()).equals(map.get(ch)) && ch != '^'))){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
}
