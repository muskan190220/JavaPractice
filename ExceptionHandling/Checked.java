package ExceptionHandling;


class lowbalexception extends Exception{
    public String toString()
    {
        return "Balance should be more than 5000";
    }
}
public class Checked {
    
        static void fun1()
        {
            try {
                throw new lowbalexception();
            }
            catch(lowbalexception e)
            {
                System.out.println(e);
            }
        }
        static void fun2()
        {
            fun1();
        }
        public static void main(String args[])
        {
            Checked.fun2();
        }
}

