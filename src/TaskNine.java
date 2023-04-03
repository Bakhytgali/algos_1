import java.util.Scanner;
public class TaskNine {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #9 \n" +
                            "Enter the first value: ");
        int n = sc.nextInt();
        System.out.println("Enter the second value: ");
        int k = sc.nextInt();
        if(n < k) {
            int temp = n;
            n = k;
            k = temp;
            System.out.println("Result is -" + findFormula(n, k) + ".");
        }
        else{
            System.out.println("Result is " + findFormula(n, k) + ".");
        }
    }
    public static int findFormula(int n, int k){
        if(n == k || k == 0){
            return 1;
        } else {
            return findFormula(n - 1, k - 1) + findFormula(n - 1, k);
        }
    }
}
