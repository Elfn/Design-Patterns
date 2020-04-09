import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;

/**
 * Created by Elimane on Apr, 2020, at 07:11
 */

/**
 * PATTERN => Strategy
 * Utlity => Create several algorithm families and make them interchangeable according to client
 * Advantages =>  Scalable architecture
 * Cons => Too much interfaces in the code [For devs]
 */
public class Main {
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product(120,"4444");
        Product p2 = new Product(420,"4554");
        Product p3 = new Product(600,"6000");

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        //Payment decision
        cart.pay(new PaypalAlgorithm("eli@test.com","1234"));


        cart.pay(new CreditCardAlgorithm("eli","1234-2343-2223-5654"));


    }
}
