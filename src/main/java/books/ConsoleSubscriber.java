package books;

public class ConsoleSubscriber implements Subscribers{
    @Override
    public void update(String title) {
        System.err.println(title);
    }
}
