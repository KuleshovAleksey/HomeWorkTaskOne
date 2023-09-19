import java.util.Arrays;

public class Three {

    // ДЗ №3 пункт 1
    private static void array() {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println("Массив ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Обратная сортировка ");
        Arrays.sort(arr, (i1, i2) -> Integer.compare(i2, i1));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // ДЗ №3 пункт 2
    private static void sevenRandomNumbers() {
        int[] arrSevenNumbers = new int[7];
        for (int i = 0; i < arrSevenNumbers.length; i++) {
            arrSevenNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив : ");
        for (int i : arrSevenNumbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arrSevenNumbers.length; i++) {
            arrSevenNumbers[i] *= 2;
        }
        System.out.println();
        System.out.println("Массив увеличенный в 2 раза : ");
        for (int i : arrSevenNumbers) {
            System.out.print(i + " ");
        }
    }

    // ДЗ №3 пункт 3
    private static void eightRandomNumbers() {
        int[] arrEightNumbers = new int[8];
        for (int i = 0; i < arrEightNumbers.length; i++) {
            arrEightNumbers[i] = (int) (Math.random() * (11 - (-10))) + (-10);
        }
        for (int i : arrEightNumbers) {
            System.out.print(i + " ");
        }
        int count = 0;
        for (int i = 0; i < arrEightNumbers.length; i++) {
            if (arrEightNumbers[i] < 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("В массиве " + count + " отрицательных чисел");
    }

    // ДЗ №3 пункт 4
    private static void twelveRandomNumbers() {
        int[] arrEightNumbers = new int[12];
        for (int i = 0; i < arrEightNumbers.length; i++) {
            arrEightNumbers[i] = (int) (Math.random() * (11 - (-20))) + (-20);
        }
        System.out.println("Массив : ");
        for (int i : arrEightNumbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arrEightNumbers.length; i++) {
            if (arrEightNumbers[i] < 0) {
                arrEightNumbers[i] = 0;
            }
        }
        System.out.println();
        System.out.println("Массив с заменой: ");
        for (int i : arrEightNumbers) {
            System.out.print(i + " ");
        }
    }
    // ДЗ №3 пункт 5
    // создан отдельный класс User

    public static void main(String[] args) {
        // ДЗ №3 пункт 1  проверка
        // array();

        // ДЗ №3 пункт 2 проверка
        // sevenRandomNumbers();

        // ДЗ №3 пункт 3 проверка
        //  eightRandomNumbers();

        // ДЗ №3 пункт 4 проверка
        // twelveRandomNumbers();

        // ДЗ №3 пункт 5 проверка
      /*  User [] users = new User[5];
        users[0] = new User("Иванов", "Иван", 18);
        users[1] = new User("Петров", "Петр", 81);
        users[2] = new User("Семенов", "Семен", 33);
        users[3] = new User("Сидоров", "Сидар", 50);
        users[4] = new User("Владимиров", "Владимир", 99);
        for (User u: users) {
            System.out.println(u);
        } */
    }
}
