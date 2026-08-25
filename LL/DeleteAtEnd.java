class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtEnd {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Delete from end
        if (head == null) {

        } 
        else if (head.next == null) {

            head = null;

        } 
        else {

            Node temp = head;

            // Reach second-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }

            // Remove last node
            temp.next = null;
        }

        // Print list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}