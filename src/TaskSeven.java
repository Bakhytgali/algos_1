import java.util.Scanner;
public class TaskSeven {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #7 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt(); /* Entering the length of an array */
        int[] array = new int[l]; /* Creating an array with the length l */
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){ /* Entering the elements of an array using `for loop` */
            array[i] = sc.nextInt();
        }
        System.out.println("The reversed array: " + reverseArr(array, l));
    }
    public static String reverseArr(int[] array, int l){ /*  reverseArr() function returns reversed array as a String
                                                             int[] array - is an array from the main function
                                                             int l - is length of an array
                                                           */
        if(l == 1){
            return Integer.toString(array[0]);
        } else {
            return array[l-1] + " " + reverseArr(array, l-1);
        }
    }
}
