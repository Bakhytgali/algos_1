import java.util.Scanner;
public class TaskTwo {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #2 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt(); /* Entering the length of an array */
        int[] array = new int[l]; /* Creating an array with the length l */
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){ /* Entering the elements of an array using `for loop` */
            array[i] = sc.nextInt();
        }
        float avg = findSum(array, l) / l ; /* Dividing the sum of the elements by the length to get the average */
        System.out.println("The average of these elements is " + avg + ".");
    }
    public static float findSum(int[] array, int l){ /*
                                                       @ int[] array - array from the main function
                                                       @ int l - array's length
                                                     */
        if (l == 1){
            return array[0];
        } else {
            findSum(array, l-1); 
            return array[0] += array[l-1]; /* Summing the last element with the first 
                                            and declaring the result as a new first element */
        }
    }
}
