import java.util.Scanner;
public class TaskThree {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #3 \n" +
                            "Enter the number: ");
        int n = sc.nextInt(); /* int n - the number to check for prime */
        System.out.println(isPrime(n) ? "Yes":"No"); /* Outputing result using ternary operator */
    }
    public static boolean isPrime(int n){ /* int n - the number from the main function */
        boolean prime = false; /* boolean prime - variable that defines prime */
        for(int i = 2; i < n; i++){ /* checking if the number divides by any number in range [2; n) */
            if(n%i == 0){  
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return(prime ? true:false); /* Returning the answer using ternary operator */
    }
}
