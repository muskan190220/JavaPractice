package StaticKeyword;
import java.util.*;


class Universitystu
{
    private String rollno;
    //private String name;
    private static int count = 1;

    private String generateRollNo()
    {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        String rno="Univ-"+(year)+"-"+count;
        count++;
        return rno;
    }

    public Universitystu()
    {
        
        rollno = generateRollNo();
    }
    public String getRollno()
    {
        return rollno;
    }
}
public class Student 
{
    public static void main(String args[])
    {
        Universitystu u1 = new Universitystu();
        Universitystu u2 = new Universitystu();
        Universitystu u3 = new Universitystu();

        System.out.println(u1.getRollno());
        System.out.println(u2.getRollno());
        System.out.println(u3.getRollno());
    }
}
