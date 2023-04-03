import java.util.Scanner;
public class TaskSix {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #6 \n" +
                            "Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The result (a in the power of n) is: " + power(a, n));
    }
    public static long power(int a, int n){
        if(n == 0){
            return 1;
        } else {
            return a * power(a, n-1);
        }
    }
}
