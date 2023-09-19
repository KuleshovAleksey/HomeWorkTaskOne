public class Four {


    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone(222222222, "SamsungS23");
        Phone phone3 = new Phone(333333333, "Nokia3310", 200);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("����");
        phone2.receiveCall("����");
        phone3.receiveCall("����");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receivePhoneCall("����", 123456789);
        phone1.receivePhoneCall("ϸ��", 987654321);
        phone1.receivePhoneCall("����������", 555555555);

        String[] numbers = {"123456789", "987654321", "555555555"};

        phone1.sendMessages(numbers);
        phone2.sendMessages(numbers);
        phone3.sendMessages(numbers);
    }
}
