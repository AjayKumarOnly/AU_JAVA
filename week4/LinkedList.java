public class LinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found.");
            return;
        }

        prev.next = current.next;
        System.out.println("Deleted: " + data);
    }

    public boolean search(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Found: " + data);
                return true;
            }
            current = current.next;
        }

        System.out.println("Not Found: " + data);
        return false;
    }

    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

        list.search(20);
        list.search(40);

        list.delete(20);
        list.display();

        list.delete(10);
        list.delete(50);
        list.display();
    }
}
