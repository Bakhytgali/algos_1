import java.util.Scanner;
public class TaskFive {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #5 \n" +
                            "Enter the index of the fibonacci number (starts from 0): ");
        int n = sc.nextInt();
        System.out.println("The value of this fibonacci number is " + fibonacci(n) + ".");
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
