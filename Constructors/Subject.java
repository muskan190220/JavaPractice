package Constructors;

public class Subject {
    private String subid;
    private String subname;
    private int maxmarks;
    private int marksobt;

    public String getSubid()
    {
        return subid;
    }
    public String getSubname()
    {
        return subname;
    }
    public int getMaxmarks()
    {
        return maxmarks;
    }
    public int getMarksobt()
    {
        return marksobt;
    }
    public void setMaxmarks(int maxm)
    {
        maxmarks = maxm;
    }
    public void setMarksobt(int obtm)
    {
        marksobt = obtm;
    }
    public boolean isQualified()
    {
        return maxmarks>=marksobt/10*4;
    }

    public String toString()
    {
        return ("\nSubject id: "+subid+"\nSubject Name: "+subname+"\nMarks Obtained: "+marksobt);
    }

    public Subject(String subid, String subname, int maxmarks)
    {
        this.subid = subid;
        this.subname = subname;
        this.maxmarks = maxmarks;
        //setMarksobt(marksobt);
    }
}
