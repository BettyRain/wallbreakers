class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len%2 != 0) {
            return false;
        } else if (len==0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>(); 
        for (int i=0; i<len; i++){
            if (s.charAt(i)==('{')) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i)==('}')) {
                if ((stack.size()>0) && (stack.peek() == '{')) {
                    stack.pop(); 
                } else {
                    return false;
                }
            } else if (s.charAt(i)==('(')) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i)==(')')) {
                if ((stack.size()>0) && (stack.peek() == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i)==('[')) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i)==(']')) {
                if ((stack.size()>0) && (stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }   
        }
        
        if (stack.size()==0) {
            return true;
        } else {
            return false;
        }
    }
}