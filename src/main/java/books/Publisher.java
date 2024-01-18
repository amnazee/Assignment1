package books;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private static final List<Subscribers> subscribers=new ArrayList<>();

    public void addSubscribers(Subscribers subscribers1) {
        subscribers.add(subscribers1);
        System.out.println("Subscriber Added");
    }

    public void removeSubscribers(Subscribers subscribers1){
        subscribers.remove(subscribers1);
        System.out.println("Subscribers Removed");
    }

    public static void notifySubscribers(String msg){
        for(Subscribers subscribers1:subscribers){
            subscribers1.update(msg);
        }
    }
}
