import java.util.Scanner;
public class TaskSeven {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #7 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt();
        int[] array = new int[l];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The reversed array: " + reverseArr(array, l));
    }
    public static String reverseArr(int[] array, int l){
        if(l == 1){
            return Integer.toString(array[0]);
        } else {
            return array[l-1] + " " + reverseArr(array, l-1);
        }
    }
}
