import java.util.Scanner;
public class TaskTwo {
    public static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "You are testing a task #2 \n" +
                            "Enter the length of an array: ");
        int l = sc.nextInt();
        int[] array = new int[l];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i < l; i++){
            array[i] = sc.nextInt();
        }
        float avg = findSum(array, l) / l ; /* Делю сумму на размер массива */
        System.out.println("The average of these elements is " + avg + ".");
    }
    public static float findSum(int[] array, int l){ /* Функция для нахождения суммы элементов массива */
        if (l == 1){
            return array[0];
        } else {
            findSum(array, l-1);
            return array[0] += array[l-1]; /* Прибавляю к первому элементу последний
                                            и присваиваю это значение обратно первому элементу */
        }
    }
}
