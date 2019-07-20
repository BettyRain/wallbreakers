class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (String type : ops){
            if (isInteger(type)){
                stack.push(Integer.parseInt(type));
                result += Integer.parseInt(type); 
            } else if (type.equals("+")){
                int element1 = (Integer) stack.pop();
                int element2 = (Integer) stack.pop();
                int sum = element1 + element2;
                stack.push(element2);
                stack.push(element1);
                stack.push(sum);
                result += sum;
            } else if (type.equals("D")){
                int element = (Integer) stack.peek();
                stack.push(element*2);
                result += element*2;
            } else if (type.equals("C")){                
                int element = (Integer) stack.pop();
                result += -element;                   
            } else {
                System.out.println("Enter Error");
            }
        }
        return result;        
    }
    
    public boolean isInteger(String strNum) {
        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}