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
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receivePhoneCall(String name, int number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessages(String[] numbers) {
        if (numbers != null && numbers.length > 0) {
            for (String number : numbers) {
                System.out.println("На номер " + number + " было отправлено сообщение с номера " + this.number);
            }
        } else {
            System.out.println("Массив пустой или равен null.");
        }
    }
}
