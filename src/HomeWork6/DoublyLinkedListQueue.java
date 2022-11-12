package HomeWork6;

public class DoublyLinkedListQueue {
    private Node front, rear;
    private int size;

    private class Node {
        int value;
        Node next;
    }

    public DoublyLinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int value) {
        Node oldRear = rear;
        rear = new Node();
        rear.value = value;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
        System.out.println(value + " added to the queue");
    }

    public int dequeue() {
        int value = front.value;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        size--;
        System.out.println(value + " removed from the queue");
        return value;
    }

    public int size() {
        return size;
    }
}
