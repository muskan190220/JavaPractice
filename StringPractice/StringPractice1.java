package StringPractice;

public class StringPractice1 {
    public static void main(String[] args) {
        {
            String str1 = "Java Program";
            String str2 = new String("JAVA");
            char c[]={'H', 'E', 'L', 'L', 'O'};
            String str3 = new String(c);
            byte b[]={65, 66, 67, 68};
            String str4 = new String(b);

            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);

            String st = new String("vscode");
            System.out.println(st.length());
            st=st.toUpperCase();
            System.out.println(st);
            System.out.println(st.substring(0,2));


            String str5 = "f";
            System.out.println(str5.matches("."));

        }
    }
}
