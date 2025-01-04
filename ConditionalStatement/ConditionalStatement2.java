package ConditionalStatement;
import java.util.*;
public class ConditionalStatement2 
{
    public static void main(String args[])
    {

        //TO check what day it is according to number

        /*int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the day");
        i = sc.nextInt();
        
       switch(i)
       {
        case 1: System.out.println("Day is Monday");
        break;
        case 2: System.out.println("Day is Tuesday");
        break;
        case 3: System.out.println("Day is Wednesday");
        break;
        case 4: System.out.println("Day is Thursday");
        break;
        case 5: System.out.println("Day is Friday");
        break;
        case 6: System.out.println("Day is Saturday");
        break;
        case 7: System.out.println("Day is Sunday");
        break;
        default: System.out.println("Invalid option");
        break;
       }
    }*/

    //TO check the type of website

    Scanner str = new Scanner(System.in);
    System.out.println("Enter the website to check the type of it");
    String website = str.next();
    String ext = website.substring(website.lastIndexOf(".")+1);

    switch(ext)
    {
        case "org": System.out.println("It is an organisational site");
        break;
        case "com": System.out.println("It is a commercial site");
        break;
        case "gov": System.out.println("It is a government site");
        break;
        case "net": System.out.println("It is a network");
        break;
        default: System.out.println("Invalid option");
        break;
    }
    }
}
