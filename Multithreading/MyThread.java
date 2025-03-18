package Multithreading;

class ThreadTest extends Thread
{
    public ThreadTest(String name)
    {
        super(name);
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
        System.out.println("Priority: "+ th.getPriority());

        th.start();
        System.out.println("State: "+ th.getState());
        System.out.println("Alive: "+ th.isAlive());

}
}
