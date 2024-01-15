package books;

import com.google.gson.*;
import java.io.*;

public class MainClass {
    public static void main(String[] arg) throws FileNotFoundException {
        String fileName = "C:\\Users\\Emumba\\Desktop\\NewBooks\\src\\main\\resources\\books.json";
        FileReader reader=new FileReader(fileName);
        Gson gson=new Gson();
        Books books=gson.fromJson(reader,Books.class);
        System.out.println(books.getTitle());
        System.out.println(books.getMetadata().getPrice());
        String jsonString=gson.toJson(books);
        System.out.println(jsonString);
    }
}