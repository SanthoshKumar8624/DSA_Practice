package Queue;
public class QueueADT
{
    int [] queue;
    int rear,front,size;
    QueueADT(int size)
    {
        this.size=size;
        queue=new int[size];
        rear=front=-1;
    }
    public void Enqueue(int x)
    {
        if(rear==size-1)
        {System.out.println("Queue is Full!");}
        else if (front==-1)
        {
            front++;
            queue[++rear]=x;
            System.out.println("value stored "+x);
        }
        else
        {
            queue[++rear]=x;
            System.out.println("value stored "+x);
        }
    }
    public void Dequeue() {
        if (front == -1)
        {System.out.println("Queue is Empty!");}
        else if (front == rear)
        {
            System.out.println("front element deleted: " + queue[front]);
            front = rear = -1;
        }
        else
        {
            System.out.println("front element deleted: " + queue[front]);
            front++;
        }
    }
    public void traverse() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public static void main(String[] args)
    {
        QueueADT q=new QueueADT(5);
        q.Enqueue(4);
        q.Enqueue(-9);
        q.traverse();
        q.Dequeue();
        q.traverse();
        System.out.println("front element: "+q.peek());
    }
}
