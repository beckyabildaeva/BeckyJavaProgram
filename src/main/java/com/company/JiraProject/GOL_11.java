package com.company.JiraProject;
import java.util.Arrays;
import java.util.Scanner;

/*Given a string, count the number of words ending in 'y' or 'z' --
so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */
// GOL_11
public class GOL_11 {

        public static void main(String[] args) {
            System.out.println("Enter any statement to see how many words end with Y or Z");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().toLowerCase();

            int count = 0;
            String str1 = "";
            for(int i = 0; i < str.length(); i++){
                if(Character.isLetter(str.charAt(i))){
                    str1 = str1+str.charAt(i);
                } else {
                    str1 = str1 + " ";
                }
            }
            System.out.println(str1);
            String[] array1 = str1.split(" ");  // split it by space
            System.out.println(Arrays.toString(array1)); // print out the array

            for(int i = 0; i<array1.length; i++){
                if(!(array1[i].equals(""))){
                    char lastChar = array1[i].charAt(array1[i].length()-1);
                    if(lastChar=='z' || lastChar=='y'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

