package HWFive.TasksFour;

public class Reader {
    private String fio;
    private String ticket;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fio, String ticket, String faculty, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.ticket = ticket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String booksCount(int numberOfBooks) {
        String[] books = {"книг", "книгу", "книги"};
        String result;
        if (numberOfBooks % 10 > 4 && numberOfBooks % 10 < 21 || numberOfBooks % 10 == 0) result = books[0];
        else if (numberOfBooks % 10 == 1 && numberOfBooks != 11) result = books[1];
        else if (numberOfBooks % 10 > 1 && numberOfBooks % 10 < 5 & !(numberOfBooks >= 11 && numberOfBooks <= 20))
            result = books[2];
        else result = books[0];
        return result;
    }

    //1
    public void takeBook(int numberOfBooks) {
        System.out.println(fio + " взял " + numberOfBooks + " " + booksCount(numberOfBooks));
    }

    //2
    public void takeBook(String... nameBooks) {
        System.out.print(fio + " взял " + booksCount(nameBooks.length) + " ");
        for (int i = 0; i < nameBooks.length; i++) {
            System.out.print(nameBooks[i]);
            if (i < nameBooks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    //3
    public void takeBook(Book... books) {
        System.out.print(fio + " взял " + booksCount(books.length) + " ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + ")");
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(". ");
    }

    //1
    public void returnBook(int numberOfBooks) {
        System.out.println(fio + " сдал " + numberOfBooks + " " + booksCount(numberOfBooks));
    }

    //2
    public void returnBook(String... nameBooks) {
        System.out.print(fio + " сдал " + booksCount(nameBooks.length) + " ");
        for (int i = 0; i < nameBooks.length; i++) {
            System.out.print(nameBooks[i]);
            if (i < nameBooks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    //3
    public void returnBook(Book... books) {
        System.out.print(fio + " сдал " + booksCount(books.length) + " ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + ")");
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(". ");
    }

    public static void main(String[] args) {
        Reader Oleg = new Reader("Oleg", "4", "ekonom", "23.10.2000", "375291234567");
        Reader Vasia = new Reader("Vasia", "16", "ekonom", "01.01.2000", "375297654321");
        Book one = new Book("Captain's daughter", "A. S. Pushkin");
        Book two = new Book("Hero of our time", "M. J. Lermontov");
        Book three = new Book("Life on borrowed time", "E. M. Remarque");
        Oleg.takeBook(2);
        Oleg.takeBook("Captain's daughter", "Hero of our time");
        Oleg.takeBook(one, two);
        Vasia.returnBook(1);
        Vasia.returnBook("Life on borrowed time");
        Vasia.returnBook(three);

    }

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
