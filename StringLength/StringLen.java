package StringLength;

import java.util.Scanner;

public class StringLen {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = s.nextLine();

        char[] c = str.toCharArray();

        System.out.println("String length is "+ c.length);

    }

}
