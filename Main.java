
package StatePatternAndBuilderPattern;

public class Main {

    public static void main(String[] args) {

// Build books
        Book b1 = new BookBuilder()
                .setTitle("Head First Design Pattern")
                .getBook();
        Book b2 = new BookBuilder()
                .setTitle("Head First Java")
                .setEdition("First")
                .getBook();
        Book b3 = new BookBuilder()
                .setTitle("Algorithm Design")
                .setEdition("Second")
                        .getBook();
// Actions
        b1.returnBook(b1);
        b1.issue(b2);
        b2.issue(b2);
        b3.reserve(b3);
        b3.issue(b3);
        b2.returnBook(b2);
        b1.reserve(b1);
        b1.issue(b1);


    }


}

