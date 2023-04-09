import java.util.Scanner;
public class TaskTen {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You are checking the task #10 \n" +
                            "Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("The GCD of the number a and b is " + findGCD(a, b) + ".");
    }
    public static int findGCD(int a, int b){ /* Function that find the Greatest Common Divisor using Euclidean Algorithm */
        if(a%b == 0){
            return b;
        } else {
            int temp2 = b;
            b = a % b;
            a = temp2;
            return findGCD(a, b);
        }
    }
}
