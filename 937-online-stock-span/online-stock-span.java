class StockSpanner {
    Stack<Integer> p = new Stack<>();
    Stack<Integer> span = new Stack<>();


    public StockSpanner() {
        
        
    }
    
    public int next(int price) {
        int s = 1;
        while(!p.isEmpty() && p.peek() <= price){
            s+= span.pop();
            p.pop();
        }
        
        p.push(price);
        span.push(s);
        return s;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */