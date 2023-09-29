package HWFive.TasksOne;

public abstract class Hen {

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курица.";
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
                " Моя страна - Россия. Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class FinlandHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Финляндия. Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Молдова. Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Беларусь. Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class HenFactory {
    public static Hen getHen(String country) {
        Hen hen = null;

        if (country.equals("Россия")) {
            hen = new RussianHen();
        } else if (country.equals("Финляндия")) {
            hen = new FinlandHen();
        } else if (country.equals("Молдова")) {
            hen = new MoldovanHen();
        } else if (country.equals("Беларусь")) {
            hen = new BelarusianHen();
        }
        return hen;
    }

    public static void main(String[] args) {
        System.out.println(getHen("Беларусь").getDescription()); // проверка реализации
    }
}
