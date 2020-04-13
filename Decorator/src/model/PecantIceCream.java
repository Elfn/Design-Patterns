package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

/**
 * Created by Elimane on Apr, 2020, at 19:50
 */
public class PecantIceCream extends IceCreamDecorator {
    public PecantIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 15.0 + super.cost();
    }
}
