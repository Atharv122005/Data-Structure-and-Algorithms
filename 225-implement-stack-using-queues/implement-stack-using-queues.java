class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top = -1;

    public MyStack() {
        
    }
    
    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
        top = x;
    }
    
    public int pop() {
        int poppedValue = -1;
        
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                poppedValue = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                top = poppedValue;
                q2.add(poppedValue);
            }
        } else {
            while (!q2.isEmpty()) {
                poppedValue = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }
                top = poppedValue;
                q1.add(poppedValue);
            }
        }

        return poppedValue;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return (q1.isEmpty() && q2.isEmpty());
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