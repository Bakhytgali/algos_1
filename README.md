# Assignment Documentation
Here you can read about the task from the assignment 
## Task 1
**Problem**: *You are given a number “n” and an array of “n” elements,
write the function that returns minimum of them.*
<br/><br/>
**Key Moments**: Key moment is to understand how the `recursion` works.
<br/><br/>
**Solution**:
```java
 public static int findMin(int[] array, int l){
        if(l == 1){
            return array[0];
        } else {
            int min = findMin(array, l-1);
            return Math.min(min, array[l-1]);
        }
    }
```

## Task 2
**Problem**: *You are given a number “n” and an array of “n” elements,
write the function that returns average of them.*
<br/><br/>
**Key Moments**: Here I decided just to write a function that finds me a `sum of an array`. Then I just devide it by the lenght of an array.
<br/><br/>
**Solution**:
```java
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
```
## Task 3
**Problem**: *You are given a number “n”, write the function for checking
whether“n” is prime.*
<br/><br/>
**Key Moments**: I haven't used recursion here. I used `for loop` to define, if the given number n devides without remainder for any integer number in range [2; n).
<br/><br/>
**Solution**:
```java
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
```
## Task 4
**Problem**: *You are given a number “n”, write the program using recursion for
finding “n!”*
<br/><br/>
**Key Moments**: To solve this problem, I wrote a simple recursive function, that multiplicate the number "n" with the previous ones.
<br/><br/>
**Solution**:
```java
  public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
```
