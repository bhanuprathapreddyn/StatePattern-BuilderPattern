package StatePatternAndBuilderPattern;

public class BookBasicDetails {
   private final String author;
   private final String edition;
    private final String publisher;
    private final  String bookType;


    public String getEdition() {
        return edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookType() {
        return bookType;
    }


    public String getAuthor() {
        return author;
    }

    private BookBasicDetails(Builder builder){
        this.author = builder.author;
        this.edition = builder.edition;
        this.publisher = builder.publisher;
        this.bookType = builder.bookType;

    }

    public static class Builder{
        private String author;
        private String edition;
        private String publisher;
        private String bookType;

        public Builder author(final String author){
            this.author = author;
            return this;
        }
        public Builder edition(final String edition){
            this.edition = edition;
            return this;
        }
        public Builder publisher(final String publisher){
            this.publisher = publisher;
            return this;
        }
        public Builder bookType(final String bookType){
            this.bookType = bookType;
            return this;
        }
        public BookBasicDetails build(){
            return new BookBasicDetails(this);
        }
    }
}
