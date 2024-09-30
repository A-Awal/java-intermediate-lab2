package org.example.design_patterns.observer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WeatherStation implements Publisher {
    private Set<Subscriber> subscribers = new LinkedHashSet<>();

    public void addSubscribers(Subscriber subscriber) {
        subscriber.addPublisher(this);
        subscribers.add(subscriber);
    }
    public void removeSubscribers(Subscriber subscriber) {
        subscriber.removePublisher(this);
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(EventArgs message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(message);
        }
    }
}
