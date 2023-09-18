
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Two {
    private static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����:");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    // �� �2 ����� 1
    private static void evenOrNotEven(int a) {
        if (a % 2 ==0){
            System.out.println("������");
        } else System.out.println("�� ������");
    }
    // �� �2 ����� 2
    private static void closerToTen(int n, int m){
        if (abs(n-10)>abs(m-10)){
            System.out.println("�� ����� n = " + n + " � m = " + m + " ����� " + m  + " ����� � 10");
        }
        else if (abs(n-10)<abs(m-10)) System.out.println("�� ����� n = " + n + " � m = " + m + " ����� " + n  + " ����� � 10");
        else if (abs(n-10)==abs(m-10)) System.out.println("����� ����� ������� �� 10");
    }
    // �� �2 ����� 3
    private static void includesInRange() {
        int i = (int) (Math.random() * (155 - 5)) + 5;
        if (i > 25 & i < 100) {
            System.out.println("����� " + i + " ���������� � ��������� (25,100)");
        } else System.out.println("����� " + i + " ��  ���������� � ��������� (25,100)");
    }
    // �� �2 ����� 4
    private static void maxNum(){
        int num = (int) (Math.random() * (999 - 100)) + 100;
        String st = Integer.toString(num);
        int[] arr = new int[st.length()];
        for(int i = 0; i < st.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println("� ����� " + num + " ���������� ����� " + Arrays.stream(arr).max().getAsInt());


       /* System.out.println(st);
        System.out.println("����� " + num);
        System.out.println("������ ����� " + arr[0]);
        System.out.println("������ ����� " + arr[1]);
        System.out.println("������ ����� " + arr[2]); */


    }
    // �� �2 ����� 5
    private static void sortNumbers(){
        int a = 44;
        int b = 1;
        int c = 9;
        System.out.println("����� � ���������� a, b � c: " + a + ", " + b + ", " + c + ",");
        int [] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        System.out.println("������������ ������������������: " + a + ", " + b + ", " + c + ",");
    }
    // �� �2 ����� 6
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
    // �� �2 ����� 7
    private static void firstFiftyFive(){
        int start = 1;
        int counter = 55;
        int step = 2;
        for (int i =1; i <= counter; i++){
            System.out.println(start);
            start = start + step;
        }
    }
    // �� �2 ����� 8
    private static void allNotNegative(){
        int start = 90;
        int step = 5;
        while (start >= 0){
            System.out.println(start);
            start = start - step;
        }
    }
    // �� �2 ����� 9
    private static void firstTwenty(){
        int start = 2;
        for (int i =1; i <= 20; i++){
            System.out.println(start);
            start = start * 2 ;
        }
    }
    // �� �2 ����� 10
    private static int factorial(int n){
        if (n ==0 || n ==1 ){
            return 1;
        }else  return  n * factorial( n - 1);
    }
    // �� �2 ����� 11
    private static ArrayList<Integer> positiveDivisors(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for ( int i = 1; i<=num; i ++){
            if (num % i == 0){
                arr.add(i);
            }
        } return  arr;
    }
    // �� �2 ����� 12
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


        // �� �2 ����� 1 ��������
        //    evenOrNotEven(0);

        // �� �2 ����� 2 ��������
        //  closerToTen(25, -5);

        // �� �2 ����� 3 ��������
        //  includesInRange();

        // �� �2 ����� 4 ��������
       //  maxNum();

        // �� �2 ����� 5 ��������
      //  sortNumbers();

        // �� �2 ����� 6 ��������
       // fourStartSequence();

        // �� �2 ����� 7 ��������
       // firstFiftyFive();

        // �� �2 ����� 8 ��������
       // allNotNegative();

        // �� �2 ����� 9 ��������
      //  firstTwenty();

        // �� �2 ����� 10 ��������
      /*  int numForFactorial = getInput();
        System.out.println("��������� ������������ ����� " + numForFactorial + " = " + factorial(numForFactorial)); */

        // �� �2 ����� 11 ��������
       /* int numPositiveDivisors = getInput();
        System.out.println("������������� �������� ����� " + numPositiveDivisors + " ���: ");
        for (int i = 0; i< positiveDivisors(numPositiveDivisors).size(); i++){
            System.out.println(positiveDivisors(numPositiveDivisors).get(i) + " ");
        } */

        // �� �2 ����� 12 ��������
     /*   int numNaturalNumber = getInput();
        boolean result = naturalNumber(numNaturalNumber);
        if (result) {
            System.out.println("����� " + numNaturalNumber + " �������� �������.");
        }
        else {
            System.out.println("����� " + numNaturalNumber + " �� �������� �������.");
        }*/
    }
}
