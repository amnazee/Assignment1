package books;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private static List<Media> media = new ArrayList<>();
    public static void readFromJson() throws Exception {
        try (FileReader booksReader = new FileReader("C:\\Users\\Emumba\\Desktop\\NewBooks\\src\\main\\resources\\books.json");
             FileReader moviesReader = new FileReader("C:\\Users\\Emumba\\Desktop\\NewBooks\\src\\main\\resources\\movies.json")) {
             Gson gson = new Gson();
             Type booksType = new TypeToken<List<Books>>() {}.getType();
             List<Books> books=gson.fromJson(booksReader, booksType);
             media.addAll(books);
             Type moviesType = new TypeToken<List<Books>>() {}.getType();
             List<Movies> movies=gson.fromJson(moviesReader, moviesType);
             media.addAll(movies);
        }
    }

    public void add(Media newMedia, String message){
        media.add(newMedia);
        Publisher.notifySubscribers(message);
//        System.out.println("Media added successfully");
    }

    public void remove(Media oldMedia, String message){
        media.remove(oldMedia);
        Publisher.notifySubscribers(message);
//        System.out.println("Media removed successfully");
    }
}