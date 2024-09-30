package org.example.design_patterns.factory_method;

import java.util.ArrayList;
import java.util.List;

public class DatabaseContext {
    private List<Entity> data = new ArrayList<Entity>();

    public void setData(List<Entity> data) {
        this.data = data;
    }
    public List<Entity> getAll() {
        return data;
    }
    public void add(Entity entity) {
        data.add(entity);
    }
    public void remove(Entity entity) {
        data.remove(entity);
    }
    public Entity get(String name) {
        return data.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }
}
