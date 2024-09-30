package org.example.design_patterns.facade;

import java.util.Collection;

public class InventoryService {
    public void checkInventory(Collection<Object> items) {
        System.out.println("Has enough to fulfill order");
    }
}
