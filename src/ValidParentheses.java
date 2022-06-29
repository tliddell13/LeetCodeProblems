/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        int check = 0;
        while(s.length()>0){
            check = s.length();
            s=s.replace("()", "");
            s=s.replace("[]", "");
            s=s.replace("{}", "");
            if(check == s.length()){
                return false;
            }
        }
        return true;

    }
}
