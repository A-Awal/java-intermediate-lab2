package org.example.design_patterns.observer;

public class Application {
    public static void main(String[] args) {
        FirstSubscriber firstSubscriber = new FirstSubscriber();
        SecondSubscriber secondSubscriber = new SecondSubscriber();

        Publisher publisher = new WeatherStation();
        publisher.addSubscribers(firstSubscriber);
        publisher.addSubscribers(secondSubscriber);

        publisher.notifySubscribers(new EventArgs("Hello"));

        publisher.removeSubscribers(firstSubscriber);

        publisher.notifySubscribers(new EventArgs("world"));

    }
}
