package org.example.design_patterns.observer;

public class SecondSubscriber implements Subscriber<Publisher> {
    Publisher _publisher;
    @Override
    public void notify(EventArgs eventArgs) {
        System.out.println(eventArgs.message() + " 2");
    }

    @Override
    public void addPublisher(Publisher publisher) {
        _publisher = publisher;
    }

    @Override
    public void removePublisher(Publisher publisher) {
        _publisher = null;
    }
}
