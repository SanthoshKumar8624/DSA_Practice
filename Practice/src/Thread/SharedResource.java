package Thread;

class Buffer
{
    int data;
    boolean hasData = false;
    public synchronized void produce(int value) throws Exception
    {
        while (hasData) {
            wait();
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify();
    }
    public synchronized void consume() throws Exception
    {
        while (!hasData) {
            wait();
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}
class Producer extends Thread
{
    Buffer buffer;
    Producer(Buffer b)
    {
        buffer = b;
    }
    public void run()
    {
        try {
            int i = 1;
            while (true) {
                buffer.produce(i);
                i++;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Consumer extends Thread
{
    Buffer buffer;
    Consumer(Buffer b)
    {
        buffer = b;
    }
    public void run()
    {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class SharedResource {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Producer(b).start();//without ref variable directly using object with start()
        new Consumer(b).start();
    }
}
