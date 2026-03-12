package List;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse");
        cart.set(1,"Mechanical keyboard");
        System.out.println("Cart items : "+cart);
        System.out.println("total items : "+cart.size());
    }
}
