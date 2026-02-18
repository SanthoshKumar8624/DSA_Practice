package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertFirst(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
        size++;
    }

    public void insert(int data, int index) {
        if (head == null || index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;
        size++;
    }
    public int find(int value)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==value) {
                return i;
            }
            temp=temp.next;
            i++;

        }
        return 0;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void deleteFirst() {
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println(value + " - deleted");
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node SecondLast = get(size - 2);
        int value = tail.data;
        System.out.println(value + " - deleted");
        tail = SecondLast;
        tail.next = null;
        size--;
    }
    public void delete(int index){//find the previous node then sort out other things
        Node temp=get(index-1);
        Node element=temp.next;
        int value=element.data;
        temp.next=element.next;
        System.out.println(value + " - deleted");
        size--;
    }

    public void isEmpty() {
        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println("List is not Empty");
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.isEmpty();
        list.insertLast(1);
        list.insertLast(2);
        list.insertFirst(9);
        list.insert(47, 0);
        list.insert(100, 3);
        list.insert(6, 5);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        System.out.println(list.find(1));
        list.display();
    }
}
