import java.util.Scanner;

public class TaskOne {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #1 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt(); /* l -  Length of the array */
        int[] array = new int[l]; /* Creating array with length 'l' */
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){ /* Entering the elements of the array using 'for loop' */
            array[i] = sc.nextInt();
        }
        System.out.println("Minimum value is " + findMin(array, l) +"."); /* Sending to function
                                                                            the array and it's length */
    }
    public static int findMin(int[] array, int l){ /* Function that finds minimum element of the array
                                                    @ int[] array - array form the main function
                                                    @ int l - length of the array
                                                    */
        if(l == 1){
            return array[0];
        } else {
            int min = findMin(array, l-1); 
            return Math.min(min, array[l-1]); /* Finding the minimum between 2 elements using Math.min() function */
        }
    }
}
