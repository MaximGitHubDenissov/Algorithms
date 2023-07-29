package HW_3;

/**
 * Класс двунаправленный связанный список
 * 
 */
public class LinkedList<T> {
    private Node head;
    private Node tail;

    public class Node {
        private T value;
        private Node next;
        private Node previous;
    }

    public void addElement(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

    }

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }

        return stringBuilder.toString();
    }

}
