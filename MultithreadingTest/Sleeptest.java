package MultithreadingTest;

class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        while (count <= 10) { // Terminate after printing 10 numbers
            System.out.println(getName() + ": " + count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(getName() + " finished execution.");
    }
}

public class Sleeptest {
    public static void main(String args[]) {
        Mythread m = new Mythread("Thread_1");
        m.start();
    }
}
