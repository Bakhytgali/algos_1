import java.util.Scanner;
public class TaskThree {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #3 \n" +
                            "Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Yes":"No");
    }
    public static boolean isPrime(int n){
        boolean prime = false;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return(prime ? true:false);
    }
}
