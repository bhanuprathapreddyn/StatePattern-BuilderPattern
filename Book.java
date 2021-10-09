package StatePatternAndBuilderPattern;

class Book implements BookState {

    public String title;
    public String author;
    public String edition;
    public  String publisher;
    public String bookType;
    public String isbn;
    public String serialNumber;
    public BookState currentState;

    public Book(String title, String author, String edition, String publisher, String bookType, String isbn, String serialNumber, BookState currentState) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.bookType = bookType;
        this.isbn = isbn;
        this.serialNumber = serialNumber;
        this.currentState = new Available();
    }


//    public Book(String title) {
//        this.title = title;
//        currentState = new Available();
//    }

    public void setState(BookState state) {
        this.currentState = state;
    }

   public void issue(Book book) {

        this.currentState.issue(this);
    }

    public void returnBook(Book book) {
        this.currentState.returnBook(this);

    }

    public void reserve(Book book) {

        this.currentState.reserve(this);
    }
}