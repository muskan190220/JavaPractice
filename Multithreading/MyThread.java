package Multithreading;

class ThreadTest extends Thread
{
    public ThreadTest(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}
public class MyThread  
{
    public static void main(String args[])
    {
        ThreadTest th = new ThreadTest("My Thread 1");
        //th.start();
        
        System.out.println("Id: "+ th.getId());
        System.out.println("Name: "+ th.getName());
        th.start();
        System.out.println("Priority: "+ th.getPriority());

        //th.start();
        System.out.println("State: "+ th.getState());
        System.out.println("Alive: "+ th.isAlive());

}
}
