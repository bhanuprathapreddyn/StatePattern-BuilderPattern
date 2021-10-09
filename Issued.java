package StatePatternAndBuilderPattern;

class Issued implements BookState {
    public void issue(Book book) {
        System.out.println(book.title +" Book is already issued.");

    }

    public void returnBook(Book book) {
        book.setState(new Available());
        System.out.println(book.title +" Book returned successfully.");

    }

    public void reserve(Book book) {
        System.out.println(book.title +" Cannot reserve when it has been issued.");

    }
}