package HomeWork6;

public class SinglyLinkedList {
    private Node head;
    private int size = 0;

    private static class Node {
        int value;
        Node next;
    }

    public SinglyLinkedList() {
        head = null;
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
        size++;
    }

    public int pop() throws LinkedListEmptyException {
        if (head == null) {
            throw new LinkedListEmptyException();
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int top() throws LinkedListEmptyException {
        if (head == null) {
            throw new LinkedListEmptyException();
        }
        return head.value;
    }

    public int size() {
        return size;
    }
}

