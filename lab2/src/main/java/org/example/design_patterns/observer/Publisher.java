package org.example.design_patterns.observer;

public interface Publisher {
    void addSubscribers(Subscriber subscriber);
    void removeSubscribers(Subscriber subscriber);
    void notifySubscribers(EventArgs eventArgs);
}
