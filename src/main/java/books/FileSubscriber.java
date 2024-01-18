package books;

import java.io.FileWriter;
import java.io.IOException;

public class FileSubscriber implements Subscribers{
    @Override
    public void update(String title) {
        try {
            String filename = "file_" +title + ".json";
            FileWriter writer = new FileWriter(filename);
            writer.write(title);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}