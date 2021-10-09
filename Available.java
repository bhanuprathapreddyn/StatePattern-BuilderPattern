package StatePatternAndBuilderPattern;

class Available implements BookState {

    public void issue(Book book) {
        book.setState(new Issued());
        System.out.println(book.title +" book issued successfully.");
    }

    public void returnBook(Book book) {
        System.out.println(book.title +" book is not issued yet. You have to get it issued first to return.");
    }

    public void reserve(Book book) {
        book.setState(new Reserved());
        System.out.println(book.title +" Book reserved successfully.");

    }
}