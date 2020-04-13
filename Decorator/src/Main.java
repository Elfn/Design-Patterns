import interfaces.IceCream;
import model.BasicIceCream;
import model.ChocolateIceCream;
import model.MintIceCream;
import model.PecantIceCream;

/**
 * Created by Elimane on Apr, 2020, at 19:40
 */
/**
 * @Decorator_Pattern is a design pattern that allows behavior to be added to an individual object, dynamically,
 * without affecting the behavior of other objects from the same class, The decorator pattern is often useful for adhering to the Single Responsibility Principle,
 * as it allows functionality to be divided between classes with unique areas of concern
 *
 * @Pros => * Decorators provide a flexible alternative to subclassing for extending functionality
 *          * Decorators allow behavior modification at runtime rather than going back into existing code and making changes
 *          * Decorators are a nice solution to permutation issues because you can wrap a component with any number of decorators
 *          * The decorator pattern supports the principle that classes should be open for extension but closed for modification
 *
 * @Cons => * Decorators can result in many small objects in our design, and overuse can be complex
 *          * Decorators can cause issues if the client relies heavily on the components concrete type
 *          * Decorators can complicate the process of instantiating the component because you not only have to instantiate the component but wrap it in a number of decorators
 *          * It can be complicated to have decorators keep track of other decorators because to look back into multiple layers of the decorator chain starts to push the decorator pattern beyond its true intent
 */
public class Main {
    public static void main(String[] args)
    {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cream cost => "+basicIceCream.cost());

        MintIceCream mintIceCream = new MintIceCream(basicIceCream);
        System.out.println("Mint Ice-Cream cost => "+mintIceCream.cost());

        ChocolateIceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        System.out.println("Chocolate Ice-Cream cost => "+chocolateIceCream.cost());

        PecantIceCream pecantIceCream = new PecantIceCream(chocolateIceCream);//Wrapping chocolate in pecant
        System.out.println("Pecan Ice-Cream cost => "+pecantIceCream.cost());


    }
}
