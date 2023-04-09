import java .util.Scanner;
public class TaskFive {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #5 \n" +
                            "Enter the index of the fibonacci number (starts from 0): ");
        int n = sc.nextInt();/* int n - index of a fibonacci number */ 
        System.out.println("The value of this fibonacci number is " + fibonacci(n) + ".");
    }
    public static int fibonacci(int n){ /* fibonacci() - function that finds fibonacci number
                                           @ int n - index of fibonacci element */
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2); /*  Returning the sum of previous 2 fibonacci elements */
        }
    }
}
