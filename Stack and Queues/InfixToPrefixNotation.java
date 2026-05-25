//Problem
    
    /*You are given a string s representing an infix expression. Convert this infix expression to a prefix expression.
    
    Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
    Prefix expression: The expression of the form op a b. When an operator comes before its two operands.
    
    Note: The precedence order is as follows: (^) has the highest precedence and is evaluated from right to left. (* and /) come next with left to right associativity, and (+ and -) have the lowest precedence with left to right associativity.
    
    Examples:
    
    Input: s = "a*(b+c)/d"
    Output: /*a+bcd
    Explaination: The infix expression is a*(b+c)/d. First, inside the brackets, b + c becomes +bc. Now the expression looks like a*(+bc)/d. Next, multiply a with (+bc), so it becomes *a+bc. Finally, divide this result by d, so it becomes /*a+bcd.
    Input: s = "(a-b/c)*(a/k-l)"
    Output: *-a/bc-/akl
    Explaination: The infix expression is (a-b/c)*(a/k-l). First, inside the brackets, b/c becomes /bc and a/k becomes /ak.Now the expression looks like (a-/bc) * (/ak-l).Next, handle the subtractions: a-/bc becomes -a/bc, and /ak-l becomes -/akl. Finally, multiply the two results: (-a/bc * -/akl) becomes *-a/bc-/akl.
    Constraints:
    3 ≤ s.length() ≤ 5*103
    s[i] can be an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((, ))*/

//Solution

class Solution {
    public String infixToPrefix(String s) {
        Stack<String> pre = new Stack<>();
        Stack<Character> optr = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' ')continue;
            if(ch=='('){
                optr.push(ch);
            }else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                pre.push(ch+"");
            }else if(ch==')'){
                while(optr.size()>0 && optr.peek()!='('){
                    String v2=pre.pop();
                    String v1=pre.pop();
                    char op=optr.pop();
                    pre.push(op+v1+v2);
                }
                optr.pop();
            }else if(ch=='-' || ch=='+' || ch=='*' || ch=='/' || ch=='^'){
                while(optr.size()>0 && optr.peek()!='(' && (precedence(optr.peek())>precedence(ch) || (precedence(optr.peek())==precedence(ch) && ch!='^'))){
                    String v2=pre.pop();
                    String v1=pre.pop();
                    char op=optr.pop();
                    pre.push(op+v1+v2);
                }
                optr.push(ch);
            }
        }
        while(optr.size()>0){
            String v2=pre.pop();
            String v1=pre.pop();
            char op=optr.pop();
            pre.push(op+v1+v2);
        }
        return pre.peek();
    }
    
    public int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if (ch == '^') {
            return 3;
        }
        return -1;
    }
}
