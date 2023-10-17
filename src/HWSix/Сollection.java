package HWSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Сollection {

    public static ArrayList<Integer> Array() {
        Random random = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrList.add(random.nextInt(-100, 100));
        }
        System.out.println(arrList);
        return arrList;
    }

    public static HashSet<Integer> uniqueValues(ArrayList<Integer> arr) {
        HashSet<Integer> hashSet = new HashSet<>(arr);
        return hashSet;
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
        ArrayList<Integer> sortArr = new ArrayList<>(arr);
        Collections.sort(sortArr);
        return sortArr;
    }

    public static int summArray(ArrayList<Integer> arr) {
        ArrayList<Integer> summArr = new ArrayList<>(arr);
        int summ = 0;
        for (Integer i : summArr) {
            summ += i;
        }
        return summ;
    }

    public static ArrayList<Integer> onlyPositive(ArrayList<Integer> arr) {
        ArrayList<Integer> positiveArr = new ArrayList<>();
        for (Integer i : arr) {
            if (i > 0) {
                positiveArr.add(i);
            }
        }
        return positiveArr;
    }

    public static ArrayList<Integer> onlyEvenOnes(ArrayList<Integer> arr) {
        ArrayList<Integer> positiveArr = new ArrayList<>(arr);
        positiveArr.removeIf(number -> number % 2 != 0);
        return positiveArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> workList = new ArrayList<>(Array()); //массив, что бы каждый раз не дергать метод Array()
        //   ArrayList<Integer> halfList = new ArrayList<>(workList.subList(0,10)); //1 Создайте новую коллекцию, переписав в него часть элементов из первой коллекции (к примеру, первые 10 элементов)
        //   System.out.println("половина от изначального " + halfList);
        //   System.out.println("уникальные значения " + uniqueValues(workList));
        //   System.out.println("Отсортированный массив " + sortArray(workList));
        //   System.out.println(maxArr(workList));
        //   System.out.println(minArr(workList));
        //   System.out.println("Максимальное " +  Collections.max(workList));
        //   System.out.println("Минимальное " +  Collections.min(workList));
        //   System.out.println(summArray(workList));
        //   System.out.println(onlyPositive(workList));
        //  System.out.println(onlyEvenOnes(workList));
        int findIndex = workList.get(1); // создаю переменную для проверки задания с индексом
        System.out.println(findIndex);
        System.out.println(workList.indexOf(findIndex));

    }
}
