import java.util.Scanner;
public class TaskNine {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #9 \n" +
                            "Enter the first value: ");
        int n = sc.nextInt(); /* Entering the first number  */
        System.out.println("Enter the second value: ");
        int k = sc.nextInt(); /* Entering second number */
        System.out.println("Result is " + findFormula(n, k) + ".");
    }
    public static int findFormula(int n, int k){ /* Function to find the answer using the given formula */ 
        if(n == k || k == 0){
            return 1;
        } else {
            return findFormula(n - 1, k - 1) + findFormula(n - 1, k);
        }
    }
}
