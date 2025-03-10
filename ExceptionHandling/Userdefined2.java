package ExceptionHandling;



class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
        
    }
}
class StackUnderFLow extends Exception
{
    public String toString()
    {
        return "Stack is Empty!!";
        
    }
}
class stack
{
        private int size;
        private int[] s;
        private int top = -1;

        public stack(int sz)
        {
            size = sz;
            s = new int[sz];
        }
        public void push(int x) throws StackOverFlow
        {
            if(top == size-1)
            {
                throw new StackOverFlow();
            }
            top++;
            s[top] = x;   
        }
        public int pop() throws StackUnderFLow
        {
            int x = -1;
            if(top == -1)
            {
                throw new StackUnderFLow();
            }
            x = s[top];
            top--;
            return x;
        }
}

public class Userdefined2
{
    public static void main(String args[])
    {
        stack st = new stack(5);
        try
        {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
        }
        catch(StackOverFlow e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        
        }
        catch(StackUnderFLow e)
        {
            System.out.println(e);
        }
        

    }
}


    

