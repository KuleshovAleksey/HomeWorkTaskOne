package HWFive.TasksFour;

public class Reader {
    private String fio;
    private String ticket;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;

    public Reader() {
        this.fio = fio;
        this.ticket = ticket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {
    }

    public String books(int numberOfBooks) {
        String[] books = {" книг", " книгу", " книги"};
        String result = null;
        if (numberOfBooks % 10 > 4 && numberOfBooks % 10 < 21 || numberOfBooks % 10 == 0) result = books[0];
        else if (numberOfBooks % 10 == 1 && numberOfBooks != 11) result = books[1];
        else if (numberOfBooks % 10 > 1 && numberOfBooks % 10 < 5 & !(numberOfBooks >= 11 && numberOfBooks <= 20))
            result = books[2];
        else result = books[0];
        return result;
    }

    public void takeBook(String fio, int numberOfBooks) {
        System.out.println(fio + " взял " + numberOfBooks + books(numberOfBooks));
    }

    public void takeBook(int numberOfBooks, String[] nameBooks) {

        System.out.println(fio + " int numberOfBooks");
    }

    public void returnBook() {
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        for (int i = 0; i < 101; i++) {
            reader.takeBook("asd", i);
        }

    }
}
