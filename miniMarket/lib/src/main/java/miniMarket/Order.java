package miniMarket;

import java.util.ArrayList;

public class Order {
    
    ArrayList<Product> list; 

    public Order(){
        list = new ArrayList<Product>();
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void addToList(Product product, int quantity){
        for (int index = 0; index < quantity; index++) {
            list.add(product);
        }
    }
}
