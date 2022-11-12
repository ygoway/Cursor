package HomeWork6;

public class Runner {
    public static void main(String[] args) throws LinkedListEmptyException {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.push(1);
        singlyLinkedList.push(2);
        singlyLinkedList.push(3);
        singlyLinkedList.push(4);

        System.out.println(singlyLinkedList.pop());
        System.out.println(singlyLinkedList.isEmpty());
        System.out.println(singlyLinkedList.top());
        System.out.println(singlyLinkedList.size());
        System.out.println();

        DoublyLinkedListQueue doublyLinkedListQueue = new DoublyLinkedListQueue();

        doublyLinkedListQueue.enqueue(1);
        doublyLinkedListQueue.enqueue(2);
        doublyLinkedListQueue.enqueue(3);
        doublyLinkedListQueue.enqueue(4);

        System.out.println(doublyLinkedListQueue.dequeue());
        System.out.println(doublyLinkedListQueue.isEmpty());
        System.out.println(doublyLinkedListQueue.size());
        System.out.println();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(2);
        doublyLinkedList.add(0, 5);

        System.out.println(doublyLinkedList.size());
        doublyLinkedList.printValue();
    }
}
