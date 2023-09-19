public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("������ " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receivePhoneCall(String name, int number) {
        System.out.println("������ " + name + " � ������ " + number);
    }

    public void sendMessages(String[] numbers) {
        if (numbers != null && numbers.length > 0) {
            for (String number : numbers) {
                System.out.println("�� ����� " + number + " ���� ���������� ��������� � ������ " + this.number);
            }
        } else {
            System.out.println("������ ������ ��� ����� null.");
        }
    }
}
