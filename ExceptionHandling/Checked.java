package ExceptionHandling;
import java.io.*;


public class Checked {
    
        static void fun1()
        {
            try{
                FileInputStream f = new FileInputStream("my.txt");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("File not found");
            }
        }
    }

