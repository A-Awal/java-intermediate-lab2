package org.example.design_patterns.observer;

import java.util.concurrent.Flow;

public interface Subscriber<P> {
    public void notify(EventArgs eventArgs);
    public void addPublisher(P publisher);
    public void removePublisher(P publisher);
}
