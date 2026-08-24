
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class createll {
    public static void main(String[] args) {

        // Creating Linked List
        Node head = new Node(10);

        Node n1 = new Node(20);
        head.next = n1;

        Node n2 = new Node(30);
        n1.next = n2;

        Node n3 = new Node(40);
        n2.next = n3;

        // Traversal
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

