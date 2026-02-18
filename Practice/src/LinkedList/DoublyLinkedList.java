package LinkedList;

public class DoublyLinkedList
{
    Node head;
    private class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        public Node(int data) {
            this.data = data;
        }
    }
    public void insertFirst(int data)
    {
        Node newnode=new Node(data);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null)
        {
            head.prev=newnode;
        }
        head=newnode;
    }
    public void insertLast(int data)
    {
        Node newnode=new Node(data);
        Node last=head;
        newnode.next=null;
        if(head==null)
        {
            newnode.prev=null;
            head=newnode;
            return;
        }
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=newnode;
        newnode.prev=last;
    }
    public Node find(int value)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        return  null;
    }
    public void insert(int after,int value)
    {
        Node temp=find(after);
        if(temp==null)
        {
            System.out.println("Not found");
            return;
        }
        Node newnode=new Node(value);
        newnode.next=temp.next;
        newnode.prev=temp;
        temp.next=newnode;
        if(newnode.next!=null)
        {
            newnode.next.prev=newnode;
        }

    }
    public void display()
    {
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse Traversal");
        while(last!=null)
        {
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.insert(30, 80);
        list.display();
    }
}
