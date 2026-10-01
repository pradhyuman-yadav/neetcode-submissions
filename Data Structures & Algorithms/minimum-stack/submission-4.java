class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if(!stack.isEmpty()) stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        return 0; 
    }
    
    public int getMin() {
        if(!stack.isEmpty()) {
            return Collections.min(stack);
        }
        return 0;
    }
}
