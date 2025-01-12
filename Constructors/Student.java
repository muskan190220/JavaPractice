package Constructors;

public class Student {
    private int rollno;
    private String stuname;
    private String dept;
    private int numOfSubs;
    private Subject[] sub;

    public int getRollno() {return rollno;}
    public String getStuName() {return stuname;}
    public String getDept() {return dept;}
    public int getNumOfSubs() { return numOfSubs;}
    public Subject[] getSubject() {return sub;}

    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }

    public Student(int rollno, String stuname, String dept)
    {
        this.rollno = rollno;
        this.stuname = stuname;
        this.dept = dept;
    }
    public Student(int rollno, String stuname, String dept, int numOfSubs)
    {
        this.rollno = rollno;
        this.stuname = stuname;
        this.dept = dept;
        this.numOfSubs = numOfSubs;
    }
 
    public String toString()
    {
        return "Roll :" +rollno+"\nName :"+stuname+"\nDept :"+dept+"\nNumber of Subjects :"+numOfSubs;
    }
    
}
