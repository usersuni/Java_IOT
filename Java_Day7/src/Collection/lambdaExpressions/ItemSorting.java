package Collection.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}


    public class ItemSorting {
        public static void main(String[] args) {
            ArrayList<Product> list = new ArrayList<>();
            list.add(new Product("Mobile",20000,10));
            list.add(new Product("Camera",500000,2));
            list.add(new Product("LapTop",60000,3));
            for(Product p : list){
                System.out.println(p.name + "," + p.price + "," + p.quantity);
            }
            System.out.println();

            System.out.println("After Sorting based on quantity");
            System.out.println();
            Collections.sort(list,(p1,p2) -> p1.quantity-p2.quantity);
            for(Product p : list){
                System.out.println(p.name + "," + p.price + "," + p.quantity);
            }
        }
}
