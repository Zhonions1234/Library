public class Books {
    private int idBooks;
    private String nameBook;
    private String author;
    private String publish;
    private int idBooksRequest;

    public Books(int idBooks, String nameBook, String author, String publish, int idBooksRequest) {
        this.idBooks = idBooks;
        this.nameBook = nameBook;
        this.author = author;
        this.publish = publish;
        this.idBooksRequest = idBooksRequest;
    }

    public static void showBooks() {

    }
}
