import java.util.Arrays;

public class Three {

    // �� �3 ����� 1
    private static void array() {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println("������ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("�������� ���������� ");
        Arrays.sort(arr, (i1, i2) -> Integer.compare(i2, i1));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // �� �3 ����� 2
    private static void sevenRandomNumbers() {
        int[] arrSevenNumbers = new int[7];
        for (int i = 0; i < arrSevenNumbers.length; i++) {
            arrSevenNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("������ : ");
        for (int i : arrSevenNumbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arrSevenNumbers.length; i++) {
            arrSevenNumbers[i] *= 2;
        }
        System.out.println();
        System.out.println("������ ����������� � 2 ���� : ");
        for (int i : arrSevenNumbers) {
            System.out.print(i + " ");
        }
    }

    // �� �3 ����� 3
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
        System.out.println("� ������� " + count + " ������������� �����");
    }

    // �� �3 ����� 4
    private static void twelveRandomNumbers() {
        int[] arrEightNumbers = new int[12];
        for (int i = 0; i < arrEightNumbers.length; i++) {
            arrEightNumbers[i] = (int) (Math.random() * (11 - (-20))) + (-20);
        }
        System.out.println("������ : ");
        for (int i : arrEightNumbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arrEightNumbers.length; i++) {
            if (arrEightNumbers[i] < 0) {
                arrEightNumbers[i] = 0;
            }
        }
        System.out.println();
        System.out.println("������ � �������: ");
        for (int i : arrEightNumbers) {
            System.out.print(i + " ");
        }
    }
    // �� �3 ����� 5
    // ������ ��������� ����� User

    public static void main(String[] args) {
        // �� �3 ����� 1  ��������
        // array();

        // �� �3 ����� 2 ��������
        // sevenRandomNumbers();

        // �� �3 ����� 3 ��������
        //  eightRandomNumbers();

        // �� �3 ����� 4 ��������
        // twelveRandomNumbers();

        // �� �3 ����� 5 ��������
      /*  User [] users = new User[5];
        users[0] = new User("������", "����", 18);
        users[1] = new User("������", "����", 81);
        users[2] = new User("�������", "�����", 33);
        users[3] = new User("�������", "�����", 50);
        users[4] = new User("����������", "��������", 99);
        for (User u: users) {
            System.out.println(u);
        } */
    }
}
