public class One {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static byte sum(byte a, byte b) {
        return (byte) (a + b);
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static short sum(short a, short b) {
        return (short) (a + b);
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static float difference(float a, float b) {
        return a - b;
    }

    public static byte difference(byte a, byte b) {
        return (byte) (a - b);
    }

    public static long difference(long a, long b) {
        return a - b;
    }

    public static short difference(short a, short b) {
        return (short) (a - b);
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static float multiplication(float a, float b) {
        return a * b;
    }

    public static byte multiplication(byte a, byte b) {
        return (byte) (a * b);
    }

    public static long multiplication(long a, long b) {
        return a * b;
    }

    public static short multiplication(short a, short b) {
        return (short) (a * b);
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static float division(float a, float b) {
        return a / b;
    }

    public static byte division(byte a, byte b) {
        return (byte) (a / b);
    }

    public static long division(long a, long b) {
        return a / b;
    }

    public static short division(short a, short b) {
        return (short) (a / b);
    }


    public static void main(String[] args) {
        // Решиние пункта 1 задания 1 (с перебором разных типов данных)
        System.out.println("sum " + sum(4.2, 5));
        System.out.println("sum " + sum(4, 5));
        System.out.println("sum " + sum((byte) 3, (byte) 125));
        System.out.println("sum " + sum(21l, 2335l));
        System.out.println("sum " + sum(2.3f, 23335f));
        System.out.println("sum " + sum((short) 2, (short) 25));
        System.out.println("difference " + difference(4.2, 5));
        System.out.println("difference " + difference(4, 5));
        System.out.println("difference " + difference((byte) 3, (byte) 125));
        System.out.println("difference " + difference(21l, 2335l));
        System.out.println("difference " + difference(2.3f, 23335f));
        System.out.println("difference " + difference((short) 2, (short) 25));
        System.out.println("multiplication " + multiplication(4.2, 5));
        System.out.println("multiplication " + multiplication(4, 5));
        System.out.println("multiplication " + multiplication((byte) 3, (byte) 125));
        System.out.println("multiplication " + multiplication(21l, 2335l));
        System.out.println("multiplication " + multiplication(2.3f, 23335f));
        System.out.println("multiplication " + multiplication((short) 2, (short) 25));
        System.out.println("division " + division(4.2, 5));
        System.out.println("division " + division(4, 5));
        System.out.println("division " + division((byte) 3, (byte) 125));
        System.out.println("division " + division(21l, 2335l));
        System.out.println("division " + division(2.3f, 23335f));
        System.out.println("division " + division((short) 2, (short) 25));

        // Решение пункта 2 ( ax + b = 0.
        double a = -4;
        double b = 15;
        if (a == 0 && b != 0) {
            System.out.println("линейное уравнение с одной переменной корней не имеет вообще");
        } else if (a == 0 && b == 0) {
            System.out.println("корней у уравнения бесконечное множество");
        } else
            System.out.println("Рещением линейного уравнения " + a + "x + " + b + " = 0 равно " + -b / a);


    }

}
