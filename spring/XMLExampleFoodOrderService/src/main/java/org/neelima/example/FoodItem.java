package org.neelima.example;

public class FoodItem {
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display()
    {
        System.out.println(name+"...."+price);
    }
}
