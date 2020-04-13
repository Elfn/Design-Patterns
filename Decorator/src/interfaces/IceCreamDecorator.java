package interfaces;

/**
 * Created by Elimane on Apr, 2020, at 19:44
 */
public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
