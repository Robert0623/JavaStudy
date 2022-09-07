package practice.queue;

import java.util.ArrayList;

//ArrayList로 Queue 구현
public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }
    public T dequeue() {
        if(queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println("mq.dequeue() = " + mq.dequeue());
        System.out.println("mq.dequeue() = " + mq.dequeue());
        System.out.println("mq.dequeue() = " + mq.dequeue());
    }
}
