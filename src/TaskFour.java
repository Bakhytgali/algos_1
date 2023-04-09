import java.util.Scanner;
public class TaskFour {
    public static void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #4 \n" +
                            "Enter the number: ");
        int n = sc.nextInt(); /* int n - the number to define it's factorial */
        System.out.println("Factorial of this number is: " + factorial(n));
    }
    public static int factorial(int n){ /* factorial() - function to find factorial
                                           @ int n - the number from the main function */
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1); /* multiplicating the number n with the all previous numbers  */
        }
    }
}
