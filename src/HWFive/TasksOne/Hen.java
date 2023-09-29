package HWFive.TasksOne;

public abstract class Hen {

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "� ������.";
    }
}

class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " ��� ������ - ������. � ���� " +
                getCountOfEggsPerMonth() + " ��� � �����.";
    }
}

class FinlandHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - ���������. � ���� " +
                getCountOfEggsPerMonth() + " ��� � �����.";
    }
}

class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - �������. � ���� " +
                getCountOfEggsPerMonth() + " ��� � �����.";
    }
}

class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - ��������. � ���� " +
                getCountOfEggsPerMonth() + " ��� � �����.";
    }
}

class HenFactory {
    public static Hen getHen(String country) {
        Hen hen = null;

        if (country.equals("������")) {
            hen = new RussianHen();
        } else if (country.equals("���������")) {
            hen = new FinlandHen();
        } else if (country.equals("�������")) {
            hen = new MoldovanHen();
        } else if (country.equals("��������")) {
            hen = new BelarusianHen();
        }
        return hen;
    }

    public static void main(String[] args) {
        System.out.println(getHen("��������").getDescription()); // �������� ����������
    }
}
