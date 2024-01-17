package books;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Movies extends Media {
    private String title;
    private String writer;
    private Metadata metadata;

    public Movies(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public void updatePrice(int price) {
        System.out.println("Update Price");
        metadata.setPrice(price);
    }

    @Override
    public String writeToJson(Media mediaObject) {
        String json=new Gson().toJson(mediaObject);
        return json;
    }

    public static class Metadata{
        private int price;
        private String[] categories;
        private String director;

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

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }
    }
}
