import java.util.Scanner;
public class TaskEight {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #8 \n" +
                            "Enter the string");
        String s = sc.next();
        char[] arrayChar = s.toCharArray(); /* Creating char array from the string */
        System.out.println(allDigits(arrayChar, arrayChar.length) ? "Yes":"No");
    }
    public static boolean allDigits(char[] array, int l){
        if(l == 0){ /* if l == 0, that means that all the elements have completed the checking */
            return true;
        } else {
            try{
                String el = String.valueOf(array[l-1]); /* turning char element into string */
                Integer.parseInt(el); /* checking if the element can be turned into int */
                return allDigits(array, l-1);
            } catch (Exception e) { /* if the element can't be turned into int, that means that it's not a digit */
                return false;
            }
        }
    }
}
