package StringPractice;

public class StringPractice2 {
    public static void main(String args[])
    {
        //Find if the string has gmail or not
        String str1="Programmer@gmail.com";
        System.out.println(str1.matches("(.*)gmail(.*)"));

        //find the username and domain name of the mail id
        int i = str1.indexOf("@");
        String str2 = str1.substring(0, i);
        System.out.println("Username: " +str2);
        int len = str1.length();
        String str3 = str1.substring(i+1, len);
        System.out.println("Domain: " + str3);

        //Find if the number is binary or not
        String num = "01100011100111";
        boolean result = num.matches("[01]*");
        if (result==true)
        {
            System.out.println("Yes number is Binary");
        }
        else
        {
            System.out.println("Number is not Binary");
        }

        //To check if the date is in date format
        String date = "19/02/2000";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        //To remove special characters from a string
        String mail = "a;B@c%1!2$3";
        System.out.println(mail.replaceAll("[^a-zA-Z0-9]",""));

        //To remove extra spaces from the word
        String name = "   Hi    my    name is   Muskan   ";
        name = name.replaceAll("\\s+", " ").trim();
        System.out.println(name);

        //To find out the number of words in a string
        String words[] = name.split("\\s");
        System.out.println(words.length);
    }
}
