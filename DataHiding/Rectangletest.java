package DataHiding;

public class Rectangletest {
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(15);
        
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
