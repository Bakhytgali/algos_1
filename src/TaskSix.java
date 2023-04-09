import java.util.Scanner;
public class TaskSix {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #6 \n" +
                            "Enter the value of a: ");
        int a = sc.nextInt(); /*  int a - number */
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt(); /* int n - power of a */
        System.out.println("The result (a in the power of n) is: " + findPower(a, n));
    }
    public static long findPower(int a, int n){ /* findPower() - function to find n-th power of number a */
        if(n == 0){
            return 1;
        } else {
            return a * findPower(a, n-1); /* Multiplicating the number a for itself n times */
        }
    }
}
