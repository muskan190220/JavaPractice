package ExceptionHandling;

import java.io.FileInputStream;


import java.util.*;

public class Trywithresources {
    
    
        static void Divide() throws Exception
        {
            try(FileInputStream f = new FileInputStream("D:\\Java Practice_git\\Text.txt");Scanner sc = new Scanner(f))
            {
            
            int a = sc.nextInt();
            //int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a/c);
            }
        }
    public static void main(String args[]) throws Exception
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
    }
}
