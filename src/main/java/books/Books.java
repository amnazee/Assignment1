package books;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Books extends Media{
    private String title;
    private String author;
    private Metadata metadata;

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public void updatePrice(int price) {
        System.out.println("Update Price");
        metadata.setPrice(price);
    }

    @Override
    public String writeToJson(Media mediaToAppend) {
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       String json= gson.toJson(mediaToAppend);
       return json;
    }

    public static class Metadata {
        private int price;
        private String[] categories;
        private String isbn;
        private int pages;

        public Metadata() {
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String[] getCategories() {
            return categories;
        }

        public void setCategories(String[] categories) {
            this.categories = categories;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
}

