package org.neelima.example;
import org.neelima.example.FoodItem;

import java.util.List;

public class OrderService {

    private List<FoodItem> items;

    //setter injection
    public void setItems(List<FoodItem> items) {
        this.items = items;
    }

    // constructor injection
    public OrderService(List<FoodItem> items)
    {
        this.items = items;
    }

    public void calculate()
    {
        int tot=0;
        for(FoodItem i:items)
        {
            i.display();
            tot+=i.getPrice();

        }
        System.out.println("Total Bill:" +tot);
    }
}
