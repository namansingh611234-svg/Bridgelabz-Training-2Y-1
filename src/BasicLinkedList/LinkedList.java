package BasicLinkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.print(head.data + " -> ");
        System.out.print(head.next.data + " -> ");
        System.out.print(head.next.next.data + " -> ");
        System.out.print(head.next.next.next.data + " -> ");
        System.out.print("null");
    }
}


