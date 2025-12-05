package Thread;
class C implements Runnable {
    public void run() {
        try {
            for (int i = 100; i <= 110; i++) {
                System.out.println("Thread A : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class D implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread B : " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Threadex2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new C());
        Thread t2 = new Thread(new D());
        t1.start();
        t2.start();
    }
}
