package com.company.Class10;

public class SubStringMissingChar {
}
   /* Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/

/* public String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(n+1, str.length());
        return front + back;
        }
*/

/* switch last letter with first letter
code -> eodc
kitten -> nittek

public String frontBack(String str) {
  if (str.length() <=1) return str;

  String mid = str.substring (1, str.length() - 1);

  return str.charAt(str.length() - 1) + mid + str.charAt(0);
}
*/
// print first 3 characters repetitively 3 times
// for ex: Java, print JavJavJav
/* public String front3(String str) {
  String front;

  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }
  return front + front + front;
}
*/