class MyStack {

    Queue <Integer> firstQ;
    Queue <Integer> secondQ;
    int head;
    
    /** Initialize your data structure here. */
    public MyStack() {
        firstQ = new LinkedList<Integer>();
        secondQ = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        firstQ.add(x);
        head = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (firstQ.size() > 1) {
            head = firstQ.poll();
            secondQ.add(head);
        }
        Queue<Integer> x = firstQ;
        firstQ = secondQ;
        secondQ = x;
        return secondQ.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return head;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return firstQ.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */