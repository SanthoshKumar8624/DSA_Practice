package Thread;
class A extends Thread {
    public void run() {
        try {
            for (int i = 100; i <= 110; i++) {
                System.out.println("A : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class B extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B : " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Threadex1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
