class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {
    public static void main(String[] args) {

        // Creating Linked List
        Node head = new Node(10);

        Node n1 = new Node(20);
        head.next = n1;

        Node n2 = new Node(30);
        n1.next = n2;

        Node n3 = new Node(40);
        n2.next = n3;

        // Insert 50 at end
        Node newNode = new Node(50);

        Node temp = head;

        // Find the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;

        // Traversal
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}