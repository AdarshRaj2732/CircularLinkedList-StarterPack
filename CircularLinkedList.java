/* =========================================================
   FILE: CircularLinkedList.java
   DO NOT MODIFY THIS FILE
   ========================================================= */

/*
 * Generic Circular Linked List implementation.
 * The last node always points back to the head.
 */
public class CircularLinkedList<T> {

    protected class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    protected Node head;
    protected int size;

    public CircularLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public int size() {
        return size;
    }

    publ
