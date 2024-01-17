package books;

import java.util.Comparator;
import java.util.List;

public class BookProcessor {
    public void DisplayDetails(List<Books> booksList){
        booksList.forEach(System.out::println);
    }
    public void displayBooksByAuthor(List<Books> booksList,String authorName) {
        booksList.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName))
                .forEach(books -> {
                    System.out.println(books.getTitle());
                });
    }
    public void TitleWithHighPrice(List<Books> booksList){
        booksList.stream().max(Comparator.comparing
                (books -> books.getMetadata().getPrice()));
    }
}