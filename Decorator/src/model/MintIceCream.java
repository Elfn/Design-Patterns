package model;

import interfaces.IceCream;
import interfaces.IceCreamDecorator;

/**
 * Created by Elimane on Apr, 2020, at 19:50
 */
public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 10.0 + super.cost();
    }
}
