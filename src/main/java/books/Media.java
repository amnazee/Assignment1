package books;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.List;

public abstract class Media {

    public abstract void updatePrice(int price);

    public abstract String writeToJson(Media mediaObject);
}