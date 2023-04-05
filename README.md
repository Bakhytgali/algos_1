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
**Key Moments**: Function `findSum()` was used to find the sum of the elements and declaring it as a new value for array[0]. Next step is deviding the returned value by the length of an array.
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
**Key Moments**: In function `isPrime()` I used `for loop` to define, if the given number n devides without remainder for any integer number `in range [2; n).`
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
## Task 5
**Problem**: *You are given a number “n”, write the function for finding n-th
elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
F0= 0, F1 = 1.”*
<br/><br/>
**Key Moments**: Function `fibonacci()' return the value which equals to the sum of the previous 2 elements.
<br/><br/>
**Solution**:
```java
  public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
```
## Task 6
**Problem**: *You are given numbers “a” and “n”, write the function that returns “a^n”.*
<br/><br/>
**Key Moments**: `Function power()` returns the value of a multiplicating itself n-times. I used `long` data type because of the potential big input.
<br/><br/>
**Solution**:
```java
  public static long power(int a, int n){
        if(n == 0){
            return 1;
        } else {
            return a * power(a, n-1);
        }
    }
```
