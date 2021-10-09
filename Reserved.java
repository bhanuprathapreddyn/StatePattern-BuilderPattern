package StatePatternAndBuilderPattern;

public class Reserved implements BookState {
    public void issue(Book book) {
        book.setState(new Issued());
        System.out.println(book.title + "book issued successfully.");
    }

    public void returnBook(Book book) {
        System.out.println(book.title +" book is not issued yet. You have to get it issued first to return.");
    }

    public void reserve(Book book) {
        System.out.println(book.title +" book is already reserved.");
    }
}
