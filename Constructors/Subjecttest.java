package Constructors;

public class Subjecttest {
    public static void main(String args[])
    {
        Subject subs[] = new Subject[3];
        Student stu = new Student(28106, "Muskan Kesharwani", "CSE", 3);
        subs[0] = new Subject("S101", "DSA", 100);
        subs[1] = new Subject("S102", "Computer Architecture", 100);
        subs[2] = new Subject("S103", "Operating System", 100);

        System.out.println(stu.toString());
        //System.out.println("");

        for(Subject s:subs)
        {
            System.out.println(s);
        } 

        
    }
}
