class MyQueue {

    Stack firstS;
    Stack secondS;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        firstS = new Stack();
        secondS = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        firstS.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
	    return (int)secondS.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(secondS.empty()) {
            while (!firstS.empty()) {
                secondS.push(firstS.pop());
            }
        }
		
	    return (int)secondS.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if ((firstS.empty())&&(secondS.empty())) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */