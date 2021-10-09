package StatePatternAndBuilderPattern;

public class BookBuilder implements BookState{
    private String title;
    private String author;
    private String edition;
    private  String publisher;
    private String bookType;
    private String isbn;
    private String serialNumber;
    BookState currentState;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public BookBuilder setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BookBuilder setBookType(String bookType) {
        this.bookType = bookType;
        return this;
    }

    public BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public BookBuilder setCurrentState(BookState currentState) {
        this.currentState = currentState;
        return this;
    }

    @Override
    public void issue(Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }

    @Override
    public void reserve(Book book) {

    }

    public Book getBook(){
        return new Book(title,  author,  edition,  publisher,  bookType,  isbn,  serialNumber, currentState);
        }
}
