class DequeCircularArray {
    private int[] arr;
    private int front;
    private int rear;
    private int cap;
    private int size = 0;

    public MyCircularDeque(int k) {
        cap = k;
        arr = new int[cap];
        front = 0;
        rear = 1;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        front = ++front % cap;
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        rear = (--rear + cap) % cap;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (--front + cap) % cap;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear = ++rear % cap;
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == cap;
    }
}