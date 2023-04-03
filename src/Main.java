import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();
        TaskThree t3 = new TaskThree();
        TaskFour t4 = new TaskFour();
        TaskFive t5 = new TaskFive();
        TaskSix t6 = new TaskSix();
        TaskSeven t7 = new TaskSeven();
        TaskEight t8 = new TaskEight();
        TaskNine t9 = new TaskNine();
        TaskTen t10 = new TaskTen();

        while(true) {
            System.out.println("Which task you would like to check? \n" +
                    "(Enter the number between 1 and 10 or 11 to quit): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    t1.enter();
                    break;
                case 2:
                    t2.enter();
                    break;
                case 3:
                    t3.enter();
                    break;
                case 4:
                    t4.enter();
                    break;
                case 5:
                    t5.enter();
                    break;
                case 6:
                    t6.enter();
                    break;
                case 7:
                    t7.enter();
                    break;
                case 8:
                    t8.enter();
                    break;
                case 9:
                    t9.enter();
                    break;
                case 10:
                    t10.enter();
                    break;
                default:
                    return;
            }
        }
    }
}