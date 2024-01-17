package books;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AudioBook extends Media{
    private String title;
    private String author;
    private Metadata metadata;

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

    public AudioBook(){
    }

    @Override
    public void updatePrice(int price) {
//        System.out.println("Update Price");
        metadata.setPrice(price);
    }

    @Override
    public String writeToJson(Media mediaObject) {
     String json=new Gson().toJson(mediaObject);
        return json;
    }
    public static class Metadata {
        private int price;
        private String[] categories;
        private String hostedBy;
        private int runtime;

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

        public String getHostedBy() {
            return hostedBy;
        }

        public void setHostedBy(String hostedBy) {
            this.hostedBy = hostedBy;
        }

        public int getRuntime() {
            return runtime;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }
    }
}
