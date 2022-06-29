package com.company.JiraProject;
/*Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */
import java.util.Scanner;

public class GOL_4 {
    public static void main(String[] args) {
        GOL_4 GOL4 = new GOL_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to return 1st two characters of the String");
        String str = sc.nextLine();
        System.out.println(GOL4.atFirst(str));

    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            str = str.substring(0, 2);
        } else if (str.length() == 1) {
            str = str.substring(0) + '@';
        } else {
            str = "@@";
        }
        return str;
    }
}
