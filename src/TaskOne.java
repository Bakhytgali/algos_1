import java.util.Scanner;

public class TaskOne {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #1 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt(); /* Размер массива */
        int[] array = new int[l];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Minimum value is " + findMin(array, l) +".");
    }
    public static int findMin(int[] array, int l){
        if(l == 1){
            return array[0];
        } else {
            int min = findMin(array, l-1);
            return Math.min(min, array[l-1]);
        }
    }
}
