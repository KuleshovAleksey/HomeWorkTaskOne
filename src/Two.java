
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Two {
    private static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    // ДЗ №2 пункт 1
    private static void evenOrNotEven(int a) {
        if (a % 2 ==0){
            System.out.println("Четное");
        } else System.out.println("Не четное");
    }
    // ДЗ №2 пункт 2
    private static void closerToTen(int n, int m){
        if (abs(n-10)>abs(m-10)){
            System.out.println("Из чисел n = " + n + " и m = " + m + " число " + m  + " ближе к 10");
        }
        else if (abs(n-10)<abs(m-10)) System.out.println("Из чисел n = " + n + " и m = " + m + " число " + n  + " ближе к 10");
        else if (abs(n-10)==abs(m-10)) System.out.println("Числа равно удалены от 10");
    }
    // ДЗ №2 пункт 3
    private static void includesInRange() {
        int i = (int) (Math.random() * (155 - 5)) + 5;
        if (i > 25 & i < 100) {
            System.out.println("Число " + i + " содержится в интервале (25,100)");
        } else System.out.println("Число " + i + " не  содержится в интервале (25,100)");
    }
    // ДЗ №2 пункт 4
    private static void maxNum(){
        int num = (int) (Math.random() * (999 - 100)) + 100;
        String st = Integer.toString(num);
        int[] arr = new int[st.length()];
        for(int i = 0; i < st.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println("В числе " + num + " наибольшая цифра " + Arrays.stream(arr).max().getAsInt());


       /* System.out.println(st);
        System.out.println("число " + num);
        System.out.println("первая цифра " + arr[0]);
        System.out.println("вторая цифра " + arr[1]);
        System.out.println("третья цифра " + arr[2]); */


    }
    // ДЗ №2 пункт 5
    private static void sortNumbers(){
        int a = 44;
        int b = 1;
        int c = 9;
        System.out.println("Числа в переменных a, b и c: " + a + ", " + b + ", " + c + ",");
        int [] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        System.out.println("Возрастающая последовательность: " + a + ", " + b + ", " + c + ",");
    }
    // ДЗ №2 пункт 6
    private static void fourStartSequence(){
        int start = 1000;
        int end = 9999;
        int step = 3;
        int current = start;
        while (current <= end){
            System.out.println(current);
            current = current + step;
        }
    }
    // ДЗ №2 пункт 7
    private static void firstFiftyFive(){
        int start = 1;
        int counter = 55;
        int step = 2;
        for (int i =1; i <= counter; i++){
            System.out.println(start);
            start = start + step;
        }
    }
    // ДЗ №2 пункт 8
    private static void allNotNegative(){
        int start = 90;
        int step = 5;
        while (start >= 0){
            System.out.println(start);
            start = start - step;
        }
    }
    // ДЗ №2 пункт 9
    private static void firstTwenty(){
        int start = 2;
        for (int i =1; i <= 20; i++){
            System.out.println(start);
            start = start * 2 ;
        }
    }
    // ДЗ №2 пункт 10
    private static int factorial(int n){
        if (n ==0 || n ==1 ){
            return 1;
        }else  return  n * factorial( n - 1);
    }
    // ДЗ №2 пункт 11
    private static ArrayList<Integer> positiveDivisors(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for ( int i = 1; i<=num; i ++){
            if (num % i == 0){
                arr.add(i);
            }
        } return  arr;
    }
    // ДЗ №2 пункт 12
    private static boolean naturalNumber (int n) {
    /*    if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        } return true; */
    }



    public static void main(String[] args) {


        // ДЗ №2 пункт 1 проверка
        //    evenOrNotEven(0);

        // ДЗ №2 пункт 2 проверка
        //  closerToTen(25, -5);

        // ДЗ №2 пункт 3 проверка
        //  includesInRange();

        // ДЗ №2 пункт 4 проверка
       //  maxNum();

        // ДЗ №2 пункт 5 проверка
      //  sortNumbers();

        // ДЗ №2 пункт 6 проверка
       // fourStartSequence();

        // ДЗ №2 пункт 7 проверка
       // firstFiftyFive();

        // ДЗ №2 пункт 8 проверка
       // allNotNegative();

        // ДЗ №2 пункт 9 проверка
      //  firstTwenty();

        // ДЗ №2 пункт 10 проверка
      /*  int numForFactorial = getInput();
        System.out.println("факториал натурального числа " + numForFactorial + " = " + factorial(numForFactorial)); */

        // ДЗ №2 пункт 11 проверка
       /* int numPositiveDivisors = getInput();
        System.out.println("Положительные делители числа " + numPositiveDivisors + " это: ");
        for (int i = 0; i< positiveDivisors(numPositiveDivisors).size(); i++){
            System.out.println(positiveDivisors(numPositiveDivisors).get(i) + " ");
        } */

        // ДЗ №2 пункт 12 проверка
     /*   int numNaturalNumber = getInput();
        boolean result = naturalNumber(numNaturalNumber);
        if (result) {
            System.out.println("Число " + numNaturalNumber + " является простым.");
        }
        else {
            System.out.println("Число " + numNaturalNumber + " не является простым.");
        }*/
    }
}
