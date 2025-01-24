package Overriding;

class TV
{
    public void SwitchON()
    {
        System.out.println("Old TV Swtiched on");
    }
    public void ChangeChannel()
    {
        System.out.println("Old TV Channel changed");
    }
}
class SmartTV extends TV
{
    public void SwitchON()
    {
        System.out.println("Smart TV Swtiched on");
    }
    public void ChangeChannel()
    {
        System.out.println("Smart TV Channel changed");
    }  
    public void Browse()
    {
        System.out.println("Smart TV browsing");
    }  
}

public class TVoverriding {
    public static void main(String args[])
    {
        /*TV t = new TV();
        t.ChangeChannel();
        t.SwitchON();

        SmartTV st = new SmartTV();
        st.SwitchON();
        st.ChangeChannel();
        st.Browse();*/

        TV t = new SmartTV();
        t.SwitchON();
        t.ChangeChannel();
        


    }
}
