package Class;
class Student {
    public int roll_no;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char Grade()
    {
        if(average()>=90)
        {
            return 'A';
        }
        else if(average()<90 && average()>=80)
        {
            return 'B';
        }
        else if(average()<80 && average()>=70)
        {
            return 'C';
        }
        else
        {
            return 'D';
        }
    }
    public static void main(String args[])
    {
        Student s = new Student();
        s.roll_no = 16;
        s.name = "Muskan Kesharwani";
        s.course = "Computer Science and Engineering";
        s.m1 = 80;
        s.m2 = 93;
        s.m3 = 90;

        System.out.println("Roll no is: "+s.roll_no);
        System.out.println("Name of the student is: "+s.name);
        System.out.println("The Course name is: "+s.course);
        System.out.println("The total of all the marks of the student is: "+s.total());
        System.out.println("The average marks of the student is: "+s.average());
        System.out.println("Grade for the student is: "+s.Grade());

    }
}
