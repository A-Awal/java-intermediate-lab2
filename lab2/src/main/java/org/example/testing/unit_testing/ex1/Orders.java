package org.example.testing.unit_testing.ex1;

import jakarta.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer id;
    private  Long quantity;
    public Orders() {}

    public Orders(long quantity){
        this.quantity = quantity;
    }
    public int getId(){
        return id;
    }
    public long getQuantity(){
        return quantity;
    }
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }
    public void setId(int itemeId){
        this.id = itemeId;
    }
}
