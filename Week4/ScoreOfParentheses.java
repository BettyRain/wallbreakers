class Solution {
    public int scoreOfParentheses(String S) {
        if (S.length()<=1) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int count = 0;
        stack.push(count);
        
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                stack.push(0);
            } else if (ch == ')') {
                count = stack.pop();
                if (count == 0) {
                    count = 1;
                } else {
                    count = 2*count;
                }
                stack.push(stack.pop() + count);
            }
        }
        result = stack.peek();
        return result;
    }
}