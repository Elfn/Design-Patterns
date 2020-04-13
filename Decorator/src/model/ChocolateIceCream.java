package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

/**
 * Created by Elimane on Apr, 2020, at 19:49
 */
public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 12.0 + super.cost();
    }
}
