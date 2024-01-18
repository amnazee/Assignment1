package books;

public class MainClass {
    public static void main(String[] args) {
        Books newBook= new Books();
        Subscribers consoleSubscribers=new ConsoleSubscriber();
        Subscribers fileSubscribers=new FileSubscriber();
        newBook.setTitle("New Book 3");
        consoleSubscribers.update(newBook.getTitle());
        fileSubscribers.update(newBook.getTitle());
        Publisher publisher=new Publisher();
        publisher.addSubscribers(consoleSubscribers);
        publisher.removeSubscribers(consoleSubscribers);
    }
}