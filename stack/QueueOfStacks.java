class QueueOfStacks {

    Deque<Integer> pushStack;
    Deque<Integer> popStack;

    public MyQueue() {
        this.pushStack = new ArrayDeque<>();
        this.popStack = new ArrayDeque<>();
    }

    public void push(int x) {
        shift(popStack, pushStack);
        pushStack.push(x);
    }

    public int pop() {
        shift(pushStack, popStack);
        return popStack.pop();
    }

    public int peek() {
        shift(pushStack, popStack);
        return popStack.peek();
    }

    public boolean empty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

    private static void shift(Deque<Integer> from, Deque<Integer> to) {
        while (from.peek() != null) {
            to.push(from.pop());
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