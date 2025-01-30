package Interfaces;

class Phone
{
    void call()
    {
        System.out.println("Making a call");
    }
    void sms()
    {
        System.out.println("Sending SMS");
    }
}
interface Camera
{
    void click();
    void record();
}
interface Musicplayer
{
    void playsong();
    void pausesong();
}

class SmartPhone extends Phone implements Camera, Musicplayer
{
    public void click()
    {
        System.out.println("Clicking pictures");
    }
    public void record()
    {
        System.out.println("Recording a video");
    }
    public void playsong() {
        System.out.println("Playing song");
    }
    public void pausesong() 
    {
        System.out.println("Pausing the song");
    }    
}
public class Phonetest 
{
    public static void main(String args[])
    {
        SmartPhone s = new SmartPhone();
        s.call();
        Camera c = s; 
        c.click();
        Musicplayer m = s;
        m.playsong();
    }
}
