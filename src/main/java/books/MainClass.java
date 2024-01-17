package books;

public class MainClass {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        book1.setMetadata(new Books.Metadata());
        book1.getMetadata().setPrice(25);
        System.out.println(book1.writeToJson(book1));
    }
}